<template >
    <div  style="width:95%;text-align: left;border:1px solid #EBEEF5;border-radius: 4px;padding: 9px">
        <!--    搜索-->
        <div>
            <el-form :inline="true" :model="formInline" class="demo-form-inline">
                <el-form-item label="查询条件">
                    <el-input v-model="formInline.user" placeholder="查询条件"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="onSubmit" icon="el-icon-search" round>查询</el-button>
                </el-form-item>
            </el-form>
            <div style="float: right;margin-top: -60px">
                <el-button type="primary" @click="dialogFormVisible = true" round>新增</el-button>
                <el-button type="danger" round>删除</el-button>
            </div>
        </div>
        <!--    表格-->
        <div>
            <el-table :data="tableData" border  width="100%"  @selection-change="handleSelectionChange">
                <el-table-column type="selection" width="55">
                </el-table-column>
                <el-table-column  prop="date" label="名称" min-width="10%">
                </el-table-column>
                <el-table-column prop="name" label="说明" min-width="10%">
                </el-table-column>
                <el-table-column prop="zip" label="创建日期" min-width="10%">
                </el-table-column>
                <el-table-column  label="操作" width="170px">
                    <template >
                        <el-button type="warning" @click="dialogFormVisibleRole = true" icon="el-icon-edit-outline" circle></el-button>
                        <el-button type="primary" @click="dialogFormVisible = true" icon="el-icon-edit" circle ></el-button>
                        <el-button type="danger" icon="el-icon-delete" circle></el-button>
                    </template>
                </el-table-column>
            </el-table>
        </div>
        <!--        分页-->
        <div style="margin-top: 20px;text-align: center">
            <el-pagination
                    background
                    layout="prev, pager, next"
                    :total="1000">
            </el-pagination>
        </div>
        <!--    添加-->
        <el-dialog title="添加角色" :visible.sync="dialogFormVisible"  :close-on-click-modal="false">

            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <el-form-item label="名称" prop="name">
                    <el-input v-model="ruleForm.name"></el-input>
                </el-form-item>
                <el-form-item label="说明" prop="name">
                    <el-input v-model="ruleForm.name"></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
                <el-button @click="dialogFormVisible = false">取 消</el-button>
            </div>
        </el-dialog>

        <el-dialog title="添加角色" :visible.sync="dialogFormVisibleRole"  :close-on-click-modal="false">

            <div class="custom-tree-container">
                <div class="block">
                    <p>使用 scoped slot</p>
                    <el-tree
                            :data="data"
                            show-checkbox
                            node-key="id"
                            default-expand-all
                            :expand-on-click-node="false">
                          <span class="custom-tree-node" slot-scope="{ node, data }">
                            <span>{{ node.label }}</span>
                            <span>
                              <el-button
                                      type="text"
                                      size="mini"
                                      @click="() => append(data)">
                                Append
                              </el-button>
                              <el-button
                                      type="text"
                                      size="mini"
                                      @click="() => remove(node, data)">
                                Delete
                              </el-button>
                            </span>
                          </span>
                    </el-tree>
                </div>
            </div>
            <div slot="footer" class="dialog-footer">
                <el-button type="primary" @click="dialogFormVisibleRole = false">确 定</el-button>
                <el-button @click="dialogFormVisibleRole = false">取 消</el-button>
            </div>
        </el-dialog>


    </div>
</template>

<script>

    let id = 1000;
    export default {

        name: "role",
        methods: {
            handleSelectionChange(val) {
                this.multipleSelection = val;
                console.log(val)
            },
            onSubmit() {
                console.log('submit!');
            },
            append(data) {
                const newChild = { id: id++, label: 'testtest', children: [] };
                if (!data.children) {
                    this.$set(data, 'children', []);
                }
                data.children.push(newChild);
            },

            remove(node, data) {
                const parent = node.parent;
                const children = parent.data.children || parent.data;
                const index = children.findIndex(d => d.id === data.id);
                children.splice(index, 1);
            },

          //   renderContent(h, { node, data, store }) {
          //   //     return (
          //   //         <span class="custom-tree-node">
          //   //         <span>{node.label}</span>
          //   //         <span>
          //   //         <el-button size="mini" type="text" on-click={ () => this.append(data) }>Append</el-button>
          //   //     <el-button size="mini" type="text" on-click={ () => this.remove(node, data) }>Delete</el-button>
          //   //     </span>
          //   //     </span>);
          // }


        },

        data() {
            const data = [{
                id: 1,
                label: '一级 1',
                children: [{
                    id: 4,
                    label: '二级 1-1',
                    children: [{
                        id: 9,
                        label: '三级 1-1-1'
                    }, {
                        id: 10,
                        label: '三级 1-1-2'
                    }]
                }]
            }, {
                id: 2,
                label: '一级 2',
                children: [{
                    id: 5,
                    label: '二级 2-1'
                }, {
                    id: 6,
                    label: '二级 2-2'
                }]
            }, {
                id: 3,
                label: '一级 3',
                children: [{
                    id: 7,
                    label: '二级 3-1'
                }, {
                    id: 8,
                    label: '二级 3-2'
                }]
            }];

            return {
                dialogFormVisible:false,
                dialogFormVisibleRole:false,
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1518 弄',
                    zip: 200333
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1517 弄',
                    zip: 200333
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1519 弄',
                    zip: 200333
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1516 弄',
                    zip: 200333
                }],
                multipleSelection: [],
                formInline: {
                    user: '',
                    region: ''
                },
                ruleForm: {
                    name: '',
                    region: '',
                    date1: '',
                    date2: '',
                    delivery: false,
                    type: [],
                    resource: '',
                    desc: ''
                },
                rules: {
                    name: [
                        { required: true, message: '请输入活动名称', trigger: 'blur' },
                        { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
                    ]
                },
                data: JSON.parse(JSON.stringify(data)),


            }
        }
    }
</script>

<style scoped>
    .custom-tree-node {
        flex: 1;
        display: flex;
        align-items: center;
        justify-content: space-between;
        font-size: 14px;
        padding-right: 8px;
    }
</style>




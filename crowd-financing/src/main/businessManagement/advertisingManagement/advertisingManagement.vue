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
                <el-table-column  prop="date" label="广告描述" min-width="10%">
                </el-table-column>
                <el-table-column prop="name" label="说明" min-width="10%">
                </el-table-column>
                <el-table-column prop="zip" label="	状态" min-width="10%">
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
        <el-dialog title="添加用户" :visible.sync="dialogFormVisible"  :close-on-click-modal="false">

            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <el-form-item label="账号" prop="name">
                    <el-input v-model="ruleForm.name"></el-input>
                </el-form-item>
                <el-form-item label="密码" prop="name">
                    <el-input v-model="ruleForm.name"></el-input>
                </el-form-item>
                <el-form-item label="姓名" prop="name">
                    <el-input v-model="ruleForm.name"></el-input>
                </el-form-item>
                <el-form-item label="邮箱" prop="name">
                    <el-input v-model="ruleForm.name"></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
                <el-button @click="dialogFormVisible = false">取 消</el-button>
            </div>
        </el-dialog>
        <!--    分配权限-->
        <el-dialog title="分配权限" :visible.sync="dialogFormVisibleRole"  :close-on-click-modal="false">
            <template>
                <el-transfer :titles="['未分配权限', '已分配权限']"
                             filterable
                             :filter-method="filterMethod"
                             filter-placeholder="请输入权限拼音"
                             v-model="value"
                             :data="data">
                </el-transfer>
            </template>
            <div slot="footer" class="dialog-footer">
                <el-button type="primary" @click="dialogFormVisibleRole = false">确 定</el-button>
                <el-button @click="dialogFormVisibleRole = false">取 消</el-button>
            </div>
        </el-dialog>

    </div>
</template>

<script>


    export default {

        name: "advertisingManagement",
        methods: {
            handleSelectionChange(val) {
                this.multipleSelection = val;
                console.log(val)
            },
            onSubmit() {
                console.log('submit!');
            },

        },

        data() {
            // eslint-disable-next-line no-unused-vars
            const generateData = _ => {
                const data = [];
                const cities = ['上海', '北京', '广州', '深圳', '南京', '西安', '成都'];
                const pinyin = ['shanghai', 'beijing', 'guangzhou', 'shenzhen', 'nanjing', 'xian', 'chengdu'];
                cities.forEach((city, index) => {
                    data.push({
                        label: city,
                        key: index,
                        pinyin: pinyin[index]
                    });
                });
                return data;
            };


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
                data: generateData(),
                value: [],
                filterMethod(query, item) {
                    return item.pinyin.indexOf(query) > -1;
                }

            }
        }
    }
</script>

<style scoped>

</style>

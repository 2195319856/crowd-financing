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
                <el-table-column prop="name" label="商业公司" min-width="10%">
                </el-table-column>
                <el-table-column prop="name" label="个体工商户" min-width="10%">
                </el-table-column>
                <el-table-column prop="name" label="个人经营" min-width="10%">
                </el-table-column>
                <el-table-column prop="name" label="政府及非营利组织" min-width="10%">
                </el-table-column>
                <el-table-column  label="操作" width="170px">
                    <template >
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


    </div>
</template>

<script>

    export default {

        name: "classifiedManagement",
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




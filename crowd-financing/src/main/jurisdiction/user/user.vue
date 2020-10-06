<template >
    <div  style="width:95%;text-align: left;border:1px solid #EBEEF5;border-radius: 4px;padding: 9px">
        <div style="margin: -9px">

            <el-tag style="width: 100%;height:50px;font-size: 24px;line-height: 50px" > <i class="el-icon-user"></i>用户维护</el-tag>
        </div>
<!--    搜索-->
        <div style="margin-top: 29px">
            <el-form :inline="true" :model="formInline"
                     lass="demo-form-inline">
                <el-form-item label="姓名">
                    <el-input v-model="formInline.user" placeholder="请输入"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="selectKey" icon="el-icon-search" round>查询</el-button>
                </el-form-item>
            </el-form>
            <div style="float: right;margin-top: -60px">
                <el-button type="primary" @click="addDialogFormVisible=true" round>新增</el-button>
                <el-button type="danger" @click="deleteIdsAdmin" round>删除</el-button>
            </div>
        </div>
<!--    表格-->
        <div>
            <el-table :data="admin.list" border   width="100%"  @selection-change="handleSelectionChange">
                <el-table-column
                        type="index"
                        :index="indexMethod">
                </el-table-column>
                <el-table-column type="selection" width="55">
                </el-table-column>
                <el-table-column  prop="loginacct" label="账号" min-width="10%">
                </el-table-column>
                <el-table-column prop="username" label="姓名" min-width="10%">
                </el-table-column>
                <el-table-column prop="email" label="邮编" min-width="10%">
                </el-table-column>
                <el-table-column prop="createtime" label="创建日期" min-width="10%">
                </el-table-column>
                <el-table-column   label="操作" width="170px">
                    <template slot-scope="scope">
                        <el-button type="warning" @click="dialogFormVisibleRole = true" icon="el-icon-edit-outline" circle></el-button>
                        <el-button type="primary"  @click="selectByAdmin(scope.row)"   icon="el-icon-edit" circle ></el-button>
                        <el-button type="danger" @click="deleteAdmin(scope.row)" icon="el-icon-delete" circle></el-button>
                    </template>
                </el-table-column>
            </el-table>
        </div>
<!--        分页-->
        <div style="margin-top: 20px;text-align: center">
            <el-pagination
                    background
                    layout="prev, pager, next"
                    :total="admin.total" :page-size="admin.pageSize" @current-change="findAdmin">
            </el-pagination>
        </div>
        <!--    添加-->
        <el-dialog title="添加用户" @close="clearItemFalse" :visible.sync="addDialogFormVisible"  :close-on-click-modal="false">

            <el-form  :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <el-form-item label="账号" prop="name">
                    <el-input v-model="item.loginacct" ></el-input>
                </el-form-item>
                <el-form-item label="密码" prop="name">
                    <el-input v-model="item.password" ></el-input>
                </el-form-item>
                <el-form-item label="姓名" prop="name">
                    <el-input v-model="item.username" ></el-input>
                </el-form-item>
                <el-form-item label="邮箱" prop="name">
                    <el-input v-model="item.email" ></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button type="primary" @click="addAdmin">确 定</el-button>
                <el-button @click="clearItemFalse">取 消</el-button>
            </div>
        </el-dialog>
        <!--    修改-->
        <el-dialog title="修改用户"  @close="clearItemFalse" :visible.sync="editDialogFormVisible"  :close-on-click-modal="false">

            <el-form :model="item" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <el-form-item label="账号" prop="name">
                    <el-input v-model="item.loginacct"></el-input>
                </el-form-item>
                <el-form-item label="密码" prop="name">
                    <el-input v-model="item.password"></el-input>
                </el-form-item>
                <el-form-item label="姓名" prop="name">
                    <el-input v-model="item.username"></el-input>
                </el-form-item>
                <el-form-item label="邮箱" prop="name">
                    <el-input v-model="item.email"></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button type="primary" @click="editAdmin">确 定</el-button>
                <el-button @click="clearItemFalse">取 消</el-button>
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

        name: "user",
        methods: {
            handleSelectionChange(val) {
                this.multipleSelection = val;
                if (val.length==0){
                    this.ids=''
                }else {
                    this.ids=''
                    for (let i=0;i<val.length;i++){
                        this.ids+=val[i].id+","
                    }
                    this.ids=this.ids.substring(0,this.ids.lastIndexOf(","))
                }

            },
            indexMethod(index) {
                return index +1;
            },
            findAdmin(val){
                 this.axios.get("http://localhost:8002/api/admin/admin/findAdmin?page="+val+"&rows=5"+"&key="+this.formInline.user).then((data)=>{
                        this.admin=data.data.data
                 }).catch((error)=>{
                     this.$message.error('错误'+error);
                 })
            },
            selectKey(){
                this.findAdmin(1)
            },
            selectByAdmin(admin){

                this.axios.get("http://localhost:8002/api/admin/admin/findByAdmin?id="+admin.id).then((data)=>{
                    if (data.data.state==200){
                        this.item=data.data.data
                        this.editDialogFormVisible = true
                    }else {
                        this.$message.error('未知数据');
                    }
                }).catch((error)=>{
                    this.$message.error('错误'+error);
                })

            },
            editAdmin(){

                let admin=this.item
                this.axios.post("http://localhost:8002/api/admin/admin/editAdmin",admin).then((data)=>{
                    if (data.data.state==200){
                        this.editDialogFormVisible = false
                        this.findAdmin(1)
                        this.clearItem()
                        this.$message({
                            message: "修改成功",
                            type: 'success'
                        });
                    }else {
                        this.$message.error('修改失败');
                    }
                }).catch((error)=>{
                    this.$message.error('错误'+error);
                })

            },
            addAdmin(){
                let admin=this.item
                this.axios.post("http://localhost:8002/api/admin/admin/addAdmin",admin).then((data)=>{
                    if (data.data.state==200){
                        this.addDialogFormVisible = false
                        this.findAdmin(1)
                        this.clearItem()
                        this.$message({
                            message: "添加成功",
                            type: 'success'
                        });
                    }else {
                        this.$message.error('添加失败');
                    }
                }).catch((error)=>{
                    this.$message.error('错误'+error);
                })

            },
            deleteAdmin(admin){
                this.$confirm('此操作将永久删除'+admin.username+', 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    this.axios.get("http://localhost:8002/api/admin/admin/deleteAdmin?id="+admin.id).then((data)=>{
                        if (data.data.state==200){
                            this.findAdmin(1)
                        }else {
                            this.$message.error('删除失败');
                        }
                    }).catch((error)=>{
                        this.$message.error('错误'+error);
                    })
                }).catch(() => {
                        this.$message({
                            type: 'info',
                            message: '已取消删除'
                        });

                 })
            },
            deleteIdsAdmin(){
                this.$confirm('此操作将永久删除, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    this.axios.get("http://localhost:8002/api/admin/admin/deleteIdsAdmin?ids="+this.ids).then((data)=>{
                        if (data.data.state==200){
                            this.ids=''
                            this.findAdmin(1)
                        }else {
                            this.$message.error('删除失败');
                        }
                    }).catch((error)=>{

                        this.$message.error('错误'+error);
                    })
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消删除'
                    });

                })
            },
            clearItem(){
                this.item.password=null
                this.item.loginacct=null
                this.item.email=null
                this.item.username=null
            },
            clearItemFalse(){
                this.item.password=null
                this.item.loginacct=null
                this.item.email=null
                this.item.username=null
                this.addDialogFormVisible=false
                this.editDialogFormVisible=false
            }
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
                admin:[],
                addDialogFormVisible:false,
                editDialogFormVisible:false,
                dialogFormVisibleRole:false,
                ids:'',
                multipleSelection: [],
                formInline: {
                    id:null,
                    user: ''
                },
                item:{
                    loginacct:'',
                    password:'',
                    username:'',
                    email:''
                },
                rules: {
                    name: [
                        { required: true, message: '不能为空', trigger: 'blur' },
                        { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
                    ]
                },
                data: generateData(),
                value: [],
                filterMethod(query, item) {
                    return item.pinyin.indexOf(query) > -1;
                }

            }
        },
        created(){
           this.findAdmin(1);
        }
    }
</script>

<style scoped>

</style>

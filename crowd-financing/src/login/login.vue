<template>
    <!--   所有容器父-->
    <el-container>
        <!--        主要内容区域-->
        <div  style="width: 300px;height:100%;align-content: center;margin:auto">
            <!--            内容按列展示-->
            <el-col>
                <label style="font-size: 29px">后台管理系统</label>
                <!--               可清理文本框-->
                <el-input  style="margin-top: 10px" placeholder="请输入用户名" v-model="user.loginacct" clearable ><i slot="prefix" class="el-input__icon el-icon-user"></i></el-input>
                <!--               密码框-->
                <el-input  style="margin-top: 10px" placeholder="请输入密码" v-model="user.password" show-password><i slot="prefix" class="el-input__icon el-icon-lock" ></i></el-input>
                <el-button type="primary" round style="margin-top: 10px;width: 300px" @click="login">登录</el-button>
            </el-col>
        </div>
    </el-container>
</template>

<script>
    export default {
        name: "login",
        data:()=>({
            user:{ loginacct:'root',
                password:'root',},
        }),
        methods: {
            login() {
                this.axios.post("http://localhost:8002/api/admin/admin/login",this.user).then((data)=>{
                    if (data.data.state==200){
                        sessionStorage.setItem("user",JSON.stringify(data.data.data))
                        sessionStorage.setItem("token",data.data.token)
                        this.$router.push({name:"index"})
                        this.$message({
                            message: "登录成功",
                            type: 'success'
                        });
                    }else {
                        this.$message.error('账号或密码错误');
                    }
                }).catch((error)=>{
                    this.$message.error('错误'+error);
                })
            }
        }
    }
</script>

<style scoped>

</style>

<template>
    <!--   所有容器父-->
    <el-container>
        <!--        主要内容区域-->
        <div  style="width: 300px;height:100%;align-content: center;margin:auto">
            <!--            内容按列展示-->
            <el-col>
                <label style="font-size: 29px">后台管理系统</label>
                <!--               可清理文本框-->
                <el-input  style="margin-top: 10px" placeholder="请输入用户名" v-model="user.usrName" clearable ><i slot="prefix" class="el-input__icon el-icon-user"></i></el-input>
                <!--               密码框-->
                <el-input  style="margin-top: 10px" placeholder="请输入密码" v-model="user.usrPassword" show-password><i slot="prefix" class="el-input__icon el-icon-lock" ></i></el-input>
                <el-button type="primary" round style="margin-top: 10px;width: 300px" @click="login">登录</el-button>
            </el-col>
        </div>
    </el-container>
</template>

<script>
    export default {
        name: "login",
        data:()=>({
            user:{ usrName:'root',
                usrPassword:'root',},
        }),
        methods:{
            login(){
                let user=this.user;
                this.axios.post("http://localhost:8080/user/login", {"username":user.usrName,"password":user.usrPassword}).then(
                    (response) =>{
                        if (response.data.username==user.usrName&&response.data.password==user.usrPassword){
                            sessionStorage.setItem("user",JSON.stringify(response.data))
                            this.$router.push({name:"index"})
                        }else {
                            this.$message({
                                message: "账号或密码错误",
                                type: 'success'
                            });
                        }
                    }
                ).catch((error) =>{
                        alert(error)
                    }
                )
            }
        }
    }
</script>

<style scoped>

</style>

<template>
    <el-container>
        <el-header height="50px" style="background-color: #409EFF">
            <label>后台管理系统</label>
        </el-header>
        <!--侧边-->
        <el-aside>
            <el-col :span="16" >
                <span >
                <el-menu default-active="2" class="el-menu-vertical-demo" v-for="(role,i) in list.role.right" :key="i">
                    <div v-if="role.parent==0&&role.url!=0">
                        <router-link :to="role.url">
                             <el-menu-item index="1">
                                <i :class="role.icon"></i>
                                <span slot="title">{{role.name}}</span>
                             </el-menu-item>
                        </router-link>
                    </div>
                    <div   v-if="role.url!=0">
                        <el-submenu index="2" >
                                <template slot="title">
                                    <i :class="role.icon"></i>
                                    <span>{{role.name}}</span>
                                </template>
                                <el-menu-item-group v-if="role.parent!=0&&role.url!=0">
                                    <el-menu-item index="2-1">{{role.name}}</el-menu-item>
                                </el-menu-item-group>
                    </el-submenu>


                    </div>

<!--                    <el-menu-item index="3">-->
<!--                        <i class="el-icon-setting"></i>-->
<!--                        <span slot="title">系统设置</span>-->
<!--                    </el-menu-item>-->
                </el-menu>
                    </span>
            </el-col>

        </el-aside>
        <!--内容主题-->
        <el-main>
            <router-view></router-view>
        </el-main>
    </el-container>
</template>

<script>
    export default {
        name: "index",
        data:()=>({
            da:"",
            list:JSON.parse(sessionStorage.getItem("user"))
        }),
        methods: {
            open2() {
                this.$message({
                    message:"欢迎"+ this.list.name,
                    type: 'success',
                });
            },

        },
        created(){
            //自动加载indexs方法
            this.open2()
        }
    }
</script>

<style scoped>
    a {
        text-decoration: none;
    }
</style>

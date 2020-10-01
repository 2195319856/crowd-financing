
<template>
    <el-container>
        <el-header height="50px" align="left"  style="background-color: #409EFF;color: aliceblue">
            <label style="line-height:50px;">后台管理系统</label>
        </el-header>
        <div>
            <template>
                <el-container>
                    <!--侧边-->
                    <el-aside>
                        <el-col :span="16" >
                            <span >
                                <el-menu default-active="2" class="el-menu-vertical-demo">
                                    <div  v-for="(me,i) in menu" :key="i">
                                        <div v-if="me.children==''">
                                            <router-link :to="me.url">
                                                 <el-menu-item :index="i">
                                                    <i class="el-icon-s-home"></i>
                                                    <span slot="title">{{me.menuname}}</span>
                                                 </el-menu-item>
                                            </router-link>
                                         </div>
                                        <div v-if="me.children!=''">
                                            <el-submenu :index="i" >
                                                <template slot="title">
                                                    <i class="el-icon-s-operation"></i>
                                                    <span>{{me.menuname}}</span>
                                                </template>
                                                <el-menu-item-group style="margin-left: 20px" v-for="(ms,j) in me.children" :key="j">
                                                    <router-link :to="ms.url">
                                                        <el-menu-item :index="i+'-'+j">
                                                           <i class="el-icon-s-custom"></i>
                                                             <span>{{ms.menuname}}</span>
                                                        </el-menu-item>
                                                    </router-link>
                                                </el-menu-item-group>
                                         </el-submenu>
                                        </div>
                                    </div>
                                </el-menu>
                            </span>
                        </el-col>
                    </el-aside>
                    <div  style="width: 100%">
                    <!--内容主题-->
                    <el-main>
                        <router-view></router-view>
                    </el-main>
                    </div>
                </el-container>
            </template>
        </div>
    </el-container>
</template>

<script>
    export default {
        name: "index",
        data:()=>({
            menu:JSON.parse(sessionStorage.getItem("user")).role.menu,

        }),
        methods: {


        },
        created(){
            //自动加载indexs方法
        }
    }
</script>

<style scoped>
    a {
        text-decoration: none;
    }
</style>

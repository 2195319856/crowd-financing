import VueRouter from 'vue-router'//路由
import Vue from 'vue'
Vue.use(VueRouter)
const routes=[
    {
        path:'/',
        component:()=>import('@/login/login'),

    },
    {
        path:'/login',
        component:()=>import('@/login/login'),

    },
    {
        path: "/index",
        name:"index",
        redirect: "/index/mains",
        component:()=>import('@/index/index'),
        children: [
            {
                path:'mains',
                component: ()=>import('@/index/mains'),
            },

        ]
    }
]
const router=new VueRouter({
    routes,
    mode: 'history'//不用加#

});
export default router

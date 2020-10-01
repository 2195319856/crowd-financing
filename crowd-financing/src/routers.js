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
        redirect: "/index/main",
        component:()=>import('@/main/index/index'),
        children: [
            {
                path:'main',
                component: ()=>import('@/main/index/main'),
                meta: {
                    requireAuth: true
                },
            },
            {
                path:'user',
                component: ()=>import('@/main/jurisdiction/user/user'),
            },
            {
                path:'role',
                component: ()=>import('@/main/jurisdiction/role/role'),
            },
            {
                path:'permit',
                component: ()=>import('@/main/jurisdiction/permit/permit'),
            },
            {
                path:'menu',
                component: ()=>import('@/main/jurisdiction/menu/menu'),
            },
            {
                path:'name',
                component: ()=>import('@/main/business/name/name'),
            },
            {
                path:'advertisement',
                component: ()=>import('@/main/business/advertisement/advertisement'),
            },
            {
                path:'project',
                component: ()=>import('@/main/business/project/project'),
            },
            {
                path:'qualifications',
                component: ()=>import('@/main/businessManagement/qualifications/qualifications'),
            },
            {
                path:'classifiedManagement',
                component: ()=>import('@/main/businessManagement/classifiedManagement/classifiedManagement'),
            },
            {
                path:'technologicalProcess',
                component: ()=>import('@/main/businessManagement/technologicalProcess/technologicalProcess'),
            },
            {
                path:'advertisingManagement',
                component: ()=>import('@/main/businessManagement/advertisingManagement/advertisingManagement'),
            },

        ]
    }
]
const router=new VueRouter({
    routes,
    mode: 'history',//不用加#,
});
router.beforeEach((to, from, next) => {
    if (to.meta.requireAuth){
        if (sessionStorage.getItem("token")!=null&&sessionStorage.getItem("token")!=""){
            next();
        }else {
            next('/login');
        }
    }else {
        next();
    }
});
export default router

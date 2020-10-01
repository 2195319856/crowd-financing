import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui'  //引入element-ui
import 'element-ui/lib/theme-chalk/index.css'//引入样式
import axios from 'axios'//请求插件
import router from "@/routers";
Vue.config.productionTip = false
Vue.use(ElementUI)   //在全局中使用

Vue.prototype.axios =axios;//全局引入
axios.defaults.timeout = 2000;
axios.interceptors.request.use(
    config=>{
      if (sessionStorage.getItem("token")){
        config.headers.token=sessionStorage.getItem("token")
      }
    return config
    }

)
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

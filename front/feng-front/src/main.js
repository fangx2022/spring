import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';//element-ui内部组件用到的样式
import 'font-awesome/css/font-awesome.min.css'//图标库
import router from './router'
import store from './store'

import axios from 'axios'
axios.defaults.baseURL = "http://localhost:8888"
Vue.prototype.$axios=axios

Vue.config.productionTip = false
Vue.use(ElementUI);//全局注册

new Vue({
  render: h => h(App),
  router:router,
  store:store
}).$mount('#app')

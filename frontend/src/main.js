// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './Layout'
import router from './router'
import VueSplit from 'vue-split-panel'
import BootstrapVue from 'bootstrap-vue/dist/bootstrap-vue.esm'
import VJstree from 'vue-jstree'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'expose-loader?$!expose-loader?jQuery!jquery'

Vue.use(BootstrapVue)
Vue.use(VueSplit)
Vue.use(VJstree)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
})

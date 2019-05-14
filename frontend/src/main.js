import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import Argon from "./plugins/argon-kit";
import './registerServiceWorker';

//import VueSplit from 'vue-split-panel';
//import VJstree from 'vue-jstree';

//Vue.use(VueSplit);
//Vue.use(VJstree);

Vue.config.productionTip = false;
Vue.use(Argon);
new Vue({
  router,
  render: h => h(App)
}).$mount("#app");

import Vue from "vue";
import Router from "vue-router";
import AppHeader from "./layout/AppHeader";
import AppFooter from "./layout/AppFooter";
import Main from "./views/Main.vue";
import Landing from "./views/Landing.vue";
import Login from "./views/Login.vue";
import Register from "./views/Register.vue";
import Profile from "./views/Profile.vue";
import Components from "./views/Components.vue";
import DevPad from "./views/dbpad/Dev_class.vue";
import NormalPad from "./views/dbpad/Normal_class.vue";
import StudentPad from "./views/dbpad/Student_class.vue";
import TestPad from "./views/dbpad/TestPadMain.vue";
import AxiosTest from "./views/axiostest.vue";
import TestPage from "./views/testpage.vue";

Vue.use(Router);

export default new Router({
  linkExactActiveClass: "active",
  routes: [
    {
      path: "/",
      name: "Main",
      components: {
        header: AppHeader,
        default: Main,
        footer: AppFooter
      }
    },
    {
      path: "/landing",
      name: "landing",
      components: {
        header: AppHeader,
        default: Landing,
        footer: AppFooter
      }
    },
    {
      path: "/login",
      name: "login",
      components: {
        header: AppHeader,
        default: Login,
        footer: AppFooter
      }
    },
    {
      path: "/register",
      name: "register",
      components: {
        header: AppHeader,
        default: Register,
        footer: AppFooter
      }
    },
    {
      path: "/profile",
      name: "profile",
      components: {
        header: AppHeader,
        default: Profile,
        footer: AppFooter
      }
    },
    {
      path: "/components",
      name: "components",
      components: {
        header: AppHeader,
        default: Components,
        footer: AppFooter
      }
    },
    {
      path: "/dclass",
      name: "devpad",
      components: {
        header: AppHeader,
        default: DevPad,
        footer: AppFooter
      }
    },
    {
      path: "/nclass",
      name: "normalpad",
      components: {
        header: AppHeader,
        default: NormalPad,
        footer: AppFooter
      }
    },
    {
      path: "/sclass",
      name: "studentpad",
      components: {
        header: AppHeader,
        default: StudentPad,
        footer: AppFooter
      }
    },
    {
      path: "/testpad",
      name: "testpad",
      components: {
        header: AppHeader,
        default: TestPad,
        footer: AppFooter
      }
    },
    {
      path: "/axiostest",
      name: "axiostest",
      components: {
        header: AppHeader,
        default: AxiosTest,
        footer: AppFooter
      }
    },
    {
      path: "/testpage",
      name: "testpage",
      components: {
        header: AppHeader,
        default: TestPage,
        footer: AppFooter
      }
    }
  ],
  scrollBehavior: to => {
    if (to.hash) {
      return { selector: to.hash };
    } else {
      return { x: 0, y: 0 };
    }
  }
});

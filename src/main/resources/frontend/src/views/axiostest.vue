<template>
    <section class="section section-lg section-shaped overflow-hidden my-0">
        <div class="shape shape-style-1 shape-default shape-skew">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <span></span>
        </div>
        <div class="container py-0 pb-lg">
            <div class="row justify-content-between align-items-center">
                <div class="col-lg-5 mb-5 mb-lg-0" id="testapp">
                  <h1>뷰 액시오스(Axios)</h1>
                  <button v-on:click="testapi">{{dash}} </button>


                </div>
            </div>
        </div>
    </section>
</template>

<script>
import axios from 'axios'

  export default {
    name: "Dashboard",
    data() {
      return {
        dash: '버튼'
      }
    },
    methods: {
      testapi: function () {
        const vm = this
        axios.get('http://localhost:3000/api/test',{
          params: {
            title: 'vue.js',
            content: "testcontent",
          }
        }).then(function(response) {
             vm.dash = response.data;
          });
      }
    }
  }



</script>
<style>
</style>

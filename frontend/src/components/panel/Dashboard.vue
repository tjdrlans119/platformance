<template>
    <div id="Dashboard">
      Dashboard view
      <button v-on:click="searchTerm">{{dash}}</button>
    </div>
</template>

<script>
  import axios from 'axios'

  export default {
    name: "Dashboard",
    data() {
      return {
        dash: 'spring boot'
      }
    },
    methods: {
      searchTerm: function () {
        const vm = this
        axios.get('http://localhost:3000/api/test',{
          params: {
            title: 'vue.js'
          }
        }).then(function(response) {
             vm.dash = response.data;
          });
      }
    }
  }
</script>

<style scoped>

</style>

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
          <nav class="navbar mt-4 navbar-expand-lg navbar-dark bg-default">
          <div class="container">MENU</div>
          </nav>

          <div class="row justify-content-between align-items-center">
            <div class="col-lg-2 mb-2 mb-lg-0">
                <li>
                  <ul >mysql</ul>
                  <ul >mssql</ul>
                  <ul >oracle</ul>
                </li>
            </div>
            <div class="col-lg-10 mb-lg-auto">
              <div class="flex-column flex-md-row">
                <div class="nav-wrapper">
                  <ul role="tablist" class="nav nav-pills nav-fill">
                    <li class="nav-item">
                      <a data-toggle="tab" role="tab" href="#undefined" class="nav-link active" aria-selected="true"><i class="ni ni-cloud-upload-96 mr-2"></i>Dashboard</a>
                    </li>
                    <li class="nav-item">
                      <a data-toggle="tab" role="tab" href="#undefined" class="nav-link active" aria-selected="true"><i class="ni ni-cloud-upload-96 mr-2"></i>Dashboard</a>
                    </li>
                    <li class="nav-item">
                      <a data-toggle="tab" role="tab" href="#undefined" class="nav-link active" aria-selected="true"><i class="ni ni-cloud-upload-96 mr-2"></i>Dashboard</a>
                    </li>
                    <li class="nav-item">
                      <a data-toggle="tab" role="tab" href="#undefined" class="nav-link active" aria-selected="true"><i class="ni ni-cloud-upload-96 mr-2"></i>Dashboard</a>
                    </li>
                    <li class="nav-item">
                      <a data-toggle="tab" role="tab" href="#undefined" class="nav-link active" aria-selected="true"><i class="ni ni-cloud-upload-96 mr-2"></i>Dashboard</a>
                    </li> 
                  </ul>
                </div>
              </div>
            </div>

          </div>


        </div>
    </section>
</template>
<script>
import BCarousel from "bootstrap-vue/es/components/carousel/carousel";
import BCarouselSlide from "bootstrap-vue/es/components/carousel/carousel-slide";
import Left from './Left'
import Dashboard from './panel/Dashboard'
import Properties from './panel/Properties'
import Sql from './panel/Sql'
import Statistics from './panel/Statistics'
import Dependencies from './panel/Dependencies'
import Dependents from './panel/Dependents'
import QueryTool from './panel/QueryTool'

export default {
  components: {
    BCarousel,
    BCarouselSlide,
    Left,Dashboard
    ,Sql,Statistics
    ,Dependencies,Dependents
    ,Properties,QueryTool
  }
};
</script>
<style>
</style>

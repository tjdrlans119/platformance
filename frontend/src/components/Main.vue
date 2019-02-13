<template>
  <Split style="height: 700px;" :direction="vertical">
    <SplitArea :size="15" :minSize="200">
      <Left></Left>
    </SplitArea>
    <SplitArea :size="85" :minSize="900">
      <b-card no-body style="font-size: small">
        <b-tabs card >
          <b-tab title="Dashboard" active>
            <dashboard></dashboard>
          </b-tab>
          <b-tab title="Properties" >
            <properties></properties>
          </b-tab>
          <b-tab title="SQL">
            <sql></sql>
          </b-tab>
          <b-tab title="Statistics">
            <statistics></statistics>
          </b-tab>
          <b-tab title="Dependencies">
            <dependencies></dependencies>
          </b-tab>
          <b-tab title="Dependents">
            <dependents></dependents>
          </b-tab>
          <b-tab title="QueryTool">
            <QueryTool></QueryTool>
          </b-tab>
        </b-tabs>
      </b-card>
    </SplitArea>
  </Split>
</template>

<script>
  import Left from './Left'
  import Dashboard from './panel/Dashboard'
  import Properties from './panel/Properties'
  import Sql from './panel/Sql'
  import Statistics from './panel/Statistics'
  import Dependencies from './panel/Dependencies'
  import Dependents from './panel/Dependents'
  import QueryTool from './panel/QueryTool'

  export default {
    components : {
      Left,Dashboard
      ,Sql,Statistics
      ,Dependencies,Dependents
      ,Properties,QueryTool
    }
  }
</script>

<style>

</style>


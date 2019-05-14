<template>
  <div>
    <div class="w-100 p-2" style="background-color: rgba(0, 0, 0, 0.03)">
      Browser
      <b-badge pill variant="light" @click="showModal">Add Server</b-badge>
    </div>

    <v-jstree :data="data"
              :item-events="itemEvents"
              allow-batch
              ref="tree">
    </v-jstree>

    <!--서버 등록 modal-->
    <b-modal ref="myModalRef" id="modal-center" centered title="Create Server">
      <b-card no-body style="font-size: small">
        <b-tabs card >
          <b-tab title="General" active>
            <General></General>
          </b-tab>
          <b-tab title="Connection" >
            <Connection></Connection>
          </b-tab>
          <b-tab title="SSL">
            <SSL></SSL>
          </b-tab>
          <b-tab title="Advanced">
            <Advanced></Advanced>
          </b-tab>
        </b-tabs>
      </b-card>
    </b-modal>
  </div>
</template>


<style scoped>

</style>

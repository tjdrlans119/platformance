<template>
  <div>
    <!--<b-container style="background-color: rgba(0, 0, 0, 0.03)" class="bv-example-row">
      <b-row>
        <b-col cols="8">
          <h5>
            <b-badge variant="light">
              Browser
            </b-badge>
          </h5>
        </b-col>
        <b-col>
          <b-badge class="p-1 align-bottom" href="#" variant="light" style="font-size: 9px">Add Server</b-badge>
        </b-col>
      </b-row>
    </b-container>
    <v-jstree :data="data"
              allow-batch
              whole-row
              draggable
              @item-click="itemClick"
              ref="tree">
    </v-jstree>-->
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

<script>
  import General from './modal/General'
  import Connection from './modal/Connection'
  import SSL from './modal/SSL'
  import Advanced from './modal/Advanced'

  import VJstree from 'vue-jstree'
  export default {
    name: 'app',
    components: {
      Advanced,
      SSL,
      Connection,
      General,
      VJstree
    },
    data() {
      return {
        itemEvents: {
          contextmenu: function () {
            debugger;
          }
        },
        data: [{
          "text": "Server",
          "children": [
            {
              "text": "OracleSql"
            },
            {
              "text": "MS Sql"
            },
            {
              "text": "MySql",
              "opened": true,
              "children": [
                {
                  "text": "Databases",
                  "children": [
                    {
                      "text": "wdtdb"
                    },
                    {
                      "text": "wdttestdb"
                    },
                    {
                      "text": "wdtpsqldb"
                    }
                  ]
                }
              ]
            }
          ]
        }]
      }
    },
    methods: {
      showModal () {
        this.$refs.myModalRef.show()
      }
    }
  }
</script>

<style scoped>

</style>

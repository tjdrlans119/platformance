<template>
  <md-card>
    <md-card-media>
      <div class="codemirror">
        <codemirror v-model="code" :options="cmOption"></codemirror>
      </div>
    </md-card-media>
  </md-card>
</template>

<script>
  import 'codemirror/mode/sql/sql.js'
  import { codemirror } from 'vue-codemirror'

  // theme css
  import 'codemirror/theme/solarized.css'
  import 'codemirror/lib/codemirror.css'

  export default {
    components: {
      codemirror
    },
    data() {
      const code =
        `
-- SQL Mode for CodeMirror
SELECT SQL_NO_CACHE DISTINCT FROM TBL_USER_INFO
`
      return {
        code,
        cmOption: {
          tabSize: 4,
          styleActiveLine: true,
          lineNumbers: true,
          line: true,
          mode: 'text/x-mysql'
        }
      }
    }
  }
</script>

<style scoped>

</style>

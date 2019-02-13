<template>
    <div>
      <b-container fluid>
        <b-row class="my-1">
          <b-col sm="2"><label for="input-small">Name:</label></b-col>
          <b-col sm="10">
            <b-form-input id="input-small" size="sm" type="text" placeholder="Enter name"></b-form-input>
          </b-col>
        </b-row>
      </b-container>

      <b-container fluid>
        <b-row class="my-1">
          <b-col sm="2"><label for="input-small">Server Group:</label></b-col>
          <b-col sm="10">
            <b-form-select v-model="selected" :options="options" size="sm" class="mb-3">
              <template slot="first">
                <!-- this slot appears above the options from 'options' prop -->
                <option :value="null">Servers</option>
              </template>
              <!-- these options will appear after the ones from 'options' prop -->
              <option value="C">Option C</option>
              <option value="D">Option D</option>
            </b-form-select>
          </b-col>
        </b-row>
      </b-container>

      <b-container fluid>
        <b-row class="my-1">
          <b-col sm="2"><label for="input-small">Comments:</label></b-col>
          <b-col sm="10">
            <b-form-textarea id="textarea1"
                             v-model="text"
                             placeholder="Enter something"
                             :rows="3"
                             :max-rows="6">
            </b-form-textarea>
          </b-col>
        </b-row>
      </b-container>
    </div>
</template>

<script>
    export default {
        name: "General"
    }
</script>

<style scoped>

</style>

<template>
  <div>
    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small1">Host name/address:</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small1" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small2">Port</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small2" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small3">Maintenance</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small3" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small4">Username</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small4" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small5">Password</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small5" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label>Save Password?</label></b-col>
        <b-col sm="10">
          <b-form-checkbox id="checkbox1"
                           v-model="status"
                           value="accepted"
                           unchecked-value="not_accepted">
            I accept the terms and use
          </b-form-checkbox>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small7">Role</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small7" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2"><label for="input-small8">Service</label></b-col>
        <b-col sm="10">
          <b-form-input id="input-small8" size="sm" type="text"></b-form-input>
        </b-col>
      </b-row>
    </b-container>

  </div>
</template>

<script>
    export default {
        name: "Connection"
    }
</script>

<style scoped>

</style>

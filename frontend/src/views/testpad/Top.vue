<template>
  <b-navbar toggleable="md" type="dark" variant="info">

    <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

    <b-navbar-brand href="#">PlatFormance</b-navbar-brand>

    <b-collapse is-nav id="nav_collapse">

      <b-navbar-nav>
        <b-dropdown id="ddown-sm1" size="sm" text="File" class="m-2">
          <b-dropdown-item-button>Action</b-dropdown-item-button>
          <b-dropdown-item-button>Another action</b-dropdown-item-button>
          <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
        </b-dropdown>
        <b-dropdown id="ddown-sm2" size="sm" text="Object" class="m-2">
          <b-dropdown-item-button>Action</b-dropdown-item-button>
          <b-dropdown-item-button>Another action</b-dropdown-item-button>
          <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
        </b-dropdown>
        <b-dropdown id="ddown-sm3" size="sm" text="Tools" class="m-2">
          <b-dropdown-item-button>Action</b-dropdown-item-button>
          <b-dropdown-item-button>Another action</b-dropdown-item-button>
          <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
        </b-dropdown>
        <b-dropdown id="ddown-sm4" size="sm" text="Help" class="m-2">
          <b-dropdown-item-button>Action</b-dropdown-item-button>
          <b-dropdown-item-button>Another action</b-dropdown-item-button>
          <b-dropdown-item-button>Something else here...</b-dropdown-item-button>
        </b-dropdown>

      </b-navbar-nav>

      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto">
        <b-nav-form>
          <b-form-input size="sm" class="mr-sm-2" type="text" placeholder="Search"/>
          <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
        </b-nav-form>

        <b-nav-item-dropdown right>
          <!-- Using button-content slot -->
          <template slot="button-content">
            <em>User</em>
          </template>
          <b-dropdown-item href="#">Profile</b-dropdown-item>
          <b-dropdown-item href="#">Signout</b-dropdown-item>
        </b-nav-item-dropdown>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>

<script>
    export default {
        name: "Top"
    }
</script>

<style scoped>

</style>

<template>
  <div id="app">
    <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
    <router-link to="/discover">发现  </router-link>
    <router-link to="/friends">关注  </router-link>
    <router-link to="/my">我的  </router-link>
    <router-view></router-view>
    <!-- <UserInfo msg="Welcome to Your Vue.js App"/> -->
  </div>
</template>

<script>
import UserInfo from './components/UserInfo.vue'

export default {
  name: 'App',
  components: {
    UserInfo
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

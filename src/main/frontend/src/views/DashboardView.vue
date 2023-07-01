<script setup>

import HeaderComponent from '../components/HeaderComponent.vue';
import AddPostForm from '../components/AddPostForm.vue';



</script>
<template>
<HeaderComponent/>
<AddPostForm/>
</template>

  
<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";


.formBody{
  display: block;
  
}

  

 
</style>


  
  
  
  import { useRoute } from "vue-router";
import { computed } from "vue";

const route = useRoute();
const isLogin = computed(() => route.name === "Login");}

const isLogin = computed(() => route.name === "Login");
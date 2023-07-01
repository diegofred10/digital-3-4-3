<script setup>
import axios from 'axios';
import { defineProps, onBeforeMount, ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';

let date = new Date().toLocaleDateString();
</script>

<template>
    <div class="frontComponent">
        <img class="frontImage" src="../assets/images/victoria sporting.jpg" alt="imagen de portada">
        <p class="theme">SPORTING</p>
        <h1 class="title">El Sporting consigue una gran victoria en el Molinón</h1>
        <p class="userName">RUBEN G. DONGIL</p>
    </div>
</template>


<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";
.frontComponent{
    width: 40em;
    display: flex;
    flex-direction: column;
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    border-bottom: solid 1px map-get(c.$colors, "black");
    margin: 0 0 1em 0;
    .frontImage{
        width: 100%;
    }
    .theme{
        font-weight: bolder;
        color: map-get(c.$colors, "green-blue");
        margin: 1em 0 0 0;
    }
    .title{
        color: map-get(c.$colors, "black");
        margin: 0;
        
        
    }
    .userName{
        margin: 2em 0 1em 0;
    }
    
}


</style>
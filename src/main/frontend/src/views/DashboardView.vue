<script setup>
import { ref } from 'vue';

const noticias = ref([]);

const nuevaNoticia = ref({ titulo: '', contenido: '' });
const mostrarFormulario = ref(false);

const agregarNoticia = () => {
  const id = noticias.value.length + 1;
  const fecha = new Date().toISOString().substr(0, 10);
  noticias.value.push({ id, fecha, ...nuevaNoticia.value });
  nuevaNoticia.value.titulo = '';
  nuevaNoticia.value.contenido = '';
  mostrarFormulario.value = false;
};

      // return {
      //   // noticias,
      //   // nuevaNoticia,
      //   // mostrarFormulario,
      //   // agregarNoticia,
      // };


</script>
<template>
  <div>
    <h1 class="title">Dashboard</h1>
    <ul class="postList">
      <li v-for="noticia in noticias" :key="noticia.id">
        {{ noticia.titulo }} - {{ noticia.fecha }}
      </li>
    </ul>
    <button @click="mostrarFormulario = true">Agregar Noticia</button>
    <form class= "addPost" v-if="mostrarFormulario" @submit.prevent="agregarNoticia">
      <h2 class ="formtitle">Agregar Noticia</h2>
      <label for="titulo">Título:</label>
      <input class="postText" type="text" id="titulo" v-model="nuevaNoticia.titulo">
      <label for="contenido">Contenido:</label>
      <textarea id="contenido" v-model="nuevaNoticia.contenido"></textarea>
      <button class="dashbutton" type="submit">Agregar</button>
      <button type="button" @click="mostrarFormulario = false">Cancelar</button>
    </form>
  </div>
</template>
  
<style scooped>
  

  .title {
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    font-size: xx-large;
    color: #007982;
  }


  .postList {
    list-style: none;
    padding: 0;
  }

  .post {
    margin-bottom: 10px;
    padding: 10px;
    background-color: #ffffff;
    border: 1px solid #00d7e8;
    color: #111111;
    font-size: 16px;
  }

 
  .dashbutton {
    background-color: #00a8b5;
    color: #ffffff;
    border: none;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
  }

  .dashbutton:hover {
    background-color: #007982;
  }

  .addPost {
    margin-top: 20px;
    padding: 20px;
    background-color: #ffffff;
    border: 1px solid #00d7e8;
  }

  label {
    display: block;
    margin-bottom: 5px;
    color: #111111;
    font-size: 16px;
  }

  input{
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border: 1px solid #00d7e8;
    border-radius: 5px;
  }

  textarea{
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border: 1px solid #00d7e8;
    border-radius: 5px;
  }

  button {
    border-radius: 5px;
    margin: 0 10px 0 1px;
    background-color: #00a8b5;
    color: #ffffff;
    border: none;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
  }

  button:hover{
    background-color: #007982;
  }

  .formtitle{
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
  }
</style>


  
  
  
  import { useRoute } from "vue-router";
import { computed } from "vue";

const route = useRoute();
const isLogin = computed(() => route.name === "Login");}

const isLogin = computed(() => route.name === "Login");
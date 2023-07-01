  <script setup>
  import { ref, reactive, onBeforeMount } from 'vue';
  import axios from 'axios';

 import PostService from '../Services/PostService'
  const onFileChange = event => {
    File.value = event.target.files[0]
  };
  const file = ref(null);
const postService = new PostService()
const titleModel = ref()
const descriptionModel = ref()
const post = reactive({
  title: titleModel,
  description: descriptionModel,
})

const submitData = async () => {
  try {
    const formData = new FormData();
    formData.append("title", titleModel.value);
    formData.append("description", descriptionModel.value);
    if (file.value != null) {
      formData.append("file", file.value);

      await axios({
        method: "POST",
        url: "http://localhost:8080/media/upload/post",
        data: formData,
        withCredentials: true,
        headers: {
          "Content-Type": "multipart/form-data",
      },
    });
  }else{
    await axios({
      method: "POST",
      url: "http://localhost:8080/api/posts/add",
      data: post,
      withCredentials: true,
  });
}
console.log("Enviado")
location.reload();
      
    } catch (error) {
      console.log(error)
    }
    location.reload();
  }
  const reload = () => {
    location.reload();
  }
  </script>


<template>
  
  <div class="formComp">
  <form @submit.prevent>
    
        <h1 class="addPost">Añadir Noticia</h1>
        <input v-model="titleModel" class="title" type="text" placeholder="Título" />
      <textarea v-model="descriptionModel" class="description" placeholder="Cuerpo de la noticia" rows="5"
        cols="46">
      </textarea>
        <input class="resources" type="file" @change="onFileChange" ref="fileInput">
        <div class="buttonsContainer">
          <button @click="reload" class="cancelButton">Cancelar</button>
          <button @click="submitData" class="sendButton">Publicar</button>
        </div>
        
      </form>
    </div>
  
  </template>
  
  
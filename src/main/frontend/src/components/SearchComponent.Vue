<!-- <script setup>
import { ref, onBeforeMount } from "vue";
import PostService from "../services/PostService";

let input = ref("");

const postService = new PostService();

let post = ref([]);

onBeforeMount(async () => {
  await postService.fetchAllPost();
  post.value = postService.getPost();
  console.log(post.value);
});

function filterList() {
  return post.value.filter(
    (post) =>
      post.title.toLowerCase().includes(input.value.toLowerCase()) ||
      post.description.toLowerCase().includes(input.value.toLowerCase())
  );
}
</script>

<template>
  <div class="searcher">
    <input class="text" type="text" v-model="input" placeholder= "  buscar.." />

    <!-- <div class="itemPost" v-for="post in filterList()" :post="post">
    <p>{{ post }}</p>
  </div> -->
    <!-- <div class="itemError" v-if="search && !filter().length">
      <p>No hay resultados</p>
    </div>
  </div>
  
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.searcher {
  background-color: map-get(c.$colors, "light-purple");
  margin-top: 1vw;
  width: 60vw;
  height: 7vh;
  border-radius: 3px;
  .text {
    width: 60vw;
    font-family: "Open Sans", sans-serif;
    font-size: 2vw;

    ::placeholder
    :root{
      --fa-style-family: "Font Awesome 6 Free";
      --fa-style: 200; 
      --fa-border-color: WhiteSmoke;
    --fa-border-padding: 2em;
    }

  }

  .itemError {
    width: 60vw;
    font-family: "Open Sans", sans-serif;
    font-size: 2vw;
  }
}
</style> --> -->

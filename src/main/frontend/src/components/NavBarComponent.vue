<script setup>

</script>
<template>
  <div class="menuContainer">
    <nav role="navigation" class="menuNav">
      <router-link to="/sporting" class="route" href="">Sporting</router-link>
      <router-link to="/2rfef" class="route" href="">2ªRfef</router-link>
      <router-link to="/3rfef" class="route" href="">3ªRfef</router-link>
      <router-link to="/1asturias" class="route" href="">1ªRffpa</router-link>
      <router-link to="/2asturias" class="route" href="">2ªRffpa</router-link>
      <router-link to="/3asturias" class="route" href="">3ªRffpa</router-link>

      
    </nav>
  </div>
</template>


<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.menuContainer{
  padding: 5px;
  background-color: map-get(c.$colors, "white");
  border-top: solid 1px map-get(c.$colors, "light-grey");
  border-bottom: solid 1px map-get(c.$colors, "green-blue");
  position: sticky;
  z-index:10;
  left: 0%;
  top: 0%;
  right: 0%;
  bottom: 0%;
  display: flex;
  height: 20px;
  justify-content: center;
  margin-bottom: 1em;
  
  
}

.menuNav{
  font-size: large;
  
}

.route{
  margin: 20px 20px 20px 20px;
  text-decoration: none;
  font-family: "roboto";
  color: black;
  font-weight: 500;

}
</style>
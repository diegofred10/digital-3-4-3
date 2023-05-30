


<template>
    <div class="midComponent">
        <div class="midPostText">
            <p class="midTheme">CEARES</p>
            <h1 class="midTitle">Ceares y Sporting "B" firman tablas en la Cruz</h1>
            <p class="userName">RUBEN G. DONGIL</p>
        </div>
        <img class="midImage" src="../assets/images/ceares.jpg" alt="imagen de noticia">
    </div>
</template>


<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.midComponent {
    
    width: 30em;
    height: 10em;
    display: grid;
    grid-template-columns: 1fr 1fr;
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    border-bottom: solid 1px map-get(c.$colors, "black");
    margin: 0.5em 0 0 0;
    padding: 0 0 0.5em 0;

  
    .midImage {
        width: 100%;
    
        
        
    }

    .midTheme {
        font-weight: bolder;
        font-size: smaller;
        color: map-get(c.$colors, "green-blue");
        margin: 0;
    }

    .midTitle {
        font-size: large;
        color: map-get(c.$colors, "black");
        margin: 1em 0 1em 0;

    }

    .userName {
        font-size: smaller;
        margin: 2em 0 1em 0;
    }
}
</style>
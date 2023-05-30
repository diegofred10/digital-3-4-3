<template>
    <div class="cardComponentContainer">
        <img class="cardImage" src="../assets/images/Lucas.jpeg" alt="imagen de noticia">
        <div class="cardPostText">
            <p class="cardTheme">CEARES</p>
            <h1 class="cardTitle">Ceares y Sporting "B" firman tablas en la Cruz</h1>
            <p class="userName">RUBEN G. DONGIL</p>
        </div>
    </div>
</template>


<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.cardComponentContainer {
    
    
    width: 20em;
    height: 20em;
    display: flex;
    flex-direction: column;
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    border-bottom: solid 1px map-get(c.$colors, "black");
    margin: 0 0.5em 0 0.5em;
    
    

  
    .cardImage {
        width: 100%;
        
        
    }

    .cardTheme {
        font-weight: bolder;
        font-size: smaller;
        color: map-get(c.$colors, "green-blue");
        margin: 0;
    }
    
    .cardTitle {
        font-size: large;
        color: map-get(c.$colors, "black");
        margin: 0;
        

    }

    .userName {
        font-size: smaller;
        margin: 0.5em 0 0.5em 0;
    }
}
</style>
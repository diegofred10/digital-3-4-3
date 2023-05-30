<script setup>
let day = new Date().getDay();
let days = ["Domingo","Lunes","Martes","Miercoles","Jueves", "Viernes", "Sabado", "Domingo"]
let date = new Date().toLocaleDateString()
</script>


<template>
    <div class="headerContainer">
        <div class="subscribeButtons">
            <button class="signIn">Suscríbete</button>
            <button class="logIn">Iniciar sesion</button>
        </div>
            <div class="image">
            <img class="logo" src="../assets/images/logo 343.png" alt="logo coorporativo"/>
        </div>
        <div id="date" class="date">
            {{ days[day] + ", " + date }}
        </div>
    </div>
</template>


<style lang="scss" scoped>
@use "@/scss/colors" as c;
.headerContainer{
    // width:90%;
    // padding: 1em;
    display: flex;
    justify-content: space-between;
    margin: 1em 6.8em 0.3em 6.8em;
    .subscribeButtons {
        display: flex;
        justify-content: space-around;
        align-items: start;
        
    }
    .date{
        font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    color: map-get(c.$colors, "coral-green");
    display: flex;
    align-items: flex-start;
    height: fit-content;
    
}
    .logo {
    margin: 0 0 0 15em;
    border-radius: 50px;
    width: 25%;
    
    
    // height: 7em;
}

    .signIn {
    background-color: #007982;
    color: white;
    margin-right: 1em;
    border-radius: 3px;
    font-weight: bold;
}

    .logIn {
    border: solid 1px #007982;
    color: #007982;
    border-radius: 3px;
    height: fit-content;
    background-color: white;
    

}
}
</style>
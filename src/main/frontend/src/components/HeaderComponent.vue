<script setup>
// document.getElementById("date").innerHTML = localDate();
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
.headerContainer{
    padding: 1em;
    display: flex;
    justify-content: space-between;
}
.subscribeButtons {
    height: fit-content;
    display: flex;
    justify-content: space-around;
    align-items: start;

}
.date{
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    color: #00d7e8;
    display: flex;
    align-items: flex-start;
    height: fit-content;
    margin: 0 1em 0 0;
}
.logo {
    margin: 0 1em 0 0;
    border-radius: 25px;
    width: 14em;
    height: 7em;
}

.signIn {
    background-color: #007982;
    color: white;
    margin-right: 1em;
    border-radius: 5px;
}

.logIn {
    border: solid 1px #007982;
    color: #007982;
    border-radius: 5px;
    background-color: white;


}
</style>
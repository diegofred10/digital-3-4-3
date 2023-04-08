<script setup>

</script>


<template>
    <div class="subscribeButtons">
        <button class="signIn">Suscríbete</button>
        <button class="logIn">Iniciar sesion</button>
    </div>
    <img class="logo" src="../assets/images/logo 343.png" alt="logo coorporativo">
</template>


<style scoped>
.subscribeButtons{
    position: absolute;
    top: 2em;
    left:2em;
    display: flex;
    justify-content: space-around;
    align-items: space-around;
}
.logo{
    position: absolute;
    left: 40em;
    top: 3em;
    border-radius: 25px;
    width: 14em;
    height: 7em;
}

.signIn{
    background-color: #007982;
    color: white;
    margin-right: 1em;
    border-radius: 5px;
}
.logIn{
    border: solid 1px #007982;
    color: #007982;
    border-radius: 5px;
    background-color: white;
    

}


</style>
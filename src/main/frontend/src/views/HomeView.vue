<script setup>
import HeaderComponent from '../components/HeaderComponent.vue';
import frontPageComponent from '../components/frontPageComponent.vue';
</script>

<template>
    <header>
    <HeaderComponent />
</header>
    <body>
        <section>
            <frontPageComponent />
        </section>
    </body>
</template>

<style scoped>
body{
     margin: 0 auto;
    width: 75%;
}
section{
    display: flex;
    flex-direction: column;
}
</style>

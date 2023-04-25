<script setup>
import HeaderComponent from '../components/HeaderComponent.vue';
import FrontPageComponent from '../components/FrontPageComponent.vue';

</script>

<template>
    <HeaderComponent />
    <main>

        <FrontPageComponent />
        <FrontPageComponent />
        <FrontPageComponent />
        <FrontPageComponent />




    </main>
</template>

<style scoped>
main {
    display: grid;
    margin: 0 auto;
    grid-template-columns: 1fr 1fr;
    justify-items: center;
    align-items: center;
}
</style>

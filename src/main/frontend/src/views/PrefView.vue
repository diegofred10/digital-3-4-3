<script setup>
import HeaderComponent from '../components/HeaderComponent.vue';
import NavBarComponent from '../components/NavBarComponent.vue';
import CardComponent from '../components/CardComponent.vue';

</script>

<template>
    <HeaderComponent />
    <NavBarComponent />
    <main>
        <CardComponent />
    <CardComponent/>
    <CardComponent/>

    </main>
</template>


<style scoped>
main{
    margin: 0 auto;
    width: 85%;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
}

</style>
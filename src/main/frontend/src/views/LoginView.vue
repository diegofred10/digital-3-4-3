<script setup>
import HeaderComponent from '../components/HeaderComponent.vue';
import LoginForm from '../components/LoginForm.vue';
</script>

<template>
    <HeaderComponent />
    <main>
        <LoginForm />
    </main>
</template>
        
<style scoped>
main {
    display: flex;
    flex-direction: column;
    align-items: center;
}
</style>
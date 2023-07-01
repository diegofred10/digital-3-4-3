<script setup>
import { ref, onMounted } from 'vue';
import HeaderComponent from '../components/HeaderComponent.vue';
import FrontPageComponent from '../components/FrontPageComponent.vue';
import NavBarComponent from '../components/NavBarComponent.vue';
import MidComponent from '../components/MidComponent.vue'
import CardComponent from '../components/CardComponent.vue';
import FooterComponent from '../components/FooterComponent.Vue'






</script>

<template>
    <HeaderComponent class="headerComponent" />
    <NavBarComponent/>
    <!-- <div class = "progressBar">
        <div id="progress" class="progress"></div>
    </div> -->
    <main>
        <section class="frontSection">
            <div class="frontPostContainer">
            <FrontPageComponent />
        </div>
        <div class="rightSideContainer">
            <MidComponent/>
            <MidComponent/>
            <MidComponent/>
            <!-- <MidComponent/> -->
        </div>
        </section>
        <section class="secondSection">
            <CardComponent/>
            <CardComponent/>
            <CardComponent/>
            <CardComponent/>
            
        </section>



        
    </main>

    
    
    <FooterComponent/>


</template>


<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";
main {
    margin: 0 auto;
    width: 85%;
    .frontSection{
        display: grid;
        grid-template-columns: 1fr 1fr;
        

        .rightSideContainer{
            margin: 0 0 0 8em;
        }
        
    }
    .secondSection{
        display: flex;
        margin: 0 auto;
        justify-content: space-between;
        
    }
    
    .progressBar {
        height: 5px;
        width: 100%;
        position: sticky;
        
    }
    
    .progress {
        background-color: #00d7e8;
        width: 100%;
        height: 100%;
    }
}
</style>

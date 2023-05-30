<script>


</script>
<template>
    <div class="footerContainer">
        <img class="footerImage" src="../assets/images/logo negro 343 sin.png" alt="logo 343 blanco y negro">
        <p class="copy">©Copyright 343 Norte</p>
       
            <font-awesome-icon icon="fa-brands fa-instagram" style="color: #0dd5d9;" />
        
        </div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.footerContainer{
    
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    background-color: map-get(c.$colors, "black");
    margin: 3em 0 0 0;
    

}

.footerImage{
    width: 10em;
}

.copy{
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    color: #ffffff;
    
}

</style>
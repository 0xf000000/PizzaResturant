<template>
    <div class=" customFooter container">
        <hr>
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class=" customTextStyle col-md-4 mb-0 text-muted"> @margaleCompany</p>
        <a class=" customimmageStyling col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark link-dark text-decoration-none " href="#">
            <img src="../assets/pizzaIcon.png">
        </a>

        <ul class="nav col-md-4 justify-content-end  customFooterStyle">
            <li class="nav-item "><a class="nav-link text-muted px-2" href="#">Home </a></li>
            <li class="nav-item "><a class="nav-link text-muted px-2" href="#">Menu </a></li>
            <li class="nav-item "><a class="nav-link text-muted px-2" href="#">FAQs </a></li>
            <li class="nav-item "><a class="nav-link text-muted px-2" href="#">About  </a></li>  
        </ul>
    
    </footer>
</div>
</template>

<script>
import axios from "axios";
export default {
   
name:"footer",




}
</script>

<style scoped>

.customTextStyle{
    padding-right: 20%;
    padding-top: 0.7%;
}
.customFooterStyle{
    display: flex;
    flex-wrap: nowrap;
    padding-left: 10%;
}
.customFooter{

    padding-top: 1%;
    bottom: 0;
    width: 100%;

}

.customimmageStyling{


    padding-bottom: 1%;
}

</style>
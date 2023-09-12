<template>
 <div class=" customjuboStyle jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Pizzaria garmoldi</h1>
    <p class="lead"> </p>
    <div class="container">
       <p class="lead"> We provide a good pizza with strong things innit</p>
       <router-link to="/price">
      <button @click="navigate" type="button" class="btn btn-primary customButtonStyle"> checkout our Menu! </button>

    </router-link>
    </div>
</div>
</div>




</template>

<script>


export default {
  name: 'HelloWorld',
 
  
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>



</style>

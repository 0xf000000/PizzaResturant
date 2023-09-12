<template>
  <div class="home">
    <jumbotron/>
    <textsection />
  </div>
</template>

<script>
import jumbotron from '@/components/jumbotron.vue';
import textsection from '@/components/TextSection.vue';
export default {
  name: 'HomeView',
  components: {
    jumbotron,
    textsection,
},

mounted(){
  
  
}
}
</script>

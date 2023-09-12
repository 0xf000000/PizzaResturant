<template>


<div class="testPAGE">
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    
    <a class="navbar-brand" href='/order'><img src="./assets/pizzaIcon.png" ></a>
     
    <div class="navbar-nav navigation2">
      
      <router-link to="/">Home</router-link> |
      <router-link to="/price">price</router-link> |
      <router-link to="/order">order</router-link>
    </div>

    <a class="navbar-brand bg-light customCartStyle "> <img src="" alt="cart"></a>

  </nav>
  <router-view/>
  <div style="color: red" v-if= error> im sorry there is a problem with setting the cookie</div>

</div>



<myfooter />
</template>

<script>
import myfooter from "@/components/footer.vue"
import axios from 'axios'

const cookieKey = "pizzaID";

function makeid(length) {
    let result = '';
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    const charactersLength = characters.length;
    let counter = 0;
    while (counter < length) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
      counter += 1;
    }
    return result;
}



export default {
  name: "app",
  components:{
    myfooter,
  },

  data(){
    return {
       error: false,
       cookieKey :"pizzaID"
    }
  },
  created(){
    // kinda scuffed to do it like this but for now i think its fine
    if(this.$cookies.isKey("pizzaID")){  return;}
      
      this.$cookies.set(cookieKey, makeid(20));

      let cookieValue = this.$cookies.get(cookieKey)

      axios.post(`http://localhost:8080/api/v3/user/add/${cookieValue}`).then( response =>{
        this.error = false;
      }).catch((error) =>{
        this.error = true
        this.$cookies.remove(cookieKey);
      });

  },

  
}


</script>

<style>
.customCartStyle{
  padding-top: 1.5%;
  padding-left: 75%;
}

body{
  margin: 0;
  padding:0; 
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  height: 70px;
 padding-bottom: 0;
 margin-bottom:0;
  background-color:gray
}

img{
  padding-right: 1%;
  height: 50px;
  width: 50px;
  
}

.navigation2{
  padding-top: 1.7%;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
  text-decoration: none;
}

nav a:hover{
  text-decoration: none ;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
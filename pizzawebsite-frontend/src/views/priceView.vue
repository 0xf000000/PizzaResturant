<template>
  <div class="container">
    <section v-if="errored">
      <p>We're sorry, we're not able to retrieve this information at the moment, please try back later</p>
    </section>

    <section v-else>
        <h2> Menu </h2>
      <div v-if="loading"> Loading ...</div>

      <div class="container">
        <div class="row">
          <div v-for="infos in info" class="col-lg-4 d-flex align-items-stretch customcardStyle">
            <div class="card" style="width: 18rem;">
              <img class=" customCardImmageStyle card-img-top" src="../assets/magaritha.jpg"
                alt="here should be a immage of the pizza :(">
              <div class="card-body">
                <h5 class="card-title">{{ infos.name }}</h5>
                <p class="card-text">{{ infos.description }}</p>
                <a href="/order" @click="PutIntoCart(infos)" class="btn btn-primary">{{ infos.price }}</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<style scoped>
.customCardImmageStyle {
  border-radius: 25px;
}

.customcardStyle {
  padding: 1%;  
  height: 200px;
  widows: 200px;


}

.cardPizzas {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  height: auto;
}
</style>

<script>
import axios from 'axios';
import POSTMETHOD from './httpMethods.js'
const GetAllPizzasurl = "http://localhost:8080/api/v2/pizzas"
const createOrder = "http://localhost:8080/api/v1/add"


export default {

 
  methods: {
    PutIntoCart(jsonData) {
        const cookie = {"userID": this.$cookies.get('pizzaID')};
        POSTMETHOD(createOrder, cookie);
        POSTMETHOD()

      },
  },



  data() {
    return {
      info: null,
      loading: true,
      errored: false
    }
  },

  mounted() {
    axios
      .get(GetAllPizzasurl)
      .then(response => {
        this.info = response.data;

      })
      .catch(error => {
        console.log(error)
        this.errored = true;

      }).finally(() => {
        this.loading = false;
      })


  }


}


</script>

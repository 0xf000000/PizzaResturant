import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import priceView from '../views/priceView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path:'/price',
    name:'price',
    component: priceView,
  },
  {
    path: '/order',
    name: 'order',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is   when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/OrderView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router

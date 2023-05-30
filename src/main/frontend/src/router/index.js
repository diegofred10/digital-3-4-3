import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import DashboardView from '../views/DashboardView.vue'
import LoginView from '../views/LoginView.vue'
import SportingView from '../views/SportingView.vue'
import PrefView from '../views/PrefView.vue'
import SecondAstView from '../views/SecondAstView.vue'
import ThirdAstView from '../views/ThirdAstView.vue'
import SecondRfefView from '../views/SecondRfefView.vue'
import ThirdRfefView from '../views/ThirdRfefView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      component: DashboardView
    },
    {
      path: '/login',
      name: 'login',
      component: LoginView
    },
    {
      path: '/sporting',
      name: 'sporting',
      component: SportingView
    },
    {
      path: '/2rfef',
      name: '2 federacion española',
      component: SecondRfefView
    },
    {
      path: '/3rfef',
      name: '3 federacion española',
      component: ThirdRfefView
    },
    {
      path: '/3asturias',
      name: '3 asturias',
      component: ThirdAstView
    },
    {
      path: '/2asturias',
      name: '2 asturias',
      component: SecondAstView
    },
    {
      path: '/1asturias',
      name: '1 asturias',
      component: PrefView
    },


  ]
})

export default router

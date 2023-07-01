<script setup>
  import { ref, reactive } from 'vue';
  import { RouterLink, useRouter } from 'vue-router';
  import AuthService from '../Services/AuthService';
  import { useAuthStore } from '../stores/AuthStore';

  const auth = useAuthStore();
  const router = useRouter();

  const user = ref(''),
    usuarioRules = reactive([
      (v) => !!v || 'Es necesario introducir un usuario',
      (v) => /.+@.+/.test(v) || 'Introduzca un usuario válido',
    ]),
    password = ref(''),
    passwordRules = reactive([
      (v) => !!v || 'Es necesario introducir una contraseña',
      (v) => v.length >= 8 || 'La contraseña debe tener al menos 8 caracteres',
    ]);

  const submitData = async () => {
    const authService = new AuthService();

    const loggedInUser = await authService.login(user.value, password.value);
    auth.setRole(loggedInUser.role);
    auth.setUsername(loggedInUser.username);
    auth.setId(loggedInUser.id);
    auth.setIsAuthenticated();

    if (loggedInUser.role === 'ROLE_ADMIN') {
      router.push('/dashboard/');
    } else {
      router.push('/');
    }
    console.log(loggedInUser);
  };
</script>



<template>
  <div class="login-form">
    <h1>Inciar sesión</h1>
    <form @submit.prevent="submitData">
      <div class="form-group email">
        <label for="usuario"></label>
        <input type="usuario" placeholder="Usuario" id="usuario" v-model="user" :rules="usuarioRules" required>
      </div>
      <div class="form-group password">
        <label for="password"></label>
        <input type="password" placeholder="Password" id="password" v-model="password" :rules="passwordRules" required>
      </div>
      <button type="submit" @click="validate">Login</button>
    </form>
  </div>
</template>


<style scoped>

.login-form {
width: 50%;
  background-color: #007982;
  color: #ffffff;
  padding: 20px;
  border-radius: 5px;
  border: 3px solid #111111
}

.form-group {
  
  margin-bottom: 20px;
}

label {
  font-size: 16px;
  font-weight: bold;
  margin-bottom: 5px;
}

input {
  width: 90%;
  padding: 10px;
  border-radius: 5px;
  border: none;
  background-color: #e6e6e6;
  color: #111111;
}

button{
  background-color: #00d7e8;
  color: #ffffff;
  padding: 10px 20px;
  border-radius: 5px;
  border: none;
  cursor: pointer;
}

button:hover {
  background-color: #111111;
}
</style>

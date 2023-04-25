<template>
  <div class="login-form">
    <h2>Inciar sesión</h2>
    <form>
      <div class="form-group email">
        <label for="email"></label>
        <input type="email" placeholder="E-mail" id="email" v-model="email" required>
      </div>
      <div class="form-group password">
        <label for="password"></label>
        <input type="password" placeholder="Password" id="password" v-model="password" required>
      </div>
      <button type="submit">Login</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      email: '',
      password: ''
    }
  }
}
</script>

<style scoped>

.login-form {
  width: 80%;
  background-color: #00a8b5;
  color: #ffffff;
  padding: 20px;
  border-radius: 5px;
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
  background-color: #007982;
  color: #ffffff;
  padding: 10px 20px;
  border-radius: 5px;
  border: none;
  cursor: pointer;
}

button:hover {
  background-color: #00d7e8;
}
</style>

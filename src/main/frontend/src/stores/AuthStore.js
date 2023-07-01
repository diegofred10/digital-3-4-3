import { ref, watch } from "vue";
import { defineStore } from "pinia";

export const useAuthStore = defineStore("auth", () => {
  const initialState = JSON.parse(localStorage.getItem("auth") || "{}");

  let isAuthenticate = ref(initialState.isAuthenticate || false);
  const username = ref(initialState.username || "");
  const roles = ref(initialState.roles || []);
  const id = ref(initialState.id || "");
  

  watch(
    () => ({
      isAuthenticate: isAuthenticate.value,
      username: username.value,
      roles: roles.value,
      id: id.value,
     
    }),
    (state) => {
      localStorage.setItem("auth", JSON.stringify(state));
    }
  );

  const setRole = (role) => {
    if (!roles.value.includes(role)) {
      roles.value.push(role);
    }
  };

  const setUsername = (newUsername) => {
    username.value = newUsername;
  };

  const setIsAuthenticated = () => {
    isAuthenticate.value = true;
  };

  const setId = (newId) => {
    id.value = newId;
  };


  
  return { isAuthenticate, username, roles, id, 
    setRole, setUsername, setIsAuthenticated, setId};
});
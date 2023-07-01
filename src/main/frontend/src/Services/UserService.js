import axios from "axios";
import { ref } from "vue";

export default class UserService {
    user;
    users;
    #url = "http://localhost:8080/api/users"

    constructor() {
        this.users = ref([]);
        this.user = ref([]);
    }
    
    getUser(){
        return this.user.value
    }
    getUsers(){
        return this.users.value
    }
async fetchAllUsers(){
    try {
        await axios({
            method: "GET",
            url: this.#url,
            withCredentials: true,
        }).then(response =>{
            this.users.value=response.data
            console.log(response.data)
           
        });
        
    } catch (error) {
        console.log(error)
    }
}

async fetchOneUser(id){
    try {
        await axios({
            method: "GET",
            url: this.#url + "/" + id,
            withCredentials: true,
        }).then(response =>{
            this.user.value=response.data
            console.log(response.data)
           
        });
        
    } catch (error) {
        console.log(error)
    }
}
}


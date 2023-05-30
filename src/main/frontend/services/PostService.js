import axios from "axios";
import { ref } from "vue";

export default class PostService {
    post;
    #url = "http://localhost:8080/api/posts"

    constructor() {
        this.post = ref([]);
    }

    getPost() {
        return this.post.value
    }

    async submitPost(postData) {
        try {
            axios({
                method: "POST",
                url: this.#url + "/add",
                data: postData,
                withCredentials: true,

            }).then(response => {
                console.log(response)
            });

        } catch (error) {
            console.log(error);

        }
    }

    async fetchAllPost(){
        try {
            await axios({
                method: "GET",
                url: this.#url,
                withCredentials: true,
            }).then(response =>{
                this.post.value=response.data
                console.log(response.data) 
            });
        
        } catch (error) {
            console.log(error)
        }
    }
}
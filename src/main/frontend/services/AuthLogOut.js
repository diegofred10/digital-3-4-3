import axios from "axios";


export default class AuthLogOut {
    #baseUrl = "http://localhost:8080";
    #auth = "";

    async logout() {
        try {
            localStorage.removeItem("auth")
            
            const response = await axios.get(`${this.#baseUrl}/api/logout`, {
                withCredentials: true
            });
        }
        catch (error) {
            console.log(error)
        }
    }
}

import AuthConnection from "./AuthConnection";
import AuthRegister from "./AuthRegister";
import AuthLogOut from "./AuthLogOut";

export default class AuthService {

  #conn;
  #reg;
  #logout;

  constructor() {
    this.#conn = new AuthConnection();
    this.#reg = new AuthRegister();
    this.#logout = new AuthLogOut();
  }

  async login(username, password) {
    console.log(username, password)
    return await this.#conn.login(username, password);
  }

  async register(username, password) {
    console.log(username, password)
     await this.#reg.register(username, password);
  }

  async logout() {
    await this.#logout.logout();
  }

}
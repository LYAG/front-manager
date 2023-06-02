import axios from 'axios'

const CLIENT_API_BASE_URL = 'http://172.20.10.7:8081/api/clients'
class ClientService {
  async getClient(){
    return axios.get(CLIENT_API_BASE_URL);
  }
}

export default new ClientService()

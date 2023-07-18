import axios from "axios"


export const signup = (body) =>{

    return axios.post('http://localhost:8080/api/1.0/users', body)
}
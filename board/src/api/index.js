import axios from "axios";

const BASE_URL = import.meta.env.BASE_URL;

export const api = async (path, method, data) => {
  const uid = localStorage.getItem("uid");
  const res = axios({
    url: BASE_URL + path,
    method,
    data,
    headers: {
      Authorization: uid,
    },
  });
  console.log(res);
  return res;
};

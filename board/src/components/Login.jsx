import { useState } from "react";
import { register } from "../api/auth";
import { useNavigate } from "react-router-dom";
import Button from "../atom/Buttom";
import Input from "../atom/Input";

const name = "";
const password = "";
const Login = () => {
  const navigate = useNavigate();
  const [state, setState] = useState({
    name,
    password,
  });
  const [err, setErr] = useState("");

  const onChange = (e) => {
    const { name, value } = e.target;
    setState({ ...state, [name]: value });
  };

  const onSubmit = async () => {
    setErr("");
    try {
      const data = await register(state);
      localStorage.setItem("uid", data.id);
      navigate("/boards");
    } catch (error) {
      const data = error.reponse.data;
      setErr(data);
    }
  };

  return (
    <div>
      <Input type="text" name="name" onChange={onChange} placeholder="아이디" />
      <br />
      <Input
        type="password"
        name="password"
        onChange={onChange}
        placeholder="비밀번호"
      />
      <br />
      <Button onClick={onSubmit}>로그인</Button>
      <Button onClick={() => navigate("/register")}>회원가입</Button>
      <h1 style={{ color: "red" }}>{err}</h1>
    </div>
  );
};

export default Login;

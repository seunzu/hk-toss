import { Link, Outlet } from "react-router-dom";

const Template = () => {
  return (
    <div>
      <Link to="/">로그인</Link>
      <Link to="/boards"> 게시판</Link> <br />
      <Outlet />
    </div>
  );
};

export default Template;

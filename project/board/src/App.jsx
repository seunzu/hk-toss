import "./App.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Board from "./components/board/Board";
import Content from "./components/board/Content";
import Template from "./components/template";
import Login from "./components/Login";
import Register from "./components/Register";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Template />,
    children: [
      {
        path: "/",
        element: <Login />,
      },
      {
        path: "/register",
        element: <Register />,
      },
      {
        path: "/boards",
        element: <Board />,
      },
      {
        path: "/boards:id",
        element: <Content />,
      },
    ],
  },
]);

function App() {
  return (
    <>
      <RouterProvider router={router} />
    </>
  );
}

export default App;

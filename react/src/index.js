import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import { RecoilRoot } from "recoil";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Person from "./components/person";
import Calc from "./components/calc";
import Template from "./components/template/Template";
import Test from "./components/test/Test";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Template />,
    children: [
      {
        // localhost:3000
        path: "/",
        element: <Test />,
      },
      {
        // localhost:3000/test
        path: "/test",
        element: <Calc />,
      },
      {
        // localhost:3000/news/it/1 localhost:3000/news/it/2
        path: "/news/it/:id",
        element: <Calc />,
      },
    ],
  },
]);

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <RecoilRoot>
    <RouterProvider router={router} />
  </RecoilRoot>
);

reportWebVitals();

import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";
import App2 from "./components/App2";

function App() {
  const [text, setText] = useState("");
  console.log("app");
  return (
    <div className="App">
      <h1>App</h1>
      <input onChange={(e) => setText(e.target.value)} />
      <h2>{text}</h2>
      <App2 />
    </div>
  );
}

export default App;

import "../App.css";
import { useState } from "react";

function App2() {
  const [text, setText] = useState("");
  console.log("app");
  return (
    <div className="App">
      <h1>App</h1>
      <input onChange={(e) => setText(e.target.value)} />
      <h2>{text}</h2>
    </div>
  );
}

export default App2;

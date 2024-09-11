import "./App.css";
import Test from "../src/components/test/Test";
import { useState } from "react";
import Calc from "./components/calc";

//component .jsx
function App() {
  const [page, setPage] = useState("Test");
  return (
    <div className="App">
      <button onClick={() => setPage("Test")}> Test</button>
      <button onClick={() => setPage("calc")}> calc</button>
      {page === "Test" && <Test />}
      {page === "calc" && <Calc />}
    </div>
  );
}

export default App;

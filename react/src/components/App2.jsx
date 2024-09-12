import React from "react";

//component .jsx
function App2() {
  const [text, setText] = React.useState("");
  console.log("app2");

  return (
    <div className="App">
      <h1>App2</h1>
      <input onChange={(e) => setText(e.target.value)} />
      <h2>{text}</h2>
    </div>
  );
}

export default App2;

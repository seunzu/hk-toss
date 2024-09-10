import React, { useState } from "react";
import Log from "./components/Log";

const Test2 = () => {
  const [txt, setTxt] = useState("");
  const [logs, setLogs] = useState([]);
  const onChangeTxt = (e) => {
    setTxt(e.target.value);
    setLogs([...logs, e.target.value]);
  };

  // 조건부 렌더링
  return (
    <div>
      <input name="text" onChange={onChangeTxt} />
      {logs.map((str, i) => i % 2 === 0 && <Log i={i} str={str} />)}
    </div>
  );
};
export default Test2;

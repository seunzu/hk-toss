import React, { useState } from "react";

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
      {logs.map(logsRender)}
    </div>
  );
};
export default Test2;

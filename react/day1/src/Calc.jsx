import React, { useState } from "react";
import { calcUtil } from "./utils/CalcUtil";

const Calc = () => {
  const [result, setResult] = useState(0);
  const [target, setTarget] = useState(0);
  const onChangeTarget = (e) => setTarget(Number(e.target.value));

  const onChangeResult = (targetFunc) => {
    const newResult = targetFunc(result, target);
    setResult(newResult);
  };

  // const add = () => {
  //   setResult(result + target);
  // };

  // const diff = () => {
  //   setResult(result - target);
  // };

  // const calculate = (type) => {
  //   if (type === "+") add();
  //   if (type === "-") diff();
  // };

  return (
    <div>
      <h1>{result}</h1>
      <input type="number" onChange={onChangeTarget} />
      {/* <button onClick={() => calculate("+")}>+</button>
      <button onClick={() => calculate("-")}>-</button> */}
      {calcUtil.map((obj) => (
        <button onClick={() => onChangeResult(obj.func)}>{obj.name}</button>
      ))}
    </div>
  );
};

export default Calc;

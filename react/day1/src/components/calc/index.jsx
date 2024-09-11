import React, { useState } from "react";
import ResultView from "./calc/ResultView";
import CalcHandler from "./calc/CalcHandler";

const Calc = () => {
  return (
    <div>
      <ResultView />
      <CalcHandler />
    </div>
  );
};

export default Calc;

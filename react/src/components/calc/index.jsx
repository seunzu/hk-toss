import ResultView from "./ResultView";
import CalcHandler from "./CalcHandler";
import { Link, useLoaderData } from "react-router-dom";

const Calc = () => {
  const data = useLoaderData();
  console.log(data);
  console.log("Calc");

  return (
    <div>
      <ResultView />
      <CalcHandler />
    </div>
  );
};

export default Calc;

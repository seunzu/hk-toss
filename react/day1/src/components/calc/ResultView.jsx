import resultState from "../../store/calc";
import { useRecoilValue } from "recoil";

const ResultView = () => {
  const result = useRecoilValue(resultState);
  return <h1>{result}</h1>;
};

export default ResultView;

import { atom } from "recoil";

const resultState = atom({
  key: "calcResultState",
  default: 0,
});

export default resultState;

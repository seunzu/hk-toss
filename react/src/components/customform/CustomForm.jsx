import { useState } from "react";
import { submitSupportFunc } from "../../utils";

const CustomForm = () => {
  const [state, setState] = useState({ name: "", age: 0 });
  const onSubmitHandler = (e) => {
    const data = submitSupportFunc(e);
    console.log(data);
  };
  return (
    <form onSubmit={onSubmitHandler}>
      <input name="name" required />
      <br />
      <input name="age" />
      <br />
      <input type="submit" />
    </form>
  );
};
export default CustomForm;

import { submitSupportFunc } from "../../utils";
import Input from "../../atom/Input";
import Form from "../../atom/Form";

const CustomForm = () => {
  const onSubmitHandler = (e) => {
    const data = submitSupportFunc(e);
    console.log(data);
  };

  return (
    <Form onSubmit={onSubmitHandler} warning={true}>
      <Input name="name" required />
      <br />
      <Input name="age" />
      <br />
      <Input type="submit" />
    </Form>
  );
};

export default CustomForm;

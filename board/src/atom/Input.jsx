import styled from "styled-components";

const CustomInput = styled.textarea`
  width: ${(props) => props.width || "200px"};
  height: ${(props) => props.height || "25px"};
  resize: none;
  margin: 10px;
  font-size: 16px;
  line-height: 1.5;
`;
const Input = ({ ...props }) => {
  return <CustomInput {...props} />;
};

export default Input;

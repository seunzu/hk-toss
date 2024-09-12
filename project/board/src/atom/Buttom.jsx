import styled from "styled-components";

const CustomButton = styled.button`
  margin: 10px;
`;

const Button = ({ children, onClick, ...props }) => {
  return (
    <CustomButton {...props} onClick={onClick}>
      {children}
    </CustomButton>
  );
};

export default Button;

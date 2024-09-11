const Input = (props) => {
  console.log(props);
  return <input style={{ borderColor: "red" }} {...props} />;
};

export default Input;

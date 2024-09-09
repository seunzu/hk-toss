export default Log = (str, i) =>
  i % 2 === 0 && <p key={i + " " + str}>{str}</p>;

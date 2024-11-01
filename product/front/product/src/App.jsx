import { useState } from "react";
import "./App.css";
import axios from "axios";
import { useEffect } from "react";
/*
product 
id name quantity price
c r 
sell quantity - 1
receiving goods + 1
*/
const initProduct = {
  name: "",
  price: 0,
};
const getAllProductsApi = async () => {
  const { data } = await axios({
    method: "GET",
    url: "http://localhost:8080/api/v1/products",
  });
  return data;
};
const sellingApi = async (id) => {
  const { data } = await axios({
    method: "PUT",
    url: `http://localhost:8080/api/v1/products/${id}/selling`,
  });
};
const receivingApi = async (id) => {
  const { data } = await axios({
    method: "PUT",
    url: `http://localhost:8080/api/v1/products/${id}/receiving`,
  });
};
const addProductApi = async (product) => {
  const { data } = await axios({
    method: "POST",
    url: `http://localhost:8080/api/v1/products`,
    data: product,
  });
};

function App() {
  const [product, setProduct] = useState({ ...initProduct });
  const [products, setProducts] = useState([]);
  const getAllProducts = async () => {
    const data = await getAllProductsApi();
    setProducts([...data]);
  };
  useEffect(() => {
    getAllProducts();
  }, []);
  const onChangeHandler = (e) => {
    const { name, value } = e.target;
    setProduct({ ...product, [name]: value });
  };
  const addProduct = (e) => {
    e.preventDefault();
    addProductApi(product);
    setProduct({ ...initProduct });
    // setProducts([...products, {...product, quantity:0, id: products.length+1}])
  };
  const addQuantity = (id) => {
    receivingApi(id);
    // const newProducts = products.map((el)=>el.id === id ? {...el, quantity: el.quantity+1}:el)
    // setProducts(newProducts)
  };
  const sellQuantity = (id) => {
    const product = products.find((el) => el.id === id && el.quantity > 0);
    if (!product) {
      alert("재고 부족");
      return;
    }
    sellingApi(id);
    // const newProducts = products.map((el)=>el.id === id ? {...el, quantity: el.quantity-1}:el)
    // setProducts(newProducts)
  };

  return (
    <div style={{ display: "flex", gap: 30 }}>
      <div>
        <h1>제품 등록</h1>
        <hr />
        <form onSubmit={addProduct}>
          <input name="name" onChange={onChangeHandler} value={product.name} />
          <br />
          <input
            name="price"
            onChange={onChangeHandler}
            value={product.price}
          />
          <br />
          <button>등록</button>
        </form>
      </div>
      <div>
        <h1>제품 보기</h1>
        <hr />
        <button onClick={getAllProducts}>새로고침</button>
        <hr />
        <table>
          <thead>
            <th>id</th>
            <th>name</th>
            <th>quantity</th>
            <th>price</th>
            <th></th>
            <th></th>
          </thead>
          <tbody>
            {products.map((el) => (
              <tr key={el.id}>
                <td>{el.id}</td>
                <td>{el.name}</td>
                <td>{el.quantity}</td>
                <td>{el.price}</td>
                <td>
                  <button onClick={() => sellQuantity(el.id)}>사기</button>
                </td>
                <td>
                  <button onClick={() => addQuantity(el.id)}>채우기</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;

import { useEffect, useState } from "react";
import { getBoards } from "../../api/boards";
import { useNavigate } from "react-router-dom";
import Create from "./Create";

const Board = () => {
  const navigate = useNavigate();
  const [posts, setPosts] = useState([]);

  const loadBoards = async () => {
    const data = await getBoards();
    setPosts(data);
  };

  useEffect(() => {
    loadBoards();
  }, []);

  const handleClick = (idx) => {
    navigate(`/board/${idx}`);
  };

  return (
    <>
      <h2>게시글 작성</h2>
      <Create /> <hr />
      <h2>게시글 리스트</h2>
      <ul>
        {posts.map((post, index) => (
          <li key={post.id} onClick={() => handleClick(index)}>
            <h3>{post.title}</h3>
            <p>{post.content}</p>
          </li>
        ))}
      </ul>
    </>
  );
};

export default Board;

import { useEffect, useState } from "react";
import { useParams, useNavigate } from "react-router-dom";
import Button from "../../atom/Buttom";
import { getBoardId, updateBoard, deleteBoard } from "../../api/boards";

const Content = () => {
  const { id } = useParams();
  const [post, setPost] = useState(null);
  const navigate = useNavigate();

  const loadPost = async () => {
    try {
      const data = await getBoardId(id);
      const post = data[id];
      setPost(post);
    } catch (error) {
      console.error("게시글을 불러오는 중 오류 발생:", error);
    }
  };

  useEffect(() => {
    loadPost();
  }, [id]);

  const handleUpdate = async () => {
    await updateBoard(id, post);
    updateBoard();
  };

  const handleDelete = async () => {
    await deleteBoard(id);
    navigate("/board");
  };

  return (
    <>
      <div>
        <h2>{post.title}</h2>
        <p>{post.content}</p>
      </div>
      <Button onClick={handleUpdate}>수정</Button>
      <Button onClick={handleDelete}>삭제</Button>
    </>
  );
};

export default Content;

import { useState } from "react";
import Button from "../../atom/Buttom";
import Form from "../../atom/Form";
import Input from "../../atom/Input";
import { addBoard } from "../../api/boards";

const Create = () => {
  const [post, setPost] = useState({ title: "", content: "" });
  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setPost((prevPost) => ({
      ...prevPost,
      [name]: value,
    }));
  };

  const handleAddBoard = async (e) => {
    e.preventDefault();
    await addBoard(post);
    setPost({ title: "", content: "" });
  };

  return (
    <>
      <Form onSubmit={handleAddBoard}>
        <Input
          name="title"
          value={post.title}
          onChange={handleInputChange}
          placeholder="Title"
          width="500px"
        />
        <br />
        <Input
          name="content"
          value={post.content}
          onChange={handleInputChange}
          placeholder="Content"
          width="500px"
          height="500px"
        />
        <br />
        <Button type="submit" onClick={addBoard}>
          등록
        </Button>
      </Form>
    </>
  );
};

export default Create;

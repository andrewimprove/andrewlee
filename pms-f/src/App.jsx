import React from "react";
import userService from "./api/userService";

function App() {
  const handleCreateUser = () => {
    userService.createUser(); // calls your Axios POST request
  };

  return (
    <div style={{ padding: "2rem" }}>
      <h1>Create User Test</h1>
      <button onClick={handleCreateUser}>Create Hard-Coded User</button>
    </div>
  );
}

export default App;

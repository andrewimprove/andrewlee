import axios from "axios";

const userService = {
  createUser: async () => {
    try {
      const response = await axios.post("http://localhost:8080/users/save", { userName: "JohnDoe" });

      console.log("User created:", response.data);
    } catch (error) {
      console.error("Error creating user:", error.response?.data || error.message);
    }
  }
};

export default userService;

import React, { useState } from 'react';
import axios from 'axios';

const PostButton = () => {
    const [data, setData] = useState(null);

    }
function userForm(){
return (
    <>
    <form>
        <div className= "user-form">
            <label>Username</label>
            <input type="text" className="form-input"/>
            <span className="error-message">Username required</span>
        </div>
        <button className="submit-btn">Create User</button>
    </form>
    </>
)

} export default userForm;
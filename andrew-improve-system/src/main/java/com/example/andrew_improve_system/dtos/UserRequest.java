package com.example.andrew_improve_system.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class UserRequest {
    @NotBlank(message = "Username cannot be blank")
    @JsonProperty("userName")
    private String userName;

    private String passWord;

    public UserRequest(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
package com.example.andrew_improve_system.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class UserRequest {
    @NotBlank(message = "Username cannot be blank")
    @JsonProperty("userName")
    private String userName;

    public UserRequest() {}

    public UserRequest(String userName) {
        this.userName = userName;
    }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
}
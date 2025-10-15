package com.example.andrew_improve_system.controllers;
import com.example.andrew_improve_system.dtos.UserRequest;
import com.example.andrew_improve_system.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    private UserRequest userRequest;
    //Create User
    @PostMapping("/save")
    public void createUser(@RequestBody UserRequest userRequest){

    }

    //Read user

    //Update User

    //Delete User

}

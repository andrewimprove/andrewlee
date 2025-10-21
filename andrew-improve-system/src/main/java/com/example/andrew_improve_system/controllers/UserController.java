package com.example.andrew_improve_system.controllers;

import com.example.andrew_improve_system.dtos.UserRequest;
import com.example.andrew_improve_system.entities.User;
import com.example.andrew_improve_system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User createUser(@RequestBody UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}
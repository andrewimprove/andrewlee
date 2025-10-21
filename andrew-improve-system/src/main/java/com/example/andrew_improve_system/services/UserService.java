package com.example.andrew_improve_system.services;

import com.example.andrew_improve_system.dtos.UserRequest;
import com.example.andrew_improve_system.entities.User;
import com.example.andrew_improve_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setUserName(userRequest.getUserName());
        user.setPassword(userRequest.getPassword());
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
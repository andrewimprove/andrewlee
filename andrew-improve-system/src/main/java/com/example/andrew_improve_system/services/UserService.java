package com.example.andrew_improve_system.services;

import com.example.andrew_improve_system.dtos.UserRequest;
import com.example.andrew_improve_system.entities.User;
import com.example.andrew_improve_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // THIS IS CRITICAL
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserRequest userRequest) {
        System.out.println("UserService.createUser called with: " + userRequest.getUserName());
        User user = new User();
        user.setUserName(userRequest.getUserName());
        User savedUser = userRepository.save(user);
        System.out.println("User saved with ID: " + savedUser.getId());
        return savedUser;
    }
}
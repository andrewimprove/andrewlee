package com.example.andrew_improve_system.services;

import com.example.andrew_improve_system.dtos.UserRequest;
import com.example.andrew_improve_system.entities.Role;
import com.example.andrew_improve_system.entities.User;
import com.example.andrew_improve_system.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(UserRequest userRequest){
        User user = new User();
        user.setId(userRequest.getId());
        user.setUserName(userRequest.getUserName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setProfilePicture(userRequest.getProfilePicture());
        user.setRole(Role.USER);

        return userRepository.save(user);
    }
}

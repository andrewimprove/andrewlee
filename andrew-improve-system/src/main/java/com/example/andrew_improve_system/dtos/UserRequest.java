package com.example.andrew_improve_system.dtos;

import com.example.andrew_improve_system.entities.Role;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRequest {

    private Long id;
    @Size(max = 50)
    @NotNull
    private String userName;
    @Size(max = 100)
    @NotNull
    private String email;
    @NotNull
    @Size(max = 2000)
    private String password;
    @Size(max = 100)
    private String firstName;
    @Size(max = 100)
    private String LastName;
    private String profilePicture;
    @NotNull
    private Role role;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public Role getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

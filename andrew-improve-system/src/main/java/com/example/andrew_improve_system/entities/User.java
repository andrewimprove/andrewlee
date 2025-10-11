package com.example.andrew_improve_system.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class User{

    @Id
    private String id;
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

    public String getUserName(){
        return userName;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}




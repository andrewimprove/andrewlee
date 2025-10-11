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

}



package com.example.andrew_improve_system.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;


    // Getters and Setters
    public Long getId() { return id; }
    public String getUserName() { return userName; }


    public void setId(Long id) { this.id = id; }
    public void setUserName(String userName) { this.userName = userName; }

}

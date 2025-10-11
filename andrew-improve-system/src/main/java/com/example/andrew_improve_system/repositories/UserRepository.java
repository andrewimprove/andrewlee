package com.example.andrew_improve_system.repositories;

import com.example.andrew_improve_system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
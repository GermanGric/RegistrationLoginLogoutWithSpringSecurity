package com.example.registrationloginlogoutwithspringsecurity.repository;


import com.example.registrationloginlogoutwithspringsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
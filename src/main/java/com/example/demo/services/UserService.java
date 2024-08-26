package com.example.demo.services;

import java.util.List;
import java.util.Optional;


import com.example.demo.entities.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);

}
package com.example.crudProject2.service;

import com.example.crudProject2.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);

    void editUser(User user);
}

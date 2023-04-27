package com.example.crudProject2.repository;



import com.example.crudProject2.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);

    User findById(Long id);

    void editUser(User user);
}

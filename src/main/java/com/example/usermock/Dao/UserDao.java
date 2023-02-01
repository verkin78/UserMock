package com.example.usermock.Dao;

import com.example.usermock.Models.User;

import java.util.List;

public interface UserDao {

    String getUserByName(String name);

    List<User> findAllUsers();
}

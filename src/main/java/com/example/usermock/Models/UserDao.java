package com.example.usermock.Models;

import java.util.List;

public interface UserDao {

    String getUserByName(String name);

    List<User> findAllUsers();
}

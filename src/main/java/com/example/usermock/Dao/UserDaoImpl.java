package com.example.usermock.Dao;

import com.example.usermock.Dao.UserDao;
import com.example.usermock.Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        users.add(new User("Roman"));
        users.add(new User("Veronika"));
        users.add(new User("Egor"));
    }


    @Override
    public String getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user.getName();
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}

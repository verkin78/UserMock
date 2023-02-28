package com.example.usermock.Services;

import com.example.usermock.Models.User;
import com.example.usermock.Dao.UserDao;
import com.example.usermock.Dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = new UserDaoImpl();
    }
    @Override
    public Boolean checkUserExist(User user) {
        if (userDao.findAllUsers().contains(user)) {
            return userDao.findAllUsers().contains(user);
        } else {
            return false;
        }
    }
}

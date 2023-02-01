package com.example.usermock.Test;

import com.example.usermock.Models.User;
import com.example.usermock.Dao.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    private UserDaoImpl userDao = new UserDaoImpl();
    private User name = new User("Veronika");
    private User name1 = new User();

    @Test
    public void getUserByName() {
        Assertions.assertNotNull(userDao.getUserByName(name.getName()));
        Assertions.assertEquals(userDao.getUserByName(name.getName()),name.getName());
    }

    @Test
    public void getUserByNameIsNull() {
        Assertions.assertNull(userDao.getUserByName(name1.getName()));
    }
}

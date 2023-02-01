package com.example.usermock.Test;

import org.example.dao.UserDaoImpl;
import org.example.models.User;
import org.example.services.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private User user = new User("Юрий");
    private User user1 = new User();


    private UserServiceImpl userService;


    @Mock
    private UserDaoImpl userDao;

    @BeforeEach
    public void init1() {
        MockitoAnnotations.initMocks(this);
        userService = Mockito.spy(new UserServiceImpl(userDao));
    }

    @Test
    public void checkUserExistTestTrue() {
        Assertions.assertNotNull(userService);
        Mockito.when(userService.checkUserExist(user)).thenReturn(true);
        Assertions.assertTrue(userService.checkUserExist(user));
        //first test
    }

    @Test
    public void checkUserExistTestIsFalse() {
        Assertions.assertNotNull(userService);
        Mockito.when(userService.checkUserExist(user1)).thenReturn(false);
        Assertions.assertFalse(userService.checkUserExist(user1));
        //Second test
    }
}


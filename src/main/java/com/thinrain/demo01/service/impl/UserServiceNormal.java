package com.thinrain.demo01.service.impl;

import com.thinrain.demo01.dao.UserDao;
import com.thinrain.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserServiceNormal implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add() {
        userDao.add();
        System.out.println("注册成功!");
    }
}

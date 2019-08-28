package com.thinrain.demo02.service.impl;

import com.thinrain.demo02.dao.UserDao;
import com.thinrain.demo02.service.UserService;

public class UserServiceNormal implements UserService {
    private UserDao userDao;

    public UserServiceNormal(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    public void add(){
        userDao.add();
    }
}

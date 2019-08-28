package com.thinrain.demo02.service.impl;

import com.thinrain.demo02.service.UserService;
import com.thinrain.demo02.dao.UserDao;

public class UserServiceFestival implements UserService {
    private UserDao userDao;

    public UserServiceFestival(UserDao userDao) {
        super();
        this.userDao = userDao;
    }
    public void add(){
        userDao.add();
        System.out.println("注册成功，发放节日优惠券");
    }
}

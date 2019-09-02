package com.thinrain.aop2.service.impl;

import com.thinrain.aop2.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public void addUser() {
        System.out.println("增加用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户");

    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");

    }
}

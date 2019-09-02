package com.thinrain.aop1.service.impl;

import com.thinrain.aop1.model.User;
import com.thinrain.aop1.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {

    @Override
    public void add() {
        System.out.println("空添加");
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户");

    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("删除用户"+id);

    }
}

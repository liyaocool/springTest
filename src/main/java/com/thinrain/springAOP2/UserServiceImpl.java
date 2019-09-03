package com.thinrain.springAOP2;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("增加用户..");
    }

    @Override
    public void update() {
        System.out.println("更新用户..");

    }

    @Override
    public void delete() {
        System.out.println("删除用户..");

    }
}

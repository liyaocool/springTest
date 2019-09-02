package com.thinrain.aop1.dao.impl;

import com.thinrain.aop1.dao.IUserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao {
    public void addUser() {
        System.out.println("add user dao..");
    }
    public void updateUser() {
        System.out.println("updateUser dao..");
    }
    public void deleteUser() {
        System.out.println("deleteUser dao..");
    }
}

package com.thinrain.demo01.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void add(){
        System.out.println("数据库添加用户...");
    }
}

package com.thinrain.demo01.service.com.thinrain.demo01.service.impl;

import com.thinrain.demo01.service.UserService;
import org.springframework.stereotype.Component;


@Component
public class UserServiceNormal implements UserService {

    public void add() {
        System.out.println("添加用户成功!");
    }
}

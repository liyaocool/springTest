package com.thinrain.demo01.service.com.thinrain.demo01.service.impl;

import com.thinrain.demo01.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFestival implements UserService {
    public void add() {
        System.out.println("添加节日特惠用户成功!");
    }
}

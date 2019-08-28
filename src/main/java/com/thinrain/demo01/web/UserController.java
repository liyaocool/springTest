package com.thinrain.demo01.web;

import com.thinrain.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(@Qualifier("userServiceFestival") UserService userService) {
        this.userService = userService;
    }


    public void add() {
        userService.add();
    }
}

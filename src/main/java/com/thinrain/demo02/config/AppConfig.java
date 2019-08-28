package com.thinrain.demo02.config;

import com.thinrain.demo02.dao.UserDao;
import com.thinrain.demo02.service.UserService;
import com.thinrain.demo02.service.impl.UserServiceFestival;
import com.thinrain.demo02.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.thinrain.demo02")
public class AppConfig {
    @Bean
    public UserDao userDao() {
        System.out.println("创建显式UserDao对象");
        return new UserDao();
    }

    @Bean
    public UserService userServiceNormal() {
        System.out.println("创建显式userServiceNormal对象");
        UserDao userDao = userDao();
        return new UserServiceNormal(userDao);
    }

    //同为显式装配，spring本身会保留已有的new UserDao(),便以复用，这里可直接传参调用spring内的userDao
    @Bean
    public UserService userServiceFestival(UserDao userDao) {
        return new UserServiceFestival(userDao);
    }
}

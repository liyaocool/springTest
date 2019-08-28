package com.thinrain.demo02.config;

import com.thinrain.demo02.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.thinrain.demo02")
public class AppConfig {
    @Bean
    public UserDao userDao() {
        System.out.println("创建显式对象");
        return new UserDao();
    }
}

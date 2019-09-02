package com.thinrain.aop2;

import com.thinrain.aop2.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
        IUserService userService = (IUserService) context.getBean("serviceProxy");
        userService.addUser();
    }
}

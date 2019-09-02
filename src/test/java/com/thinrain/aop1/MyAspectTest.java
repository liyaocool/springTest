package com.thinrain.aop1;

import com.thinrain.aop1.service.IUserService;
import com.thinrain.aop1.service.MyBeanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MyAspectTest {

    @Test
    public void test(){
        //实现自用的AOP变成,使用了JDK代理实现
        IUserService userService = MyBeanFactory.createUserService();
        userService.deleteUser(3);
    }
}

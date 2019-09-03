package com.thinrain.springAOP1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springAOP1.xml");
        IUserService service = context.getBean(IUserService.class);
        service.add();
    }
}

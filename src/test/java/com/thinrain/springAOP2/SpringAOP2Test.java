package com.thinrain.springAOP2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOP2Test {
    @Test
    public void aop2Test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IUserService service = context.getBean(IUserService.class);
        service.delete();
    }
}

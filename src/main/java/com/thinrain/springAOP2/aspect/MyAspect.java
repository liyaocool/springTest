package com.thinrain.springAOP2.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * aspect 切面
 * 范围: 切点,那些方法需要被增强
 * 增强的逻辑: 具体加入什么增强
 */

@Component
@Aspect
public class MyAspect {

    @Before("execution(* com.thinrain.springAOP2.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("前置增强,比如创建连接对象");
    }

    @After("execution(* com.thinrain.springAOP2.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("后置增强,比如关闭连接对象");
    }
}

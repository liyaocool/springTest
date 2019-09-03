package com.thinrain.springAOP1.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * aspect 切面
 * 范围: 切点,那些方法需要被增强
 * 增强的逻辑: 具体加入什么增强
 */

public class MyAspect {

    public void before(){
        System.out.println("前置增强,比如创建连接对象");
    }

    public void after(){
        System.out.println("后置增强,比如关闭连接对象");
    }
}

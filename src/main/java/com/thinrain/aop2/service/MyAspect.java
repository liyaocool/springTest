package com.thinrain.aop2.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //拦截方法

        System.out.println("开启事务...");
        //放行
        Object retObj = methodInvocation.proceed();
        System.out.println("拦截:"+retObj);
        System.out.println("提交事务...");
        return retObj;
    }
}

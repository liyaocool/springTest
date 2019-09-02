package com.thinrain.aop1.service;

import com.thinrain.aop1.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static IUserService createUserService() {
        //1.创建目标对象
        IUserService userServiceImpl = new UserServiceImpl();

        //2.声明切面对象
        MyAspect aspect = new MyAspect();

        //3.把 切面类 2个方法 应用到 目标类

        //3.1 创建代理类
        return (IUserService) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //开启事务
                        aspect.before();

                        Object retObj = method.invoke(userServiceImpl, args);
                        System.out.println("拦截返回值:" + retObj);


                        //提交事务
                        aspect.after();

                        return null;
                    }
                }
        );
    }
}

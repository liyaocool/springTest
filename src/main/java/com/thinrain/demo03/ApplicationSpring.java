package com.thinrain.demo03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("应用启用...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo03-constructor.xml");

        CompactDisc cd = (CompactDisc) context.getBean("compactDisc1");
        cd.play();
    }
}

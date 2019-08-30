package com.thinrain.demo04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo04Context.xml")
public class NotePadTest {
//    单例Bean
//    无论注入多少次,也只有一个对象
    @Autowired
    private NotePad notePad1;

    @Autowired
    private NotePad notePad2;

    @Test
    public void runTest(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo04Context.xml");
//        无论获取多少次,只有一个对象
//        Object notePad1 = context.getBean("NotePad");
//        Object notePad2 = context.getBean("NotePad");
    }
}

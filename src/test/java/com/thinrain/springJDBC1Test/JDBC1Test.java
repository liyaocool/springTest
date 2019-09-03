package com.thinrain.springJDBC1Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBC1Test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC1.xml");
        JdbcTemplate jdbc = context.getBean(JdbcTemplate.class);
        System.out.println(jdbc);
    }
}

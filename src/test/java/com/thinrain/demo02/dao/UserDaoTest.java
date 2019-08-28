package com.thinrain.demo02.dao;

import com.thinrain.demo02.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void runTest() {
        userDao.add();
    }
}

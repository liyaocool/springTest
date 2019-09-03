package com.thinrain.demo03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo03-constructor.xml")
public class AppTest {
    @Autowired
    private CompactDisc compactDisc1;

//    @Autowired
//    private CompactDisc compactDisc2;
//
//    @Autowired
//    @Qualifier("compactDisc31")
//    private CompactDisc compactDisc3;

    @Test
    public void runTest() {
        compactDisc1.play();
//        compactDisc2.play();
//        compactDisc3.play();
    }
}

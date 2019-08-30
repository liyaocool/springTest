package com.thinrain.demo04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NotePad2Config.class)
public class NotePad2Test {

    @Autowired
    private NotePad2 notePad21;

    @Autowired
    private NotePad2 notePad22;

    @Test
    public void runTest(){

    }
}

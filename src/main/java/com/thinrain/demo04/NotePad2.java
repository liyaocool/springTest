package com.thinrain.demo04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class NotePad2 {
    public NotePad2() {
        super();
        System.out.println("NotePad2构造函数" + this.toString());
    }
}

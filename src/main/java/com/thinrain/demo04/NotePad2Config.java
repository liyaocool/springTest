package com.thinrain.demo04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class NotePad2Config {
    @Bean
    @Scope("prototype")
    public NotePad2 notePad2(){
        return new NotePad2();
    }
}

package com.thinrain.aop1.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String name;

    public User() {
        super();
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

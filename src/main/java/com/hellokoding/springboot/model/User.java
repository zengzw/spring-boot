/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.model;

/**
 *
 * @author zengzw
 * @date 2017年3月24日
 */
public class User {

    private Long id; 
    
    private String name; 
    
    private Integer age;
    
    public Integer getAge() {
        return age;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    } 
}

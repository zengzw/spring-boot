/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.mybatismapper;

import java.io.Serializable;

/**
 *
 * @author zengzw
 * @date 2017年3月24日
 */

public class MybartisUser implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 3791711276264771891L;

    /**
     * 
     */
    public MybartisUser() {
    }
    
    public MybartisUser(String name,int age){
        this.name = name;
        this.age = age;
    }


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

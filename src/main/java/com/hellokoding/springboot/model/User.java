/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author zengzw
 * @date 2017年3月24日
 */
@Entity
public class User implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 3791711276264771891L;

    /**
     * 
     */
    public User() {
    }
    
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue
    private Long id; 
    
    @Column(name="name")
    private String name; 
    
    @Column(name="age")
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

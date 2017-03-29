/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.mongodb;

import javax.persistence.Id;

/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
public class MongoUser {
    public MongoUser(){}
    
    public MongoUser(Long id,String userName,Integer age){
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    @Id
    private Long id;
    
    
    private String userName;
    
    
    private Integer age;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
}

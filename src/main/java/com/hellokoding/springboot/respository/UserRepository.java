/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hellokoding.springboot.model.User;

/**
 *
 *
 *，通过查看JpaRepository接口的API文档，
 * 可以看到该接口本身已经实现了创建（save）、更新（save）、删除（delete）、查询（findAll、findOne）等基本操作的函数，
 * 因此对于这些基础操作的数据访问就不需要开发者再自己定义。
 * 
 * 
 * @author zengzw
 * @date 2017年3月28日
 */
public interface UserRepository extends JpaRepository<User,Long>{

    
    User findByName(String name);
    
    
    User findByNameAndAge(String name,int age);
    
    
    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}

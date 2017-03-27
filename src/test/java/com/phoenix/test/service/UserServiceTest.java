/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.service.IUserService;

/**
 *
 * @author zengzw
 * @date 2017年3月27日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
@EnableWebMvc
@WebAppConfiguration
public class UserServiceTest {

    @Autowired
    private IUserService userSerivce;
    
    @Test
    public void test() throws Exception {
        // 插入5个用户
        userSerivce.create("a", 1);
        userSerivce.create("b", 2);
        userSerivce.create("c", 3);
        userSerivce.create("d", 4);
        userSerivce.create("e", 5);
        // 查数据库，应该有5个用户
//        Assert.assertEquals(5, userSerivce.getAllUsers().intValue());
        // 删除两个用户
        userSerivce.deleteByName("a");
        userSerivce.deleteByName("e");
        // 查数据库，应该有5个用户
//        Assert.assertEquals(3, userSerivce.getAllUsers().intValue());
    }
    
}

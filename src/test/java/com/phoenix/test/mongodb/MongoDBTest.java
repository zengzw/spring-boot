/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.mongodb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.mongodb.MongoUser;
import com.hellokoding.springboot.respository.MongoUserRespository;

/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
@EnableWebMvc
@WebAppConfiguration
public class MongoDBTest {

    @Autowired
    MongoUserRespository respository;
    
    
    
    @Test
    public void test() throws Exception {

        // 创建三个User，并验证User总数
        respository.save(new MongoUser(1L, "didi", 30));
        respository.save(new MongoUser(2L, "mama", 40));
        respository.save(new MongoUser(3L, "kaka", 50));
        Assert.assertEquals(3, respository.findAll().size());
        
    }
}

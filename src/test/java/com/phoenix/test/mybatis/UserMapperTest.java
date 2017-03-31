/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.mybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.mybatismapper.MybartisUser;
import com.hellokoding.springboot.mybatismapper.UserMapper;
import com.hellokoding.springboot.mybatismapper.UserMapperANO;

/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
@EnableWebMvc
@WebAppConfiguration
public class UserMapperTest {

    private static Logger logger = LoggerFactory.getLogger(UserMapperTest.class);
    
    @Autowired
    UserMapperANO userMapper;
    
    
    @Test
    @Rollback
    public void findByName() throws Exception {
        logger.info("-------------find user name");
        
        userMapper.insert("mybatis", 20);
        MybartisUser u = userMapper.findByName("mybatis");
        Assert.assertEquals(20, u.getAge().intValue());
        
        logger.info("------------find user name end");
    }
}

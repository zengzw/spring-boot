/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.alibaba.fastjson.JSON;
import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.mybatismapper.UserMapper;

/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
@EnableWebMvc
@WebAppConfiguration
public class UserMapperXmlTest {
    
    @Autowired
    UserMapper userMapper;
    
    
    @Test
    @Rollback
    public void findByName() throws Exception {
      System.out.println(JSON.toJSONString(userMapper.selectByName("mybatis1")));
    }
}

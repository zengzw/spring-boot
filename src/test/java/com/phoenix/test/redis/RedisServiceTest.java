/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.alibaba.fastjson.JSON;
import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.model.User;

/**
 *
 * @author zengzw
 * @date 2017年3月28日
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
@EnableWebMvc
@WebAppConfiguration
public class RedisServiceTest {

    @Autowired
    private RedisTemplate redisTemplate;
    
    @Test
    public void test() throws Exception {
        // 保存对象
        User user = new User("超人", 20);
        redisTemplate.opsForValue().set(user.getName(),JSON.toJSONString(user));
      /*  user = new User("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new User("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getName(), user);
        Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
        Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());*/
    }
    
}

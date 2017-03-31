/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.tasks.ScheduledTasks;

/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
@EnableWebMvc
@WebAppConfiguration
public class ScheduledTasksTest {

    @Autowired
    ScheduledTasks scheduledTasks;
    
    @Test
    public void test() throws InterruptedException{
        scheduledTasks.reportCurrentTime();
        Thread.sleep(5000);
    }
}

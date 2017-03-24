/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hellokoding.springboot.WebApplication;
import com.hellokoding.springboot.properties.TitleProperties;

/**
 *
 * @author zengzw
 * @date 2017年3月23日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebApplication.class)
public class TitlePropertiesTest {
    
    
    @Autowired
    TitleProperties titleProperties;

    
    @Test
    public void getProperties(){
        
        System.out.println(titleProperties.getName());
        System.out.println(titleProperties.getTitle());
        
        System.out.println(titleProperties.getDesc());
        
        System.out.println(titleProperties.getIntValue());
        System.out.println(titleProperties.getLongValue());
        
        
    }
}

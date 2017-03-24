/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 然后通过@Value("${属性名}")注解来加载对应的配置属性
 * 
 * 
 * @author zengzw
 * @date 2017年3月23日
 */
@Component
public class TitleProperties {

    @Value("${com.phoenix.name}")
    private String name;

    @Value("${com.phoenix.title}")
    private String title;

    @Value("${com.phoenix.desc}")
    private String desc;

    @Value("${com.phoenix.value}")
    private String value;

    @Value("${com.phoenix.int}")
    private String intValue;

    @Value("${com.phoenix.long}")
    private String longValue;

    public String getDesc() {
        return desc;
    }

    public String getIntValue() {
        return intValue;
    }

    public String getLongValue() {
        return longValue;
    }
    
    public String getName() {
        return name;
    }
    
    public String getTitle() {
        return title;
    }
  
    public String getValue() {
        return value;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void setIntValue(String intValue) {
        this.intValue = intValue;
    }
  

    public void setLongValue(String longValue) {
        this.longValue = longValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

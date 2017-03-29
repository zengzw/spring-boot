/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.mybatismapper;


/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */

public interface UserMapper {
 
    public MybartisUser selectByName(String name);

      
}

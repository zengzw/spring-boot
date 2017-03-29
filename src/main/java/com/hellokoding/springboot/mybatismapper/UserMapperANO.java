/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.mybatismapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
@Mapper
public interface UserMapperANO {
    
    @Select("SELECT * FROM user WHERE NAME = #{name}")
    MybartisUser findByName(@Param("name") String name);
    
    @Insert("INSERT INTO user(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}

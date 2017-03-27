/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hellokoding.springboot.model.User;

/**
 *
 * @author zengzw
 * @date 2017年3月24日
 */
@RestController
@RequestMapping("/users")
public class UserController {

    
    static Map<Long, User> mapUsers = Collections.synchronizedMap(new HashMap<Long,User>());
    
    
    
    
    @ApiOperation("获取用户列表")
    @RequestMapping("/")
    public List<User> getUserList(){
        List<User> list = new ArrayList<User>(mapUsers.values());
        return list;
    }
    

    @ApiOperation("创建用户")
    @ApiImplicitParam(name="user",value="用户实体",required=true,dataType="User")
    @RequestMapping(value="/",method=RequestMethod.POST)
    public String postUser(User user){
        mapUsers.put(user.getId(), user);
        
        return "success";
    }
    
    
    @ApiOperation("根据用户Id获取用户信息")
    @ApiImplicitParam(name="id",value="用户Id",required=true,dataType="Long")
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public String updateUser(@PathVariable long id,User user){
        
        User updateUser = mapUsers.get(id);
        BeanUtils.copyProperties(user, updateUser);
        return "修改成功";
    }
    
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public User getUser(@PathVariable long id){
        return mapUsers.get(id);
    }
    
    
    
    
    
    
}


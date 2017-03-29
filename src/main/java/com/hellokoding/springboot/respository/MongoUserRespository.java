/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hellokoding.springboot.mongodb.MongoUser;


/**
 *
 * @author zengzw
 * @date 2017年3月29日
 */
public interface MongoUserRespository  extends MongoRepository<MongoUser, Long>{

}

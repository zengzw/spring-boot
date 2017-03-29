/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.springboot.smodel.Message;


/**
 *
 * @author zengzw
 * @date 2017年3月28日
 */
public interface MessageRepository  extends JpaRepository<Message,Long>{

}

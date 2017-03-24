/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.phoenix.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.hellokoding.springboot.controller.UserController;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 *
 * @author zengzw
 * @date 2017年3月24日
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringApplicationConfiguration(classes = MockServletContext.class) 
@WebAppConfiguration 
public class UserControllerTest {


    private MockMvc mvc; 

    @Before 
    public void setUp() throws Exception { 
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build(); 
    } 



    @Test
    public void testUserController() throws Exception{
        RequestBuilder request  = null;

     /*   request = get("/users/");
        mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("[]")));

*/

        request = post("/users/")
                .param("id", "2")
                .param("name", "values")
                .param("age", "12");
        
        mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("success")));

    }

}

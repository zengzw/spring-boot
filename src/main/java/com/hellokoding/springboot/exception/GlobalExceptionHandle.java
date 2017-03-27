/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * 全局异常处理
 *
 * @author zengzw
 * @date 2017年3月27日
 */

@ControllerAdvice
public class GlobalExceptionHandle {


    @ExceptionHandler(RuntimeException.class)
    public ModelAndView  defaultErrorHandle(HttpServletRequest request,Exception e){
        System.out.println("-----------global exception");
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception",e);
        modelAndView.addObject("url",request.getRequestURI());
        modelAndView.setViewName("error");

        return modelAndView;
    }
}

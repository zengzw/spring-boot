/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.async;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * 异步调用
 * 
 * @author zengzw
 * @date 2017年3月29日
 */
@Component
public class AsyncTask {
    
    public static Random random =new Random();
    
    /**
     * 调用结果
     * @return
     * @throws Exception
     */
    @Async
    public Future<String> doTaskOne() throws Exception {
        System.out.println("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务一完成");
    }
    
    
    @Async
    public Future<String> doTaskTwo() throws Exception {
        System.out.println("开始做任务2");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务2，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务2完成");
    }
    
    
    @Async
    public Future<String> doTaskThree() throws Exception {
        System.out.println("开始做任务3");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务3，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务3完成");
    }

}

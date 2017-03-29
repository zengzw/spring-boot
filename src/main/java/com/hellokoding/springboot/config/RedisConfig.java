/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 
package com.hellokoding.springboot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

*//**
 *
 * @author zengzw
 * @param <V>
 * @param <K>
 * @date 2017年3月28日
 *//*
@Configuration
@EnableAutoConfiguration  
public class RedisConfig {
    
    @Bean  
    JedisConnectionFactory jedisConnectionFactory() {  
        return new JedisConnectionFactory();  
    }  
      
    @Bean RedisTemplate<String, String>redisTemplate(RedisConnectionFactory factory)  
    {  
        RedisTemplate<String, String> template = new RedisTemplate<String, String>();  
        template.setConnectionFactory(jedisConnectionFactory());  
          
        template.setKeySerializer(new StringRedisSerializer());  
        template.setValueSerializer(new StringRedisSerializer());  
        return template;  
    }  
}
*/
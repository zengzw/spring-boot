/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author zengzw
 * @date 2017年3月25日
 */

@Configuration
@EnableSwagger2 //启用Swagger2
public class Swagger2Application {
    
    @Bean
    public Docket createRestAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.hellokoding.springboot"))
        .paths(PathSelectors.any())
        .build();
    }
    
    
    /**
     * apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）
     * 
     * select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
     * 本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，并产生文档内容
     * 
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
        .title("spring boot中使用Swagger构建Restful apis")
        .description("spring description")
        .termsOfServiceUrl("http://www.baidu.com")
        .contact("Hello contact")
        .version("1.0")
        .build();
    }
    

}

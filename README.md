# Spring Boot Example 

## Guide
- https://hellokoding.com/spring-boot-hello-world-example-with-jsp/
- http://blog.didispace.com/springbootmultidatasource/

## What you'll need
- JDK 1.7 or later
- Maven 3 or later

## Stack
- Spring Boot
- Java

## Run
`mvn spring-boot:run`




application.properties
	数据库配置，日志相关配置
	

## create spring boot demo	
http://start.spring.io/



## Spring Boot提供了默认配置的模板引擎主要有以下几种：
- Thymeleaf
- FreeMarker
- Velocity
- Groovy
- Mustache

## 全局异常处理
- 类：exception/GlobalExcpeitonHandle.java
 
 
## spring jdbctemplate
 
 
## spring data JPA
- 依赖与hibernate

## 多数据源
- jdbctemplate
- spring data jpa(未实现）

## Redis
- String
- Object

# MongoDB
- 

# Mybatis

- ANNOTATION
	- UserMapperANO
	- WebApplicaton add config @MapperScan("com.hellokoding.springboot.mybatismapper")
	- test class: UserMapperTest.xml
- XML
	- UserMapper
	- 对应sql的操作：com.mybatis.mapper.UserMapper.xml
	- test class: UserMapperXmlTest
	
 
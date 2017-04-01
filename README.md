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


## Hibernate
```
model: User
respository:UserRespository
test-class: UserRespositoryTest
```

## Redis
- String
- Object

## MongoDB
- 

## Mybatis

- 注解
	- UserMapperANO
	- WebApplicaton add config @MapperScan("com.hellokoding.springboot.mybatismapper")
	- test class: UserMapperTest.xml
	
- xml 配置
	- UserMapper
	- 对应sql的操作：com.mybatis.mapper.UserMapper.xml
	- test class: UserMapperXmlTest

## Scheduling
- WebApplicaton 中添加 @EnableScheduling 启用定时器
- @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
- @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
- @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
- @Scheduled(cron="*/5 * * * * *") ：通过cron表达式定义规则

## Async
- 

## Log
- 
 
## AOP
- @Order(i)注解来标识切面的优先级。i的值越小，优先级越高

## Security
- web 安全控制  WebSecurityConfig.java


## Cache
- @EnableCaching 开启缓存
- 在数据访问接口中，增加缓存配置注解

```java
@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User, Long> {
    @Cacheable
    User findByName(String name);
}
```
- Spring Boot根据下面的顺序去侦测缓存提供者：
	-- Generic
	-- JCache (JSR-107)
	-- EhCache 2.x
	-- Hazelcast
	-- Infinispan
	-- Redis
	-- Guava
	-- Simple
- spring.cache.type 来强制指定使用那个缓存


##RabbitMQ
- 

## actuator 监控端点
- 分类
	- 应用配置类
		- 获取应用程序中加载的应用配置、环境变量、自动化配置报告等与Spring Boot应用密切相关的配置类信息。
	- 度量指标类
		- 获取应用程序运行过程中用于监控的度量指标，比如：内存信息、线程池信息、HTTP请求统计等。
	- 操作控制类
		- 提供了对应用的关闭等操作类功能。
- /health 
	-- 获取健康信息
- 
# Spring Boot Example &  Spring cloud

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
	- 获取健康信息
- /autoconfig
	- 该端点用来获取应用的自动化配置报告，其中包括所有自动化配置的候选项
	- positiveMatches中返回的是条件匹配成功的自动化配置
	- negativeMatches中返回的是条件匹配不成功的自动化配置
- /beans
	- 该端点用来获取应用上下文中创建的所有Bean
- /configprops
	- 该端点用来获取应用中配置的属性信息报告。
- /env
	- 它用来获取应用所有可用的环境属性报告
- /mappings
	- 该端点用来返回所有Spring MVC的控制器映射关系报告
- /info
	- 该端点用来返回一些应用自定义的信息。 配置文件中通过info前缀来设置一些属性
- /metrics
	- 该端点用来返回当前应用的各类重要度量指标，比如：内存信息、线程信息、垃圾回收信息等。
- /dump
	- 该端点用来暴露程序运行中的线程信息。
- /trace
	- 该端点用来返回基本的HTTP跟踪信息
	
# Spring Cloud

## Eureka 服务注册发现
-	添加依赖包
```
 <dependency>
        <groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-eureka-server</artifactId>
    </dependency>
</dependencies>
<dependencyManagement>
    <dependencies>
        <dependency>
	    <groupId>org.springframework.cloud</groupId>
	    <artifactId>spring-cloud-dependencies</artifactId>
	    <version>Brixton.RELEASE</version>
	    <type>pom</type>
	    <scope>import</scope>
	</dependency>
    </dependencies>
</dependencyManagement>
``` 

- @EnableEurekaServer 启动一个  服务注册中心 
- 在默认设置下，该服务注册中心也会将自己作为客户端来尝试注册它自己，所以我们需要禁用它的客户端注册行为
```
server.port=1111
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/

```
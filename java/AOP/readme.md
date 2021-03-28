## 引入依赖

pom.xml

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>
        
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.70</version>
        </dependency>
```



  /** 定义一个切点 */
    @Pointcut("execution(public * com.jiawa.*.controller..*Controller.*(..))")

通知比较重要的三个： 前置、后置、环绕
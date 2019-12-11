# vblog-spring-cloud
采用Spring Boot + Spring Cloud + Spring Data JPA 实现的分布式个人博客系统【Java后端部分】

## 使用的技术

spring boot、JSR 303、lombok、fastjson、beanutils、swagger、

## 结果封装

成功的返回结果：

```java
{
      "code":0,
      "msg": "成功",
      "data":{}
}
```

失败的返回结果：

```java
{
  "code": 40401,
  "msg": "用户信息不存在"
}
```

code为自定义错误码，msg为提示的消息，data保存成功响应的数据





## 全局异常处理

为了方便统一处理不合法和不合规的请求和参数，在web项目中，统一使用throw Exception的方式，进行抛出异常。然后捕获异常做统一的输出。
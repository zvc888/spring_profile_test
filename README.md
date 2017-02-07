# spring_profile_test
spring profile 切换开发，生产环境


##ENV方式：

```
ConfigurableEnvironment.setActiveProfiles("test")
```

##JVM参数方式:

  tomcat 中 catalina.bat（.sh中不用“set”） 添加JAVA_OPS。通过设置active选择不同配置文件

set JAVA_OPTS="-Dspring.profiles.active=test"
  eclipse 中启动tomcat。项目右键 run as –> run configuration–>Arguments–> VM arguments中添加。local配置文件不必上传git追踪管理

```
-Dspring.profiles.active="local"
```

##web.xml方式

```
<init-param>
  <param-name>spring.profiles.active</param-name>
  <param-value>production</param-value>
</init-param>
```

## 标注方式（junit单元测试非常实用）：
@ActiveProfiles({"unittest","productprofile"})
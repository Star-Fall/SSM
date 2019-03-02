#SSM框架 :smile:
Blog:&emsp;[SSM笔记](https://blog.csdn.net/shaohe18362202126/article/details/87127653)  
##一、项目架构
+ 项目管理工具：**Maven**  
+ 数据库环境：**MySQL 5.X**  
+ 框架：**Spring 4.3.7**&emsp;&emsp;**SpringMVC 4.3.7**&emsp;&emsp;**MyBatis 3.4.6**  
+ 日志环境：**log4j**
+ 测试环境：**Spring-test**&emsp;+&emsp;**junit 4.0**  
+ 服务器：**Tomcat7.0**
+ JDK：**jdk1.8**

##二、项目目录结构说明

###1、src/main/java
+ com.starfall.ssm.controller：SpringMVC控制器
+ com.starfall.ssm.service：业务服务层
+ com.starfall.ssm.dao：ORM数据库交互层
+ com.starfall.ssm.entity：业务数据实体
+ com.starfall.ssm.model：其他业务模型
+ com.starfall.ssm.interceptor：系统拦截器
+ com.starfall.ssm.exception：全局异常处理
+ com.starfall.ssm.util：系统工具

###2、src/main/resources
+ applicationContext.xml：Spring配置文件
+ applicationContext-servlet.xml：SpringMVC配置文件
+ dbConfig.properties：数据源文件
+ log4j.properties：log4j配置文件
+ mybatis-config.xml：MyBatis全局配置文件
+ mybatis-generator.xml：MBG配置文件
+ src/main/resources/mapper：MyBatis的mapper文件目录

###3、src/test/java
+ com.starfall.ssm.test.emps：emps相关测试目录
+ com.starfall.ssm.test.mbg：MBG相关测试目录

##三、项目功能模块说明
###1、首页
位置：index.jsp  
功能：负责首页展示、项目介绍、具体功能跳转。

###2、查询emp信息
位置：WEB-INF/pages/emps.html  
功能：分页查询emp信息、查询全部的emp信息、文件的上传下载  
待定功能：查看详细信息、修改、增加、删除

###3、系统功能
+ 日志拦截器：记录操作日志，存储在数据库中与log中
+ 全局异常控制：处理系统发生的运行时异常，并返回具体的信息
+ API接口规范：统一系统的后台接口返回规范。位置：com.starfall.ssm.util.response

##四、项目展望
###1、完善具体的CRUD功能
包括对员工emp的增删改查、以及级联的department和job信息的操作。
###2、加入权限控制模块
集成Shiro权限控制框架

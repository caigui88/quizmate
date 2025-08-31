# quizmate
面试伙伴系统，对鱼皮编程导航中多个项目进行服务集成与服务拆分，开发的一个微服务项目

## 平台简介

基于 ruoyi-cloud 进行二次开发，以若依原有的后台系统作为微服务的管理端，面试鸭作为核心业务模块，提供了一个完整的分布式微服务解决方案。

* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用Redis。
* 流量控制框架选型Sentinel，分布式事务选型Seata。

## 系统模块

~~~
com.quizmate/
    ├── sql/    数据库初始化脚本
    ├── docker/ docker 部署脚本
    │   ├── mysql/
    │   ├── nacos/
    │   ├── nginx/
    │   ├── redis/
    │   ├── quizmate/
    │   └── docker-compose.yml
    ├── pom.xml 项目公共依赖统一管理 root pom
    ├── README.md   项目介绍
    ├── quizmate-ui/    前端 ui 模块
    │   └── package.json
    ├── quizmate-api/   微服务 API 模块
    │   ├── quizmate-api-custom/    业务端 api 接口模块
    │   └── quizmate-api-system/    后台端 api 接口模块
    ├── quizmate-auth/  统一鉴权模块
    ├── quizmate-common/    公共基础服务模块
    │   ├── quizmate-common-core/   核心工具类
    │   ├── quizmate-common-datascope/  数据权限校验
    │   ├── quizmate-common-datasource/ 数据源操作
    │   ├── quizmate-common-log/    日志记录
    │   ├── quizmate-common-redis/  redis 调用
    │   ├── quizmate-common-seata/  seata 分布式事务    
    │   ├── quizmate-common-security/   spring security 权限框架
    │   ├── quizmate-common-sensitive/  数据脱敏过滤
    │   └── quizmate-common-swagger/    项目 API 文档
    ├── quizmate-visual/
    │   └── quizmate-monitor/   系统服务监控模块
    ├── quizmate-gateway/   网关模块
    └── quizmate-modules/   实际业务模块
        ├── quizmate-gen/
        ├── quizmate-job/
        ├── quizmate-system/
        ├── file-service/   文件服务
        ├── user-service/   业务端用户服务
        ├── search-service/ 搜索服务
        ├── question-service/   题目服务
        ├── questionBank-service/   题库服务
        ├── interaction-service/    互动服务
        └── mockInterview-service/  AI 面试服务

~~~

## 架构图

<img src="https://oscimg.oschina.net/oscnet/up-82e9722ecb846786405a904bafcf19f73f3.png"/>

## 内置功能

## 在线体验

## 演示图


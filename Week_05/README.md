学习笔记
###架构，框架，组件
- 架构类似于图纸（与业务无关，但是可以服务与业务）
- 组件类似于砖头，用于具体实现内容，与业务相关
- 框架类似于建筑的整体框架，是对架构的实现

###spring的组成部分
- core
    - bean****
    - context
    - aop
- test
- date
    - JDBC
    - ORM
    - Transaction 
- web
    - mvc
    - webflux
- Integration
    - jmx
- language
    - grovy
    - kotlin
    
###Spring DI 依赖注入
- 即A依赖于B类，传统方式是通过构造器注入的方式从构造函数输入，第二种方式是通过依赖于B的接口，当需要使用到B时，Spring将B的实现赋值给该接口。
- 循环依赖
    - Spring 解决循环依赖的方式，即类似于懒加载，先通过空的构造方法构建A和B，当A真正使用到B时才将B注入。
    - Spring 无法解决的循环依赖就是通过构造器注入的循环依赖，因为必须得先构造出这个类。
    - 循环依赖类似于死锁，处理死锁也有两种方式：
        - 等待超时
        - 死锁检查    
###Spring AOP
- 实现方式
    - javaProxy： java proxy必须依赖于接口，假如一个类存在父类，那么它的AOP增强都是通过java proxy。可以通过设置 target-proxy 强制使用GCLIB
    - CGLIB～ 其不依赖于类的接口，而是直接在运行时通过字节码修改，直接生成代理类，代理类都会以 $$EnhanceBySpringCGLIB
- 执行顺序
    - around 在joinpoint.proccee() 方法之前的方法调用
    - before 方法
    - around 在 joinpoint.proceed() 方法后的方法
    - after 方法
###Spring bean 生命周期
- 初始化类
- 注入依赖
- AWARE 相关方法注入
    - BeanNameAware 注入bean名
    - BeanFactoryAware 注入BeanFactory
    - ApplicationAware 注入Application
- BeanPostProcessor 前置方法
- initialize
- 调用init 方法（重写 init的方法）
- BeanPostProcessor 后置方法
- 使用bean
- DisposeBean方法
- 自定义的Destroy方法

###Spring 加载XML的方式
- 定一个namespace，一般命名一个xds或者dtd文件
- 定义Spring.schema 定义Handler和xds的绑定关系
- 定义Spring.handler 定义对应的Handler的实现类    

###spring 核心功能 
- AutoConfig 自动化配置 (Configuration Enable** Condition)
- starter 整合各项功能

###condition自动化配置的基础
- @ConditionOnBean
- @ConditionOnMissBean
- @ConditionOnClass
- @ConditionOnProperty

###EnableAutoConfigure实现
- 读取Spring.factories 
- 读取factories的文件自动配置类
- 加载该类进行自动配置

###Spring-starter的步骤
- 定义spring.factories 文件定义configuration
- 定义spring.provides 定义starter名字
- 定义configure 定义配置对应生成的bean
- addition文件，定义properties文件的哪些选项和默认值

###JDBC模块
- connect
- statement
- ResultSet
- DriverManger

###连接池实现的基础
- java JDBC 是一套接口，非实现
- 各种数据库在JDBC的基础上进行实现
- 各个工具可以根据前面的工具基础继续增强JDBC，类似余AOP

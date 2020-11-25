## 函数编程
### lambda 表达式的形式
- 直接返回 
```
(a) a + 1
```
- 含处理过程
```
(a) -> {
....
return x;
}
```

### function interface 种类
- Function<T, R> 含有参数和返回值的
- Consumer<T> 只含有参数
- Supplier<R> 只有返回值

### 闭包
- 自由变量：指在函数中使用的，但既不是函数参数也不是函数的局部变量的变量。
- 闭包：指那些能够访问自由变量的函数。（也就是Lambda表达式的参数是需要final）
- 科里化：是把接受多个参数的函数变换成接受一个单一参数（最初函数的第一个参数）的函数

### 函数式编程演进
```
 Consumer<Integer> c1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> c2 = (a) -> {
            System.out.print(a);
        };
        
        Consumer<Integer> c3 = System.out::print;

```



## Stream的所有操作 
eg：如何记忆，我们可以想象为很多的船在长江上游运货，中间段（中间操作）到了三峡大坝，就别过滤（filter）了，必须要按顺序（sorted）排着过大坝，过大坝的时候每个船员都想拍个照片（映射），
到终点（终止操作）的时候需要先检查（max min）货品是否有人问题，然后卸货（reduce），再重新收集货物（toList），运到上游，不断循环迭代（foreach）
### 中间操作
- 过滤
    - filter
    - distinct
    - limit
    - skip
- 排序
    - sorted
- 映射
    - map
    - flatMap
### 终止操作
- 检查
    - max
    - min
    - count
    - findFirst 其返回的是一个Optional<T> 这样可以防止null中断流
- 归约
    - reduce 需要传入一个初始值，作为第一次迭代的第一个元素
- 收集
    - toList
    - toMap 需要传入key冲突的处理函数和新建map 的函数
- 迭代
    - foreach 它传入的函数是一个consumer固会中断     
    
###面向对象的设计原则SOLID
- S 单一责任原则
- O 开闭原则
- L 里氏替换原则
- I 接口分离原则
- D 依赖注入   

###GOF23种设计模式
- 创建型
- 结构型
- 行为行   

### 各种平台
- SaaS 软件即服务
- PasS platform 平台即服务
- IaaS 即各种云平台，基础设施即服务

- FaaS Function 函数即服务 API平台
- DaaS 数据即服务

### 数据库设计三大范式
- 第一范式所有对列都是原子的 （1 肯定是原子的）
- 第二范式所有的列不能是对主键部分依赖 （2 即假如主键有两个，不能只依赖于其中一个 ）
- 第三范式所有的列都和主键直接依赖，不能是传递依赖 （3 假如有三个列，一个是主键，一个列A依赖于主键，一个列B依赖于A 那么不符合）

Catalyst 架构师设计表时候用圆珠笔（原子）不分昼夜（部分）地连线 （依赖）

### mysql 文件分类
- .frm 表结构定义文件
- .idb 数据文件
- binlog binlog
- ib_logfile0 ib_logfile1  日志文件
- ib_log.index 日志索引文件
- ibdata1 在开启共享模式时都存储在一个文件里面 innodb_file_pre_table = 1; 

### Mysql 执行流程
- 


### Mysql执行顺序
- 表
    - from
    - join
    - on
- 条件
    - where
    - group by
    - having 
- 列
    - select
- 结果
    - order by
    - limit    
Catalyst： （8765 8 -》 B - 》 表， 7-》t-》条件，6-》列，5-》W-》物（结果））
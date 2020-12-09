##
### 扩展立方体
- x clone 即复制数据，主从读写分离
- y 垂直业务拆分，将一个表拆分为多个表
- z horizon 水平拆分，即分库分表
 
 `Catalyst： x 即x关，是3D复制打打印的步骤，y 业务天天就知道满脑子YY， z 睡觉 一般是 zzzzz 即分成好多个（生产力解放：天天满脑子YY，然后x光扫描，打印出来，就不用干活了天天睡觉）`
##分布式事务
###XA （强一致性事务，属于数据库支持的协议）
####操作
- xa start 'global_transaction_id','branch_transaction_id' 开启一个xa事务，分为全局事务id和分支事务id 》active
- xa end 'global_transaction_id','branch_transaction_id' 执行完成SQL后执行end 》IDLE
- xa prepare 'global_transaction_id','branch_transaction_id' 准备提交 》prepare
- xa commit 'global_transaction_id','branch_transaction_id' 提交 》 committed
- xa rollback 'global_transaction_id','branch_transaction_id' 回滚 》 XA ROLLBACK
- xa recover; 展示所有的xa事务

####存在问题
- 性能低：要求强一致性，有时候需要将隔离级别调整到 serial
- 高可用：如mysql 5.6 和以前的版本connect 断开 xa 事务就没了
- 数据不一致：无法保证数据100%一致
### BASE 柔性事务， BA base available 基本可以；S soft state 即允许更新状态有延迟，E eventually consistent  最终一致，即相当于 读未提交级别的事务 
组成
- TM 事务管理器
- RM 资源管理器
- AP 程序
#### TCC 这里面其实包括了三个小事务，try 提交了一个事务，confirm 提交一个事务，他们自己发生错误直接回滚自己的子事务就相当于本地事务，能保证ACID的，但是需要做到 confirm的时候能回滚 try的子事务，所以必须要多加一个cancel
 
- try 一般用于锁定业务资源。
- confirm 执行具体业务。
- cancel 取消回滚。

##### 注意问题 
- 允许空回滚：有可能 try 就错误了，但是也会调用 cancel ，所以需要cancel 能幂等
- 悬挂检查：有可能try 就一致阻塞了，需要检查悬挂
- 幂等设计

`Catalyst：孙悟空回到树上悬挂着笑眯眯地等着 唐僧 TCC`

####SAGA 它只有两个阶段，即串行执行各个本地事务，然后给各个本地事务写对应的回滚事务，顺序执行，方向回滚。
##### 缺点
- 必须要保证各个事务是幂等的，

#### AT 两阶段提交生产方向SQL，即在执行SQL前会先解析这个SQL 将这个事务印象到的 数据捞回来存档到 一个特定的数据库，或者Redis 之类，然后提交事务，然后做 try 和 confirm ，即相当于帮你做了cancel
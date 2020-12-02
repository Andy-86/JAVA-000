##SQL优化
### 分页
- 使用分页框架：使用分页框架会在真正执行分页前先执行 select count（*）from （SQL）这里会检查一遍所有的相关条件
并查回来，可以优化为 select count(*) from (simple SQL) 这里的 simple SQL可以直接对主键进行查询，
- limit 5000000,20 和 where id = 5000000 limit 20 后者性能会有化很多，因为前者会先跳50000000遍到第一条记录
再返回
###数据库拆分
- 垂直拆分：即按业务拆分
- 水平拆分：即分库分表
### Mysql主从同步日志类型
- binlog 主库生产
- rely log 从库根据binlog生产的
### binlog 分类
- row 行记录，能还原现场，但是很大
- statement 只记录SQL （insert update DDL），记录简单
- mixed 混合模式
### 主从同步方式
- 异步复制(主从复制)：事务提交完成后将binlog传给slave
- 半同步复制：在两阶段提交协议中，主库最少有一个备考确认事务后才能将事务提交
- 组复制MGR：即看起来都是一致的，无论备考还是主库确认超过半数都执行成功了才提交
学习笔记
### RPC 和 服务化
- PRC 只是远程进程调用（Remote process call），面向接口
- 服务化包括下面内容
    - 多个相同服务管理 集群/分组/版本
    - 服务注册发现
    - 负载均衡
    - 熔断和限流
    - 高可用/监控/性能
    - 心跳重试
### ESB 和 SOA
- ESB 类似于网关，将核心服务和业务服务隔离开来，通过ESB进行服务注册发现和转发，相当于一个大型的网关，
- SOA oriented service architecture 面向服务架构 ESB 是其实现
### 元数据中心
- 存取数据
- 变更通知
### 负载均衡
- Random 随机
- RoundRobin 轮训
- LeastActive 最少负载（假如该节点新增一个请求active数量加一，完成减一，然后取最少的）

学习笔记
### MQ 的四大用处
- 异步通信
- 系统解藕
- 削峰填谷
- 可靠通信
``` Catalyst：莲藕腿步行跨过山的谷地拉电线 ```

### MQ 内部结构 （类似网关）
- Exchange 将接收到的消息分配到Queue里面
- Queue 队列
- Dispatch 将消息分发给消费者

### 响应模式
- RR request respond 请求响应
- Oneway 直接调用无法回

### Topic 和 Queue 的区别
- 模式上：topic 是一对多，queue是PTP
- 拉推上：topic 是推模式，queue是轮训拉模式

### kafka
#### consumer Group 因为  第二代消息队列取消了queue的概念，但是可以通过consumer Group实现即p to p
#### Kafka优势
- partition多分区，提高并发度
- 循序写提高磁盘IO（所以不建议一台机器上多个Partition，这样就成了随机读写）    
- 多副本，增加容错性

#### Kafka Acks
- acks=0： 把消息发送到kafka就认为发送成功。
- acks=1： 把消息发送到kafka leader分区，并且写入磁盘就认为发送成功。
- acks=all： 把消息发送到 Kafka Leader 分区，并且 Leader 分区的副本 Follower 对消息进行了同步就认为发送成功。

#### 消费者更新 Offset 偏移量两种方式
- 自动提交：  如果 enable.auto.commit 被设置为 true，那么消费者会自动提交当前处理到的偏移量存入
 Zookeeper，自动提交的时间间隔为5s，通过 atuo.commit.interval.ms 属性设置，
自动提交是非常方便，但是自动提交会出现消息被重复消费的风险，可以通过修改提交时间间隔来更频繁地提交偏移量，
减小可能出现重复悄息的时间窗，不过这种情况是无也完全避免的。自动提交：
- 手动提交：     鉴于 Kafka 自动提交 Offset 的不灵活性和不精确性（只能是按指定频率的提交），
Kafka提供了手动提交 Offset 策略，将 auto.commit.offset 自动提交参数设置为 false 来关闭
自动提交开启手动模式，手动提交能对偏移量更加灵活精准地控制，以保证消息不被重复消费以及消息不被丢失。
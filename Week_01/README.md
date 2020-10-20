# 学习笔记 1
- 一般 Xmx 设置为机器的内存的60-70%。
- Xms 不包含 MetaSpace。
- Xms 和 Xmx 设置为一样可以减少内存分配的开销。

# 学习笔记 2
## 基础命令
- jps java进程信息，java启动详细信息可以使用 jps -lmv
- jstat 主要是GC相关信息，jstat -gc 1000 1000 统计详细各个区域内存内存情况。简单信息可以通过 jstat -gcutil 
- jmap 统计堆内各个区域内存占用情况，jmap head pid，统计各个类的内存占用情况，jmap histo pid
- jstack 统计各个线程的运行情况 jstack -l pid
- jcmd 各个工具的汇总，jcmd pid help 可以看出该进程支持的命令，jcmd pid VM.info 会输出上面四个命令的信息。
- 默认情况下java启动进程，最大堆大小为物理内存的四分之一，初始化为256m 新生代初始化大小为最大物理内存的64分之一
## GC 清除方法
- 标记清除Mark-Sweep Advantage：快，节省内存；shortcomings：内存碎片化
- 标记整理Mark-Sweep-Compact Advantage：节省内存；shortcomings：慢
- 复制算法Mark-Copy Advantage：快，shortcomings：浪费内存
## GC分类
###serial GC
- 串行GC，主要用于Client端单个CPU，小内存的java进程
- paraments： -XX:+UseSerialGC
- 清除算法：年轻代 Mark-Copy，老年代 Mark-Sweep-Compact
- -XX:+UseParNewGc 即它的串行化版本
###Parallel GC
- 并行GC **JAVA 8 及以前默认使用的GC策略，9之后用G1** 吞吐量很大，默认使用CPU 核心个数线程，压榨所有性能。
- paraments: -XX:+UseParallelGc -XX:+UseParallelOldGc -XX:ParallelGCThreads
- 清除算法：年轻代 Mark-Copy，老年代 Mark-Sweep-Compact
###CMS CG
- 并发GC，大部分阶段都可以和用户线程并发执行
- 分解步骤 （标志为concurrent的都是并发的）
    - init Mark 初始标记，只标记GCROOT 下一层的节点
    - concurrent Mark 并发标记，从上一次节点往下标记（节点更新，标记为脏页，这里涉及三色标记法和写屏障）
    - concurrent preclean 并发预清理
    - final Mark 最终标记（标记脏页）
    - concurrent sweep 并发清理
    - concurrent reset 并发重置
- 参数 -XX:+UseConcMarkSweepGC
- 清除算法：年轻代 Mark-Copy，老年代 Mark-Sweep(并发清除的关键所在) （但碎片过多无法分配足够内存时候，会退化为SerialGC 清理老年代）
###G1 GC
- 理念转变为垃圾清理速度与内存分配速度匹配即可，可以预设置停顿时间，动态调整GC过程。内存并不严格按照分代年龄，而是分为多个Region，每个Region为一种属性，每次回收高回收价值但Region
- 参数：-XX:+UseG1GC -XX:MaxGCPauseMills=50 (GC停顿时长) -XX:G1NewSizePercent=5 (新生代初始化大小) -XX:G1MaxNewSizePercent=60 (默认60) -XX:G1HeapRegionSiz=1(Region 大小默认为最大堆/2048)
 -XX:ConcGCThreads=1(默认1/4) -XX:+InitatingHeapOccupancyPersent (多大开始回收内存) -XX:G1HeapWastePercent (多少垃圾停止回收) -XX:+GCTimeRatio GC时间占比
- G1退化为SerialGC的情况
    - 在GC过程中老年代满了
    - 无法分配大对象
    - 对象无法晋升
### ZGC    
- 几乎将所有的步骤都转化为并发操作，并使用了染色指针，
- 参数：-XX:+UnlockExperimentalVMOptions -XX:+UseZGC -Xmx16g  
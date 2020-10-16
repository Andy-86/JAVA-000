- 1,目前生成设置Xms为600m，Xmx为2048m，而容器的内存为2G，存在OOM隐患。
- 2，由于生产使用的是IBM 的 OpneJDK，目前不支持jstat，jmap，jstack 这些命令，目前分析方法都是通过Kill -9 生成 core dump 和 head dump进行分析，
   也想请教以下老师，像一线互联网企业都是使用哪些JDK，遇到这种都不支持的情况一般怎么做分析。
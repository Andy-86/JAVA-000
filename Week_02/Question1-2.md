## 512m 各个GC的压测情况
使用压测工具wrk，配置情况 wrk -c 60 -t 20 -d 60 http://localhost:8088/api/hello
### ParallelGC
```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    24.55ms   51.39ms 638.76ms   90.15%
    Req/Sec   421.79    227.53     1.96k    62.04%
  496748 requests in 1.00m, 59.31MB read
Requests/sec:   8265.19
Transfer/sec:      0.99MB
```
### CMSGC
```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    29.63ms   61.83ms 702.25ms   89.35%
    Req/Sec   418.39    220.22     3.32k    63.90%
  483174 requests in 1.00m, 57.69MB read
Requests/sec:   8039.00
Transfer/sec:      0.96MB
```
### G1GC

```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.66ms   51.10ms 593.95ms   90.85%
    Req/Sec   461.88    216.75     1.54k    64.95%
  543032 requests in 1.00m, 64.83MB read
Requests/sec:   9040.19
Transfer/sec:      1.08MB
```

##1G 下各个GC的压测情况

###ParallelGC

```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.31ms   46.24ms 678.31ms   89.81%
    Req/Sec   458.09    212.02     1.72k    65.90%
  541619 requests in 1.00m, 64.66MB read
Requests/sec:   9013.52
Transfer/sec:      1.08MB
```

###CMSGC
```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    27.24ms   52.05ms 641.86ms   88.99%
    Req/Sec   350.71    176.61     2.25k    65.29%
  414186 requests in 1.00m, 49.45MB read
Requests/sec:   6891.15
Transfer/sec:    842.47KB
```

###G1GC

```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    28.28ms   55.52ms 721.12ms   89.33%
    Req/Sec   369.78    199.72     1.85k    63.17%
  432199 requests in 1.00m, 51.60MB read
Requests/sec:   7190.93
Transfer/sec:      0.86MB
```

##2G各个GC的压测情况

###ParallelGC
```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.68ms   47.20ms 678.52ms   89.85%
    Req/Sec   457.29    240.80     1.54k    62.84%
  540122 requests in 1.00m, 64.48MB read
Requests/sec:   8987.02
Transfer/sec:      1.07MB
```

###CMSGC
```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    26.82ms   57.66ms 812.30ms   89.76%
    Req/Sec   464.53    234.28     2.09k    62.01%
  542557 requests in 1.00m, 64.78MB read
Requests/sec:   9027.61
Transfer/sec:      1.08MB
```
###G1GC

```
Running 1m test @ http://localhost:8088/api/hello
  20 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    23.49ms   46.50ms 652.99ms   89.87%
    Req/Sec   373.51    165.44     1.21k    67.68%
  442247 requests in 1.00m, 52.80MB read
Requests/sec:   7362.47
Transfer/sec:      0.88MB
```
### 比较

	
|memory/GC type | ParallelGC | CMS | CMS |
| ----------:|----------:|-----------:|-----------:|
| 512m | 421/s | 418/s | 461/s |
| 1g | 458/s |  350/s | 369/s |
| 2g | 457/s | 464/s | 379/s |

- 对比数据中，随着内存到增加，CMS和G1都存在不同程度的效率下降。相比之下ParallelGC的吞吐量仍然是最大的。
- 同时根据JMC打印出来的记录发现，CMS和ParallelGC的内存使用率一直在1/3徘徊。而G1在60%附件就开始GC，这个刚好和前面的 课程相对应，young区和old区默认为1：2，在G1中，-XX：NewRatio参数将无效。


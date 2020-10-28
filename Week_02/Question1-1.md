## SerialGC
#### 512m （5620个对象）
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(114524k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseSerialGC 
2020-10-23T23:07:05.399-0800: 0.303: [GC (Allocation Failure) 0.303: [DefNew: 139776K->17471K(157248K), 0.0878272 secs] 139776K->45942K(506816K), 0.0879730 secs] [Times: user=0.02 sys=0.02, real=0.09 secs] 
2020-10-23T23:07:05.520-0800: 0.425: [GC (Allocation Failure) 0.425: [DefNew: 157247K->17470K(157248K), 0.0764684 secs] 185718K->97087K(506816K), 0.0766085 secs] [Times: user=0.03 sys=0.03, real=0.07 secs] 
2020-10-23T23:07:05.622-0800: 0.526: [GC (Allocation Failure) 0.526: [DefNew: 157246K->17469K(157248K), 0.0460414 secs] 236863K->142869K(506816K), 0.0461348 secs] [Times: user=0.02 sys=0.02, real=0.04 secs] 
2020-10-23T23:07:05.692-0800: 0.596: [GC (Allocation Failure) 0.596: [DefNew: 157245K->17471K(157248K), 0.1132628 secs] 282645K->189476K(506816K), 0.1133567 secs] [Times: user=0.02 sys=0.02, real=0.11 secs] 
2020-10-23T23:07:05.832-0800: 0.736: [GC (Allocation Failure) 0.736: [DefNew: 156844K->17470K(157248K), 0.0392423 secs] 328848K->227814K(506816K), 0.0393492 secs] [Times: user=0.02 sys=0.01, real=0.04 secs] 
2020-10-23T23:07:05.897-0800: 0.802: [GC (Allocation Failure) 0.802: [DefNew: 157022K->17469K(157248K), 0.0628039 secs] 367366K->271318K(506816K), 0.0629166 secs] [Times: user=0.02 sys=0.02, real=0.07 secs] 
2020-10-23T23:07:05.986-0800: 0.890: [GC (Allocation Failure) 0.890: [DefNew: 157245K->17470K(157248K), 0.0359720 secs] 411094K->317212K(506816K), 0.0360935 secs] [Times: user=0.02 sys=0.02, real=0.04 secs] 
2020-10-23T23:07:06.047-0800: 0.951: [GC (Allocation Failure) 0.951: [DefNew: 157246K->157246K(157248K), 0.0000280 secs]0.951: [Tenured: 299741K->263852K(349568K), 0.0596837 secs] 456988K->263852K(506816K), [Metaspace: 2819K->2819K(1056768K)], 0.0598352 secs] [Times: user=0.06 sys=0.00, real=0.06 secs] 
2020-10-23T23:07:06.130-0800: 1.034: [GC (Allocation Failure) 1.034: [DefNew: 139776K->17471K(157248K), 0.0091335 secs] 403628K->314157K(506816K), 0.0092314 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-23T23:07:06.165-0800: 1.069: [GC (Allocation Failure) 1.069: [DefNew: 157247K->17471K(157248K), 0.0350220 secs] 453933K->359551K(506816K), 0.0351223 secs] [Times: user=0.02 sys=0.01, real=0.04 secs] 
Heap
 def new generation   total 157248K, used 134817K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,  83% used [0x00000007a0000000, 0x00000007a7298970, 0x00000007a8880000)
  from space 17472K,  99% used [0x00000007a9990000, 0x00000007aaa9fc60, 0x00000007aaaa0000)
  to   space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
 tenured generation   total 349568K, used 342080K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 349568K,  97% used [0x00000007aaaa0000, 0x00000007bf8b0130, 0x00000007bf8b0200, 0x00000007c0000000)
 Metaspace       used 2826K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 308K, capacity 386K, committed 512K, reserved 1048576K

```
- 发生了一次full gc usr 代表用户线程消耗的cpu时间，sys 代表系统线程消耗的时间

###128m （0）
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(99904k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseSerialGC 
2020-10-24T00:23:34.414-0800: 0.176: [GC (Allocation Failure) 0.176: [DefNew: 34811K->4352K(39296K), 0.0079051 secs] 34811K->11219K(126720K), 0.0080371 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.436-0800: 0.198: [GC (Allocation Failure) 0.198: [DefNew: 39296K->4351K(39296K), 0.0112576 secs] 46163K->23587K(126720K), 0.0113575 secs] [Times: user=0.00 sys=0.01, real=0.01 secs] 
2020-10-24T00:23:34.457-0800: 0.218: [GC (Allocation Failure) 0.219: [DefNew: 39295K->4342K(39296K), 0.0077927 secs] 58531K->33582K(126720K), 0.0078883 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.471-0800: 0.233: [GC (Allocation Failure) 0.233: [DefNew: 39017K->4349K(39296K), 0.0096570 secs] 68257K->46746K(126720K), 0.0097848 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-24T00:23:34.488-0800: 0.249: [GC (Allocation Failure) 0.249: [DefNew: 39081K->4351K(39296K), 0.0096969 secs] 81478K->59505K(126720K), 0.0098457 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.504-0800: 0.265: [GC (Allocation Failure) 0.265: [DefNew: 39295K->4349K(39296K), 0.0089023 secs] 94449K->71073K(126720K), 0.0090140 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.520-0800: 0.281: [GC (Allocation Failure) 0.281: [DefNew: 39293K->4347K(39296K), 0.0110966 secs] 106017K->84639K(126720K), 0.0112106 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-24T00:23:34.538-0800: 0.299: [GC (Allocation Failure) 0.299: [DefNew: 39291K->39291K(39296K), 0.0000261 secs]0.299: [Tenured: 80291K->87165K(87424K), 0.0224703 secs] 119583K->92504K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0226174 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-24T00:23:34.567-0800: 0.329: [Full GC (Allocation Failure) 0.329: [Tenured: 87165K->87356K(87424K), 0.0171917 secs] 126218K->100892K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0172973 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:23:34.589-0800: 0.351: [Full GC (Allocation Failure) 0.351: [Tenured: 87356K->87343K(87424K), 0.0168311 secs] 126234K->104499K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0169448 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:23:34.610-0800: 0.372: [Full GC (Allocation Failure) 0.372: [Tenured: 87343K->87274K(87424K), 0.0217234 secs] 126433K->106222K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0218362 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:23:34.636-0800: 0.397: [Full GC (Allocation Failure) 0.397: [Tenured: 87274K->87274K(87424K), 0.0044519 secs] 126267K->111687K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0045463 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.644-0800: 0.405: [Full GC (Allocation Failure) 0.405: [Tenured: 87382K->87382K(87424K), 0.0036501 secs] 126662K->115211K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0037468 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.650-0800: 0.411: [Full GC (Allocation Failure) 0.411: [Tenured: 87382K->87382K(87424K), 0.0022003 secs] 126390K->117847K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0022840 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.653-0800: 0.415: [Full GC (Allocation Failure) 0.415: [Tenured: 87382K->87307K(87424K), 0.0195942 secs] 126484K->117405K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0197164 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:23:34.675-0800: 0.436: [Full GC (Allocation Failure) 0.436: [Tenured: 87307K->87307K(87424K), 0.0063292 secs] 126364K->118808K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0064383 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.683-0800: 0.445: [Full GC (Allocation Failure) 0.445: [Tenured: 87307K->87307K(87424K), 0.0060279 secs] 126426K->120085K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0061111 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.691-0800: 0.452: [Full GC (Allocation Failure) 0.452: [Tenured: 87307K->87307K(87424K), 0.0021919 secs] 126140K->123171K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0022634 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.694-0800: 0.455: [Full GC (Allocation Failure) 0.455: [Tenured: 87307K->87006K(87424K), 0.0192744 secs] 126422K->123834K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0193702 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:23:34.714-0800: 0.475: [Full GC (Allocation Failure) 0.475: [Tenured: 87374K->87374K(87424K), 0.0023274 secs] 126600K->124540K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0023912 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.717-0800: 0.478: [Full GC (Allocation Failure) 0.478: [Tenured: 87374K->87374K(87424K), 0.0020953 secs] 126475K->124870K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0021540 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.720-0800: 0.481: [Full GC (Allocation Failure) 0.481: [Tenured: 87374K->87374K(87424K), 0.0063325 secs] 126601K->125430K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0064225 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.726-0800: 0.488: [Full GC (Allocation Failure) 0.488: [Tenured: 87374K->86930K(87424K), 0.0101373 secs] 126496K->125380K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0102256 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.737-0800: 0.498: [Full GC (Allocation Failure) 0.498: [Tenured: 86930K->86930K(87424K), 0.0024423 secs] 125951K->125522K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0025121 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.739-0800: 0.501: [Full GC (Allocation Failure) 0.501: [Tenured: 86930K->87340K(87424K), 0.0183443 secs] 125522K->125173K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0184054 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:23:34.758-0800: 0.519: [Full GC (Allocation Failure) 0.519: [Tenured: 87340K->87340K(87424K), 0.0017212 secs] 126226K->125173K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0017698 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:23:34.760-0800: 0.521: [Full GC (Allocation Failure) 0.521: [Tenured: 87340K->87340K(87424K), 0.0017085 secs] 126074K->125173K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0017604 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.762-0800: 0.524: [Full GC (Allocation Failure) 0.524: [Tenured: 87340K->87340K(87424K), 0.0017614 secs] 126584K->126245K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0018203 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.764-0800: 0.526: [Full GC (Allocation Failure) 0.526: [Tenured: 87340K->87340K(87424K), 0.0019619 secs] 126350K->126101K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0020278 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:23:34.766-0800: 0.528: [Full GC (Allocation Failure) 0.528: [Tenured: 87340K->87340K(87424K), 0.0015267 secs] 126101K->126101K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0015683 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
Heap
 def new generation   total 39296K, used 38927K [0x00000007b8000000, 0x00000007baaa0000, 0x00000007baaa0000)
  eden space 34944K, 100% used [0x00000007b8000000, 0x00000007ba220000, 0x00000007ba220000)
  from space 4352K,  91% used [0x00000007ba660000, 0x00000007baa43fc0, 0x00000007baaa0000)
  to   space 4352K,   0% used [0x00000007ba220000, 0x00000007ba220000, 0x00000007ba660000)
 tenured generation   total 87424K, used 87340K [0x00000007baaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 87424K,  99% used [0x00000007baaa0000, 0x00000007bffeb368, 0x00000007bffeb400, 0x00000007c0000000)
 Metaspace       used 2850K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 311K, capacity 386K, committed 512K, reserved 1048576K

```
- 发生多次full gc 最后内存溢出，Allocation Failure 分配失败

###2048m （2339）

```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(147860k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=2147483648 -XX:MaxHeapSize=2147483648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseSerialGC 
2020-10-24T00:26:09.001-0800: 0.779: [GC (Allocation Failure) 0.779: [DefNew: 559232K->69887K(629120K), 0.2441571 secs] 559232K->154986K(2027264K), 0.2442789 secs] [Times: user=0.08 sys=0.09, real=0.24 secs] 
Heap
 def new generation   total 629120K, used 165466K [0x0000000740000000, 0x000000076aaa0000, 0x000000076aaa0000)
  eden space 559232K,  17% used [0x0000000740000000, 0x0000000745d56be8, 0x0000000762220000)
  from space 69888K,  99% used [0x0000000766660000, 0x000000076aa9fff8, 0x000000076aaa0000)
  to   space 69888K,   0% used [0x0000000762220000, 0x0000000762220000, 0x0000000766660000)
 tenured generation   total 1398144K, used 85098K [0x000000076aaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 1398144K,   6% used [0x000000076aaa0000, 0x000000076fdba8a8, 0x000000076fdbaa00, 0x00000007c0000000)
 Metaspace       used 2826K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 308K, capacity 386K, committed 512K, reserved 1048576K

```

- 发生了一次 yong gc

##ParallelGC

###512m （6364个对象）
```
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(396092k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseParallelGC 
2020-10-24T00:28:38.965-0800: 0.260: [GC (Allocation Failure) [PSYoungGen: 131584K->21484K(153088K)] 131584K->43080K(502784K), 0.0187799 secs] [Times: user=0.03 sys=0.05, real=0.02 secs] 
2020-10-24T00:28:39.010-0800: 0.304: [GC (Allocation Failure) [PSYoungGen: 153068K->21500K(153088K)] 174664K->89355K(502784K), 0.0291829 secs] [Times: user=0.03 sys=0.08, real=0.02 secs] 
2020-10-24T00:28:39.061-0800: 0.355: [GC (Allocation Failure) [PSYoungGen: 152984K->21498K(153088K)] 220839K->131498K(502784K), 0.0219059 secs] [Times: user=0.03 sys=0.04, real=0.02 secs] 
2020-10-24T00:28:39.104-0800: 0.398: [GC (Allocation Failure) [PSYoungGen: 153082K->21499K(153088K)] 263082K->181899K(502784K), 0.0255911 secs] [Times: user=0.04 sys=0.06, real=0.03 secs] 
2020-10-24T00:28:39.151-0800: 0.446: [GC (Allocation Failure) [PSYoungGen: 153083K->21498K(153088K)] 313483K->220310K(502784K), 0.0236066 secs] [Times: user=0.04 sys=0.04, real=0.02 secs] 
2020-10-24T00:28:39.200-0800: 0.494: [GC (Allocation Failure) [PSYoungGen: 153082K->21497K(80384K)] 351894K->258382K(430080K), 0.0534213 secs] [Times: user=0.04 sys=0.03, real=0.05 secs] 
2020-10-24T00:28:39.265-0800: 0.559: [GC (Allocation Failure) [PSYoungGen: 80377K->35366K(116736K)] 317262K->278109K(466432K), 0.0103031 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-24T00:28:39.289-0800: 0.583: [GC (Allocation Failure) [PSYoungGen: 94132K->48197K(116736K)] 336876K->296821K(466432K), 0.0112093 secs] [Times: user=0.02 sys=0.01, real=0.02 secs] 
2020-10-24T00:28:39.312-0800: 0.606: [GC (Allocation Failure) [PSYoungGen: 107021K->57688K(116736K)] 355645K->314456K(466432K), 0.0175877 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2020-10-24T00:28:39.341-0800: 0.635: [GC (Allocation Failure) [PSYoungGen: 116026K->39736K(116736K)] 372793K->331574K(466432K), 0.0884658 secs] [Times: user=0.04 sys=0.04, real=0.09 secs] 
2020-10-24T00:28:39.430-0800: 0.724: [Full GC (Ergonomics) [PSYoungGen: 39736K->0K(116736K)] [ParOldGen: 291838K->239246K(349696K)] 331574K->239246K(466432K), [Metaspace: 2815K->2815K(1056768K)], 0.0659167 secs] [Times: user=0.16 sys=0.01, real=0.06 secs] 
2020-10-24T00:28:39.507-0800: 0.801: [GC (Allocation Failure) [PSYoungGen: 58880K->22417K(116736K)] 298126K->261664K(466432K), 0.0049349 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:28:39.522-0800: 0.816: [GC (Allocation Failure) [PSYoungGen: 81186K->20453K(116736K)] 320432K->280434K(466432K), 0.0076049 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2020-10-24T00:28:39.541-0800: 0.835: [GC (Allocation Failure) [PSYoungGen: 79230K->21583K(116736K)] 339211K->301322K(466432K), 0.0074115 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:28:39.560-0800: 0.854: [GC (Allocation Failure) [PSYoungGen: 80105K->21754K(116736K)] 359844K->322692K(466432K), 0.0116013 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-24T00:28:39.571-0800: 0.866: [Full GC (Ergonomics) [PSYoungGen: 21754K->0K(116736K)] [ParOldGen: 300937K->275985K(349696K)] 322692K->275985K(466432K), [Metaspace: 2815K->2815K(1056768K)], 0.0504786 secs] [Times: user=0.14 sys=0.00, real=0.05 secs] 
2020-10-24T00:28:39.632-0800: 0.926: [GC (Allocation Failure) [PSYoungGen: 58856K->24139K(116736K)] 334842K->300124K(466432K), 0.0051763 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
2020-10-24T00:28:39.648-0800: 0.942: [GC (Allocation Failure) [PSYoungGen: 82597K->19373K(116736K)] 358583K->318962K(466432K), 0.0082458 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-24T00:28:39.667-0800: 0.961: [GC (Allocation Failure) [PSYoungGen: 78253K->19586K(116736K)] 377842K->337485K(466432K), 0.0131836 secs] [Times: user=0.02 sys=0.02, real=0.02 secs] 
2020-10-24T00:28:39.680-0800: 0.974: [Full GC (Ergonomics) [PSYoungGen: 19586K->0K(116736K)] [ParOldGen: 317899K->288157K(349696K)] 337485K->288157K(466432K), [Metaspace: 2815K->2815K(1056768K)], 0.0529876 secs] [Times: user=0.13 sys=0.00, real=0.05 secs] 
2020-10-24T00:28:39.745-0800: 1.039: [GC (Allocation Failure) [PSYoungGen: 58880K->22145K(116736K)] 347037K->310302K(466432K), 0.0042419 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
2020-10-24T00:28:39.759-0800: 1.053: [GC (Allocation Failure) [PSYoungGen: 80664K->21993K(116736K)] 368821K->330826K(466432K), 0.0076613 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-24T00:28:39.767-0800: 1.061: [Full GC (Ergonomics) [PSYoungGen: 21993K->0K(116736K)] [ParOldGen: 308833K->297723K(349696K)] 330826K->297723K(466432K), [Metaspace: 2815K->2815K(1056768K)], 0.0503632 secs] [Times: user=0.18 sys=0.00, real=0.05 secs] 
2020-10-24T00:28:39.828-0800: 1.122: [GC (Allocation Failure) [PSYoungGen: 58768K->16954K(116736K)] 356492K->314678K(466432K), 0.0033794 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:28:39.842-0800: 1.136: [GC (Allocation Failure) [PSYoungGen: 75834K->21199K(116736K)] 373558K->335286K(466432K), 0.0069920 secs] [Times: user=0.03 sys=0.00, real=0.00 secs] 
2020-10-24T00:28:39.849-0800: 1.143: [Full GC (Ergonomics) [PSYoungGen: 21199K->0K(116736K)] [ParOldGen: 314087K->296823K(349696K)] 335286K->296823K(466432K), [Metaspace: 2815K->2815K(1056768K)], 0.0626985 secs] [Times: user=0.17 sys=0.01, real=0.07 secs] 
Heap
 PSYoungGen      total 116736K, used 2405K [0x00000007b5580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 58880K, 4% used [0x00000007b5580000,0x00000007b57d9418,0x00000007b8f00000)
  from space 57856K, 0% used [0x00000007b8f00000,0x00000007b8f00000,0x00000007bc780000)
  to   space 57856K, 0% used [0x00000007bc780000,0x00000007bc780000,0x00000007c0000000)
 ParOldGen       total 349696K, used 296823K [0x00000007a0000000, 0x00000007b5580000, 0x00000007b5580000)
  object space 349696K, 84% used [0x00000007a0000000,0x00000007b21ddee0,0x00000007b5580000)
 Metaspace       used 2821K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 308K, capacity 386K, committed 512K, reserved 1048576K

```
- 发生一次full gc

## 128m （0）

```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(162504k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseParallelGC 
2020-10-24T00:34:05.881-0800: 0.172: [GC (Allocation Failure) [PSYoungGen: 33273K->5103K(38400K)] 33273K->10082K(125952K), 0.0107022 secs] [Times: user=0.01 sys=0.02, real=0.01 secs] 
2020-10-24T00:34:05.913-0800: 0.204: [GC (Allocation Failure) [PSYoungGen: 38383K->5118K(38400K)] 43362K->24450K(125952K), 0.0089875 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-24T00:34:05.931-0800: 0.221: [GC (Allocation Failure) [PSYoungGen: 38279K->5119K(38400K)] 57611K->35375K(125952K), 0.0063408 secs] [Times: user=0.01 sys=0.01, real=0.00 secs] 
2020-10-24T00:34:05.944-0800: 0.234: [GC (Allocation Failure) [PSYoungGen: 37929K->5119K(38400K)] 68185K->45951K(125952K), 0.0067325 secs] [Times: user=0.01 sys=0.02, real=0.01 secs] 
2020-10-24T00:34:05.957-0800: 0.247: [GC (Allocation Failure) [PSYoungGen: 38268K->5117K(38400K)] 79100K->56043K(125952K), 0.0059626 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-24T00:34:05.969-0800: 0.260: [GC (Allocation Failure) [PSYoungGen: 38397K->5095K(19968K)] 89323K->68878K(107520K), 0.0074516 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-24T00:34:05.980-0800: 0.270: [GC (Allocation Failure) [PSYoungGen: 19943K->8154K(29184K)] 83726K->73703K(116736K), 0.0025792 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:34:05.986-0800: 0.276: [GC (Allocation Failure) [PSYoungGen: 22673K->10894K(29184K)] 88221K->78098K(116736K), 0.0026357 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:34:05.992-0800: 0.282: [GC (Allocation Failure) [PSYoungGen: 25650K->13966K(29184K)] 92853K->84094K(116736K), 0.0037819 secs] [Times: user=0.01 sys=0.01, real=0.00 secs] 
2020-10-24T00:34:05.999-0800: 0.289: [GC (Allocation Failure) [PSYoungGen: 28814K->8415K(29184K)] 98942K->86665K(116736K), 0.0052436 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-24T00:34:06.004-0800: 0.295: [Full GC (Ergonomics) [PSYoungGen: 8415K->0K(29184K)] [ParOldGen: 78250K->78923K(87552K)] 86665K->78923K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0165294 secs] [Times: user=0.05 sys=0.00, real=0.02 secs] 
2020-10-24T00:34:06.025-0800: 0.315: [Full GC (Ergonomics) [PSYoungGen: 14848K->0K(29184K)] [ParOldGen: 78923K->81244K(87552K)] 93771K->81244K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0144729 secs] [Times: user=0.05 sys=0.00, real=0.01 secs] 
2020-10-24T00:34:06.042-0800: 0.333: [Full GC (Ergonomics) [PSYoungGen: 14444K->0K(29184K)] [ParOldGen: 81244K->84812K(87552K)] 95689K->84812K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0118838 secs] [Times: user=0.04 sys=0.01, real=0.01 secs] 
2020-10-24T00:34:06.057-0800: 0.347: [Full GC (Ergonomics) [PSYoungGen: 14455K->2024K(29184K)] [ParOldGen: 84812K->87244K(87552K)] 99268K->89268K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0132197 secs] [Times: user=0.04 sys=0.00, real=0.02 secs] 
2020-10-24T00:34:06.073-0800: 0.363: [Full GC (Ergonomics) [PSYoungGen: 14845K->3917K(29184K)] [ParOldGen: 87244K->87342K(87552K)] 102089K->91259K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0125034 secs] [Times: user=0.04 sys=0.00, real=0.01 secs] 
2020-10-24T00:34:06.087-0800: 0.378: [Full GC (Ergonomics) [PSYoungGen: 14735K->8429K(29184K)] [ParOldGen: 87342K->86927K(87552K)] 102077K->95356K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0126093 secs] [Times: user=0.05 sys=0.00, real=0.02 secs] 
2020-10-24T00:34:06.101-0800: 0.392: [Full GC (Ergonomics) [PSYoungGen: 14730K->10738K(29184K)] [ParOldGen: 86927K->86997K(87552K)] 101657K->97735K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0169673 secs] [Times: user=0.06 sys=0.00, real=0.01 secs] 
2020-10-24T00:34:06.119-0800: 0.410: [Full GC (Ergonomics) [PSYoungGen: 14565K->12295K(29184K)] [ParOldGen: 86997K->86982K(87552K)] 101563K->99277K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0122375 secs] [Times: user=0.04 sys=0.00, real=0.02 secs] 
2020-10-24T00:34:06.132-0800: 0.423: [Full GC (Ergonomics) [PSYoungGen: 14830K->12044K(29184K)] [ParOldGen: 86982K->87464K(87552K)] 101812K->99509K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0044823 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:34:06.137-0800: 0.428: [Full GC (Ergonomics) [PSYoungGen: 14740K->13026K(29184K)] [ParOldGen: 87464K->87547K(87552K)] 102205K->100573K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0069080 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-24T00:34:06.145-0800: 0.435: [Full GC (Ergonomics) [PSYoungGen: 14821K->14025K(29184K)] [ParOldGen: 87547K->87463K(87552K)] 102368K->101489K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0101799 secs] [Times: user=0.04 sys=0.00, real=0.01 secs] 
2020-10-24T00:34:06.155-0800: 0.446: [Full GC (Ergonomics) [PSYoungGen: 14837K->14252K(29184K)] [ParOldGen: 87463K->87463K(87552K)] 102301K->101716K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0028663 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:34:06.158-0800: 0.449: [Full GC (Ergonomics) [PSYoungGen: 14669K->14558K(29184K)] [ParOldGen: 87463K->87463K(87552K)] 102133K->102022K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0021524 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:34:06.161-0800: 0.451: [Full GC (Allocation Failure) [PSYoungGen: 14558K->14558K(29184K)] [ParOldGen: 87463K->87445K(87552K)] 102022K->102003K(116736K), [Metaspace: 2815K->2815K(1056768K)], 0.0143216 secs] [Times: user=0.04 sys=0.00, real=0.01 secs] 
Heap
 PSYoungGen      total 29184K, used 14848K [0x00000007bd580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 14848K, 100% used [0x00000007bd580000,0x00000007be400000,0x00000007be400000)
  from space 14336K, 0% used [0x00000007bf200000,0x00000007bf200000,0x00000007c0000000)
  to   space 14336K, 0% used [0x00000007be400000,0x00000007be400000,0x00000007bf200000)
 ParOldGen       total 87552K, used 87445K [0x00000007b8000000, 0x00000007bd580000, 0x00000007bd580000)
  object space 87552K, 99% used [0x00000007b8000000,0x00000007bd5654c0,0x00000007bd580000)
 Metaspace       used 2845K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 311K, capacity 386K, committed 512K, reserved 1048576K

```
- 发生多次full gc，最后老年代被占满无法回收，内存溢出

- Full GC(Ergonomics)
这里可以到 full gce的 Reason是 Ergonomics,是因为开启了 Useadaptivesizepolicy,jvm自己进行自适应调
整引发的 Full gc
- GC (Allocation Failure)
分析完 full gc.之后我们看下 young gc,看og里头99%都是GC( Allocation Failure)造成的 young gc。
Allocation Failure表示向 young generation(eden)给新对象申请空间,但是 young generation(eden)剩余
的合适空间不够所需的大小导致的 minor gc

###2048 (2810个对象)
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(244220k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=2147483648 -XX:MaxHeapSize=2147483648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseParallelGC 
2020-10-24T00:43:46.599-0800: 0.830: [GC (Allocation Failure) [PSYoungGen: 524800K->87036K(611840K)] 524800K->135904K(2010112K), 0.1212616 secs] [Times: user=0.08 sys=0.10, real=0.13 secs] 
Heap
 PSYoungGen      total 611840K, used 341584K [0x0000000795580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 524800K, 48% used [0x0000000795580000,0x00000007a4e14ed8,0x00000007b5600000)
  from space 87040K, 99% used [0x00000007b5600000,0x00000007baaff1c0,0x00000007bab00000)
  to   space 87040K, 0% used [0x00000007bab00000,0x00000007bab00000,0x00000007c0000000)
 ParOldGen       total 1398272K, used 48868K [0x0000000740000000, 0x0000000795580000, 0x0000000795580000)
  object space 1398272K, 3% used [0x0000000740000000,0x0000000742fb9110,0x0000000795580000)
 Metaspace       used 2826K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 308K, capacity 386K, committed 512K, reserved 1048576K

```

##CMSGC 
### 512m(7895个对象)
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(449716k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC 
2020-10-24T00:45:59.933-0800: 0.259: [GC (Allocation Failure) 0.259: [ParNew: 139745K->17472K(157248K), 0.0205533 secs] 139745K->44439K(506816K), 0.0206738 secs] [Times: user=0.03 sys=0.04, real=0.02 secs] 
2020-10-24T00:45:59.983-0800: 0.309: [GC (Allocation Failure) 0.309: [ParNew: 157248K->17472K(157248K), 0.0242376 secs] 184215K->85445K(506816K), 0.0243244 secs] [Times: user=0.04 sys=0.04, real=0.02 secs] 
2020-10-24T00:46:00.033-0800: 0.359: [GC (Allocation Failure) 0.359: [ParNew: 157248K->17472K(157248K), 0.0339616 secs] 225221K->130816K(506816K), 0.0340545 secs] [Times: user=0.10 sys=0.02, real=0.03 secs] 
2020-10-24T00:46:00.093-0800: 0.419: [GC (Allocation Failure) 0.419: [ParNew: 156821K->17472K(157248K), 0.0334062 secs] 270166K->175465K(506816K), 0.0334862 secs] [Times: user=0.10 sys=0.03, real=0.03 secs] 
2020-10-24T00:46:00.153-0800: 0.479: [GC (Allocation Failure) 0.479: [ParNew: 157248K->17472K(157248K), 0.0336183 secs] 315241K->219508K(506816K), 0.0336976 secs] [Times: user=0.11 sys=0.02, real=0.03 secs] 
2020-10-24T00:46:00.186-0800: 0.513: [GC (CMS Initial Mark) [1 CMS-initial-mark: 202036K(349568K)] 219759K(506816K), 0.0001727 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.187-0800: 0.513: [CMS-concurrent-mark-start]
2020-10-24T00:46:00.193-0800: 0.519: [CMS-concurrent-mark: 0.006/0.006 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.193-0800: 0.519: [CMS-concurrent-preclean-start]
2020-10-24T00:46:00.194-0800: 0.520: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.194-0800: 0.520: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:46:00.214-0800: 0.540: [GC (Allocation Failure) 0.540: [ParNew: 157248K->17471K(157248K), 0.0344936 secs] 359284K->264685K(506816K), 0.0345740 secs] [Times: user=0.10 sys=0.02, real=0.03 secs] 
2020-10-24T00:46:00.273-0800: 0.599: [GC (Allocation Failure) 0.599: [ParNew: 157247K->17472K(157248K), 0.0359642 secs] 404461K->308997K(506816K), 0.0360531 secs] [Times: user=0.11 sys=0.02, real=0.03 secs] 
2020-10-24T00:46:00.337-0800: 0.663: [GC (Allocation Failure) 0.663: [ParNew2020-10-24T00:46:00.412-0800: 0.738: [CMS-concurrent-abortable-preclean: 0.004/0.218 secs] [Times: user=0.46 sys=0.07, real=0.22 secs] 
: 156740K->17472K(157248K), 0.0891574 secs] 448266K->355834K(506816K), 0.0892574 secs] [Times: user=0.21 sys=0.03, real=0.09 secs] 
2020-10-24T00:46:00.426-0800: 0.752: [GC (CMS Final Remark) [YG occupancy: 18045 K (157248 K)]0.752: [Rescan (parallel) , 0.0006916 secs]0.753: [weak refs processing, 0.0010861 secs]0.754: [class unloading, 0.0003661 secs]0.755: [scrub symbol table, 0.0003853 secs]0.755: [scrub string table, 0.0001694 secs][1 CMS-remark: 338362K(349568K)] 356407K(506816K), 0.0032247 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.429-0800: 0.756: [CMS-concurrent-sweep-start]
2020-10-24T00:46:00.431-0800: 0.757: [CMS-concurrent-sweep: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.431-0800: 0.757: [CMS-concurrent-reset-start]
2020-10-24T00:46:00.432-0800: 0.758: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.458-0800: 0.784: [GC (Allocation Failure) 0.784: [ParNew: 157248K->17472K(157248K), 0.0231202 secs] 453300K->363088K(506816K), 0.0232040 secs] [Times: user=0.05 sys=0.01, real=0.03 secs] 
2020-10-24T00:46:00.481-0800: 0.807: [GC (CMS Initial Mark) [1 CMS-initial-mark: 345616K(349568K)] 363449K(506816K), 0.0006293 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.482-0800: 0.808: [CMS-concurrent-mark-start]
2020-10-24T00:46:00.486-0800: 0.812: [CMS-concurrent-mark: 0.004/0.004 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.486-0800: 0.812: [CMS-concurrent-preclean-start]
2020-10-24T00:46:00.487-0800: 0.814: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.487-0800: 0.814: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:46:00.487-0800: 0.814: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.488-0800: 0.814: [GC (CMS Final Remark) [YG occupancy: 41567 K (157248 K)]0.814: [Rescan (parallel) , 0.0006248 secs]0.814: [weak refs processing, 0.0000102 secs]0.814: [class unloading, 0.0002315 secs]0.815: [scrub symbol table, 0.0004693 secs]0.815: [scrub string table, 0.0001497 secs][1 CMS-remark: 345616K(349568K)] 387184K(506816K), 0.0016156 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.489-0800: 0.815: [CMS-concurrent-sweep-start]
2020-10-24T00:46:00.490-0800: 0.816: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.490-0800: 0.817: [CMS-concurrent-reset-start]
2020-10-24T00:46:00.491-0800: 0.817: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.513-0800: 0.839: [GC (Allocation Failure) 0.839: [ParNew: 157248K->17471K(157248K), 0.0155102 secs] 411190K->316869K(506816K), 0.0155968 secs] [Times: user=0.05 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.529-0800: 0.855: [GC (CMS Initial Mark) [1 CMS-initial-mark: 299397K(349568K)] 317013K(506816K), 0.0001261 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.529-0800: 0.855: [CMS-concurrent-mark-start]
2020-10-24T00:46:00.532-0800: 0.858: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.532-0800: 0.858: [CMS-concurrent-preclean-start]
2020-10-24T00:46:00.533-0800: 0.859: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.533-0800: 0.859: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:46:00.555-0800: 0.881: [GC (Allocation Failure) 0.881: [ParNew: 157247K->157247K(157248K), 0.0000190 secs]0.881: [CMS2020-10-24T00:46:00.555-0800: 0.881: [CMS-concurrent-abortable-preclean: 0.001/0.022 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
 (concurrent mode failure): 299397K->294732K(349568K), 0.0745675 secs] 456645K->294732K(506816K), [Metaspace: 2817K->2817K(1056768K)], 0.0746894 secs] [Times: user=0.07 sys=0.00, real=0.07 secs] 
2020-10-24T00:46:00.653-0800: 0.979: [GC (Allocation Failure) 0.979: [ParNew: 139524K->17470K(157248K), 0.0095391 secs] 434256K->338341K(506816K), 0.0096704 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.663-0800: 0.989: [GC (CMS Initial Mark) [1 CMS-initial-mark: 320871K(349568K)] 341683K(506816K), 0.0001220 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.663-0800: 0.989: [CMS-concurrent-mark-start]
2020-10-24T00:46:00.666-0800: 0.992: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.666-0800: 0.992: [CMS-concurrent-preclean-start]
2020-10-24T00:46:00.667-0800: 0.993: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.667-0800: 0.993: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:46:00.667-0800: 0.993: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.667-0800: 0.993: [GC (CMS Final Remark) [YG occupancy: 37638 K (157248 K)]0.993: [Rescan (parallel) , 0.0005507 secs]0.994: [weak refs processing, 0.0000109 secs]0.994: [class unloading, 0.0002482 secs]0.994: [scrub symbol table, 0.0003340 secs]0.994: [scrub string table, 0.0001404 secs][1 CMS-remark: 320871K(349568K)] 358510K(506816K), 0.0014167 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.668-0800: 0.994: [CMS-concurrent-sweep-start]
2020-10-24T00:46:00.669-0800: 0.995: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.669-0800: 0.995: [CMS-concurrent-reset-start]
2020-10-24T00:46:00.670-0800: 0.996: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.690-0800: 1.016: [GC (Allocation Failure) 1.017: [ParNew: 157246K->17471K(157248K), 0.0134260 secs] 444771K->348981K(506816K), 0.0135243 secs] [Times: user=0.05 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.704-0800: 1.030: [GC (CMS Initial Mark) [1 CMS-initial-mark: 331509K(349568K)] 349659K(506816K), 0.0001294 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.704-0800: 1.030: [CMS-concurrent-mark-start]
2020-10-24T00:46:00.707-0800: 1.033: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.707-0800: 1.033: [CMS-concurrent-preclean-start]
2020-10-24T00:46:00.708-0800: 1.034: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.708-0800: 1.034: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:46:00.708-0800: 1.034: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.708-0800: 1.034: [GC (CMS Final Remark) [YG occupancy: 39340 K (157248 K)]1.034: [Rescan (parallel) , 0.0004252 secs]1.035: [weak refs processing, 0.0000117 secs]1.035: [class unloading, 0.0002462 secs]1.035: [scrub symbol table, 0.0004016 secs]1.036: [scrub string table, 0.0001388 secs][1 CMS-remark: 331509K(349568K)] 370850K(506816K), 0.0013305 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:46:00.710-0800: 1.036: [CMS-concurrent-sweep-start]
2020-10-24T00:46:00.711-0800: 1.037: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.711-0800: 1.037: [CMS-concurrent-reset-start]
2020-10-24T00:46:00.711-0800: 1.037: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.731-0800: 1.058: [GC (Allocation Failure) 1.058: [ParNew: 157247K->157247K(157248K), 0.0000184 secs]1.058: [CMS: 299294K->321616K(349568K), 0.0610051 secs] 456541K->321616K(506816K), [Metaspace: 2817K->2817K(1056768K)], 0.0611324 secs] [Times: user=0.06 sys=0.01, real=0.06 secs] 
2020-10-24T00:46:00.793-0800: 1.119: [GC (CMS Initial Mark) [1 CMS-initial-mark: 321616K(349568K)] 321760K(506816K), 0.0001403 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:46:00.793-0800: 1.119: [CMS-concurrent-mark-start]
Heap
 par new generation   total 157248K, used 15519K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,  11% used [0x00000007a0000000, 0x00000007a0f27d60, 0x00000007a8880000)
  from space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
  to   space 17472K,   0% used [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
 concurrent mark-sweep generation total 349568K, used 321616K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2824K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 308K, capacity 386K, committed 512K, reserved 1048576K

```

- 这里会打印CMS的各个阶段
    - Initial Mark
    - concurrent-mark
    - concurrent-preclean
    - Final Remark
    - concurrent-sweep
    - concurrent-reset

###128m (0)

```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(195036k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:MaxNewSize=44740608 -XX:MaxTenuringThreshold=6 -XX:NewSize=44740608 -XX:OldPLABSize=16 -XX:OldSize=89477120 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC 
2020-10-24T00:56:02.033-0800: 0.193: [GC (Allocation Failure) 0.193: [ParNew: 34759K->4343K(39296K), 0.0072130 secs] 34759K->11386K(126720K), 0.0073939 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-24T00:56:02.052-0800: 0.212: [GC (Allocation Failure) 0.212: [ParNew: 39263K->4352K(39296K), 0.0089086 secs] 46306K->23721K(126720K), 0.0090162 secs] [Times: user=0.02 sys=0.02, real=0.01 secs] 
2020-10-24T00:56:02.070-0800: 0.230: [GC (Allocation Failure) 0.230: [ParNew: 39296K->4344K(39296K), 0.0095252 secs] 58665K->35534K(126720K), 0.0096115 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.087-0800: 0.247: [GC (Allocation Failure) 0.247: [ParNew: 39029K->4351K(39296K), 0.0078093 secs] 70219K->45356K(126720K), 0.0078901 secs] [Times: user=0.03 sys=0.01, real=0.01 secs] 
2020-10-24T00:56:02.102-0800: 0.261: [GC (Allocation Failure) 0.262: [ParNew: 39126K->4349K(39296K), 0.0097601 secs] 80130K->58681K(126720K), 0.0098385 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.112-0800: 0.272: [GC (CMS Initial Mark) [1 CMS-initial-mark: 54332K(87424K)] 60477K(126720K), 0.0001683 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.112-0800: 0.272: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.114-0800: 0.274: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.114-0800: 0.274: [CMS-concurrent-preclean-start]
2020-10-24T00:56:02.114-0800: 0.274: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.114-0800: 0.274: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:56:02.119-0800: 0.279: [GC (Allocation Failure) 0.279: [ParNew: 39192K->4351K(39296K), 0.0101280 secs] 93524K->72174K(126720K), 0.0102074 secs] [Times: user=0.03 sys=0.01, real=0.01 secs] 
2020-10-24T00:56:02.136-0800: 0.296: [GC (Allocation Failure) 0.296: [ParNew: 39295K->4351K(39296K), 0.0082618 secs] 107118K->82998K(126720K), 0.0083412 secs] [Times: user=0.03 sys=0.01, real=0.01 secs] 
2020-10-24T00:56:02.151-0800: 0.311: [GC (Allocation Failure) 0.311: [ParNew: 39098K->39098K(39296K), 0.0000192 secs]0.311: [CMS2020-10-24T00:56:02.151-0800: 0.311: [CMS-concurrent-abortable-preclean: 0.001/0.037 secs] [Times: user=0.08 sys=0.02, real=0.04 secs] 
 (concurrent mode failure): 78646K->87411K(87424K), 0.0233199 secs] 117744K->87782K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0234388 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.182-0800: 0.342: [Full GC (Allocation Failure) 0.342: [CMS: 87411K->87409K(87424K), 0.0182785 secs] 126643K->99290K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0183752 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.201-0800: 0.361: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87409K(87424K)] 99362K(126720K), 0.0001385 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.201-0800: 0.361: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.202-0800: 0.362: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.202-0800: 0.362: [CMS-concurrent-preclean-start]
2020-10-24T00:56:02.203-0800: 0.363: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.203-0800: 0.363: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:56:02.203-0800: 0.363: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.203-0800: 0.363: [GC (CMS Final Remark) [YG occupancy: 21682 K (39296 K)]0.363: [Rescan (parallel) , 0.0001468 secs]0.363: [weak refs processing, 0.0000084 secs]0.363: [class unloading, 0.0003832 secs]0.364: [scrub symbol table, 0.0003298 secs]0.364: [scrub string table, 0.0001413 secs][1 CMS-remark: 87409K(87424K)] 109092K(126720K), 0.0011164 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.204-0800: 0.364: [CMS-concurrent-sweep-start]
2020-10-24T00:56:02.205-0800: 0.365: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.205-0800: 0.365: [CMS-concurrent-reset-start]
2020-10-24T00:56:02.205-0800: 0.365: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.208-0800: 0.368: [GC (Allocation Failure) 0.368: [ParNew: 39292K->39292K(39296K), 0.0000194 secs]0.368: [CMS: 87409K->87337K(87424K), 0.0176162 secs] 126702K->105930K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0177369 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.226-0800: 0.386: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87337K(87424K)] 106099K(126720K), 0.0001657 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.226-0800: 0.386: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.227-0800: 0.387: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.227-0800: 0.387: [CMS-concurrent-preclean-start]
2020-10-24T00:56:02.228-0800: 0.388: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.228-0800: 0.388: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:56:02.228-0800: 0.388: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.228-0800: 0.388: [GC (CMS Final Remark) [YG occupancy: 31604 K (39296 K)]0.388: [Rescan (parallel) , 0.0001722 secs]0.388: [weak refs processing, 0.0000108 secs]0.388: [class unloading, 0.0002432 secs]0.389: [scrub symbol table, 0.0003182 secs]0.389: [scrub string table, 0.0001358 secs][1 CMS-remark: 87337K(87424K)] 118942K(126720K), 0.0009725 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.229-0800: 0.389: [CMS-concurrent-sweep-start]
2020-10-24T00:56:02.230-0800: 0.390: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.230-0800: 0.390: [CMS-concurrent-reset-start]
2020-10-24T00:56:02.230-0800: 0.390: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.231-0800: 0.391: [GC (Allocation Failure) 0.391: [ParNew: 39221K->39221K(39296K), 0.0000187 secs]0.391: [CMS: 87337K->86988K(87424K), 0.0203844 secs] 126558K->112558K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0204979 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.252-0800: 0.412: [GC (CMS Initial Mark) [1 CMS-initial-mark: 86988K(87424K)] 112926K(126720K), 0.0001475 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.252-0800: 0.412: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.253-0800: 0.413: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.253-0800: 0.413: [CMS-concurrent-preclean-start]
2020-10-24T00:56:02.254-0800: 0.414: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.254-0800: 0.414: [CMS-concurrent-abortable-preclean-start]
2020-10-24T00:56:02.254-0800: 0.414: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.254-0800: 0.414: [GC (CMS Final Remark) [YG occupancy: 35276 K (39296 K)]0.414: [Rescan (parallel) , 0.0001468 secs]0.414: [weak refs processing, 0.0000085 secs]0.414: [class unloading, 0.0002226 secs]0.414: [scrub symbol table, 0.0003143 secs]0.415: [scrub string table, 0.0001294 secs][1 CMS-remark: 86988K(87424K)] 122265K(126720K), 0.0009224 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.255-0800: 0.415: [CMS-concurrent-sweep-start]
2020-10-24T00:56:02.255-0800: 0.415: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.255-0800: 0.415: [CMS-concurrent-reset-start]
2020-10-24T00:56:02.255-0800: 0.415: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.256-0800: 0.416: [GC (Allocation Failure) 0.416: [ParNew: 39238K->39238K(39296K), 0.0000154 secs]0.416: [CMS: 86824K->86944K(87424K), 0.0182397 secs] 126062K->117167K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0183485 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.274-0800: 0.434: [GC (CMS Initial Mark) [1 CMS-initial-mark: 86944K(87424K)] 117768K(126720K), 0.0001555 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.274-0800: 0.434: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.276-0800: 0.436: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.276-0800: 0.436: [CMS-concurrent-preclean-start]
2020-10-24T00:56:02.276-0800: 0.436: [Full GC (Allocation Failure) 0.436: [CMS2020-10-24T00:56:02.277-0800: 0.437: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87232K->87140K(87424K), 0.0197191 secs] 126425K->119606K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0198187 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.298-0800: 0.458: [Full GC (Allocation Failure) 0.458: [CMS: 87140K->87167K(87424K), 0.0199711 secs] 126358K->120829K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0200921 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-24T00:56:02.318-0800: 0.478: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87167K(87424K)] 121405K(126720K), 0.0001873 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.319-0800: 0.479: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.320-0800: 0.479: [Full GC (Allocation Failure) 0.479: [CMS2020-10-24T00:56:02.320-0800: 0.480: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
 (concurrent mode failure): 87167K->87341K(87424K), 0.0192843 secs] 126423K->122003K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0193767 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.340-0800: 0.500: [Full GC (Allocation Failure) 0.500: [CMS: 87341K->87352K(87424K), 0.0189559 secs] 126627K->122246K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0190483 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.359-0800: 0.519: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87352K(87424K)] 122383K(126720K), 0.0001911 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.359-0800: 0.519: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.361-0800: 0.521: [Full GC (Allocation Failure) 0.521: [CMS2020-10-24T00:56:02.361-0800: 0.521: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
 (concurrent mode failure): 87417K->87297K(87424K), 0.0062184 secs] 126713K->123164K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0062975 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.368-0800: 0.528: [Full GC (Allocation Failure) 0.528: [CMS: 87369K->87346K(87424K), 0.0035807 secs] 126604K->124225K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0036593 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.372-0800: 0.532: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87346K(87424K)] 124286K(126720K), 0.0001196 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.372-0800: 0.532: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.372-0800: 0.532: [Full GC (Allocation Failure) 0.532: [CMS2020-10-24T00:56:02.373-0800: 0.533: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87346K->87197K(87424K), 0.0153128 secs] 126435K->125596K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0154229 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.388-0800: 0.548: [Full GC (Allocation Failure) 0.548: [CMS: 87269K->87269K(87424K), 0.0023085 secs] 126501K->126046K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0023886 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-24T00:56:02.391-0800: 0.551: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87269K(87424K)] 126190K(126720K), 0.0001325 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.391-0800: 0.551: [CMS-concurrent-mark-start]
2020-10-24T00:56:02.391-0800: 0.551: [Full GC (Allocation Failure) 0.551: [CMS2020-10-24T00:56:02.392-0800: 0.552: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87269K->87197K(87424K), 0.0030485 secs] 126380K->125974K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0031079 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-24T00:56:02.394-0800: 0.554: [Full GC (Allocation Failure) 0.554: [CMS: 87197K->87179K(87424K), 0.0131117 secs] 125974K->125956K(126720K), [Metaspace: 2819K->2819K(1056768K)], 0.0131731 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
Heap
 par new generation   total 39296K, used 38904K [0x00000007b8000000, 0x00000007baaa0000, 0x00000007baaa0000)
  eden space 34944K, 100% used [0x00000007b8000000, 0x00000007ba220000, 0x00000007ba220000)
  from space 4352K,  91% used [0x00000007ba660000, 0x00000007baa3e2e0, 0x00000007baaa0000)
  to   space 4352K,   0% used [0x00000007ba220000, 0x00000007ba220000, 0x00000007ba660000)
 concurrent mark-sweep generation total 87424K, used 87179K [0x00000007baaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2850K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 311K, capacity 386K, committed 512K, reserved 1048576K

```     
###2048 (5210个对象)
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(184144k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=2147483648 -XX:MaxHeapSize=2147483648 -XX:MaxNewSize=348966912 -XX:MaxTenuringThreshold=6 -XX:NewSize=348966912 -XX:OldPLABSize=16 -XX:OldSize=697933824 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC 
2020-10-24T00:57:38.646-0800: 0.349: [GC (Allocation Failure) 0.349: [ParNew: 272406K->34048K(306688K), 0.0485627 secs] 272406K->97162K(2063104K), 0.0486824 secs] [Times: user=0.07 sys=0.09, real=0.05 secs] 
2020-10-24T00:57:38.757-0800: 0.460: [GC (Allocation Failure) 0.460: [ParNew: 306688K->34048K(306688K), 0.1510937 secs] 369802K->179553K(2063104K), 0.1512231 secs] [Times: user=0.08 sys=0.09, real=0.15 secs] 
2020-10-24T00:57:38.971-0800: 0.673: [GC (Allocation Failure) 0.673: [ParNew: 306688K->34048K(306688K), 0.1393103 secs] 452193K->260080K(2063104K), 0.1393769 secs] [Times: user=0.31 sys=0.05, real=0.14 secs] 
2020-10-24T00:57:39.159-0800: 0.861: [GC (Allocation Failure) 0.861: [ParNew: 306688K->34048K(306688K), 0.0717385 secs] 532720K->334434K(2063104K), 0.0718218 secs] [Times: user=0.15 sys=0.04, real=0.08 secs] 
2020-10-24T00:57:39.280-0800: 0.982: [GC (Allocation Failure) 0.983: [ParNew: 306688K->34048K(306688K), 0.1343741 secs] 607074K->414806K(2063104K), 0.1344654 secs] [Times: user=0.27 sys=0.06, real=0.13 secs] 
Heap
 par new generation   total 306688K, used 79860K [0x0000000740000000, 0x0000000754cc0000, 0x0000000754cc0000)
  eden space 272640K,  16% used [0x0000000740000000, 0x0000000742cbd150, 0x0000000750a40000)
  from space 34048K, 100% used [0x0000000752b80000, 0x0000000754cc0000, 0x0000000754cc0000)
  to   space 34048K,   0% used [0x0000000750a40000, 0x0000000750a40000, 0x0000000752b80000)
 concurrent mark-sweep generation total 1756416K, used 380758K [0x0000000754cc0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2826K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 308K, capacity 386K, committed 512K, reserved 1048576K

```
- 只触发yong gc

##G1GC

###512m（8268 个对象）
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(463612k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC 
2020-10-24T01:01:02.929-0800: 0.198: [GC pause (G1 Evacuation Pause) (young) 30M->8303K(512M), 0.0032509 secs]
2020-10-24T01:01:02.939-0800: 0.208: [GC pause (G1 Evacuation Pause) (young) 33M->19M(512M), 0.0043786 secs]
2020-10-24T01:01:02.957-0800: 0.227: [GC pause (G1 Evacuation Pause) (young) 50M->29M(512M), 0.0053434 secs]
2020-10-24T01:01:02.984-0800: 0.253: [GC pause (G1 Evacuation Pause) (young) 80M->47M(512M), 0.0076435 secs]
2020-10-24T01:01:03.016-0800: 0.285: [GC pause (G1 Evacuation Pause) (young) 119M->71M(512M), 0.0098331 secs]
2020-10-24T01:01:03.050-0800: 0.319: [GC pause (G1 Evacuation Pause) (young) 153M->99M(512M), 0.0113294 secs]
2020-10-24T01:01:03.166-0800: 0.435: [GC pause (G1 Evacuation Pause) (young) 330M->175M(512M), 0.0272895 secs]
2020-10-24T01:01:03.213-0800: 0.483: [GC pause (G1 Evacuation Pause) (young) 266M->206M(512M), 0.0130118 secs]
2020-10-24T01:01:03.230-0800: 0.500: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 222M->211M(512M), 0.0049992 secs]
2020-10-24T01:01:03.235-0800: 0.505: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.236-0800: 0.505: [GC concurrent-root-region-scan-end, 0.0001099 secs]
2020-10-24T01:01:03.236-0800: 0.505: [GC concurrent-mark-start]
2020-10-24T01:01:03.239-0800: 0.508: [GC concurrent-mark-end, 0.0036169 secs]
2020-10-24T01:01:03.239-0800: 0.509: [GC remark, 0.0014016 secs]
2020-10-24T01:01:03.241-0800: 0.510: [GC cleanup 224M->208M(512M), 0.0005931 secs]
2020-10-24T01:01:03.242-0800: 0.511: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.242-0800: 0.511: [GC concurrent-cleanup-end, 0.0000321 secs]
2020-10-24T01:01:03.308-0800: 0.578: [GC pause (G1 Evacuation Pause) (young) 388M->261M(512M), 0.0129614 secs]
2020-10-24T01:01:03.324-0800: 0.594: [GC pause (G1 Evacuation Pause) (mixed) 268M->253M(512M), 0.0106527 secs]
2020-10-24T01:01:03.336-0800: 0.605: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 257M->254M(512M), 0.0013692 secs]
2020-10-24T01:01:03.337-0800: 0.607: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.337-0800: 0.607: [GC concurrent-root-region-scan-end, 0.0001110 secs]
2020-10-24T01:01:03.337-0800: 0.607: [GC concurrent-mark-start]
2020-10-24T01:01:03.340-0800: 0.609: [GC concurrent-mark-end, 0.0028002 secs]
2020-10-24T01:01:03.340-0800: 0.610: [GC remark, 0.0043595 secs]
2020-10-24T01:01:03.345-0800: 0.614: [GC cleanup 264M->254M(512M), 0.0009710 secs]
2020-10-24T01:01:03.346-0800: 0.615: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.346-0800: 0.615: [GC concurrent-cleanup-end, 0.0000305 secs]
2020-10-24T01:01:03.420-0800: 0.689: [GC pause (G1 Evacuation Pause) (young) 411M->305M(512M), 0.0129189 secs]
2020-10-24T01:01:03.436-0800: 0.705: [GC pause (G1 Evacuation Pause) (mixed) 315M->287M(512M), 0.0068662 secs]
2020-10-24T01:01:03.444-0800: 0.713: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 289M->288M(512M), 0.0015412 secs]
2020-10-24T01:01:03.445-0800: 0.714: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.445-0800: 0.715: [GC concurrent-root-region-scan-end, 0.0001938 secs]
2020-10-24T01:01:03.446-0800: 0.715: [GC concurrent-mark-start]
2020-10-24T01:01:03.448-0800: 0.718: [GC concurrent-mark-end, 0.0029653 secs]
2020-10-24T01:01:03.449-0800: 0.718: [GC remark, 0.0016336 secs]
2020-10-24T01:01:03.450-0800: 0.720: [GC cleanup 303M->295M(512M), 0.0004608 secs]
2020-10-24T01:01:03.451-0800: 0.720: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.451-0800: 0.720: [GC concurrent-cleanup-end, 0.0000248 secs]
2020-10-24T01:01:03.475-0800: 0.744: [GC pause (G1 Evacuation Pause) (young) 400M->327M(512M), 0.0070448 secs]
2020-10-24T01:01:03.486-0800: 0.755: [GC pause (G1 Evacuation Pause) (mixed) 344M->307M(512M), 0.0078970 secs]
2020-10-24T01:01:03.495-0800: 0.764: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 310M->308M(512M), 0.0015240 secs]
2020-10-24T01:01:03.497-0800: 0.766: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.497-0800: 0.766: [GC concurrent-root-region-scan-end, 0.0001041 secs]
2020-10-24T01:01:03.497-0800: 0.766: [GC concurrent-mark-start]
2020-10-24T01:01:03.499-0800: 0.769: [GC concurrent-mark-end, 0.0025910 secs]
2020-10-24T01:01:03.500-0800: 0.769: [GC remark, 0.0022710 secs]
2020-10-24T01:01:03.502-0800: 0.771: [GC cleanup 320M->312M(512M), 0.0004854 secs]
2020-10-24T01:01:03.503-0800: 0.772: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.503-0800: 0.772: [GC concurrent-cleanup-end, 0.0000216 secs]
2020-10-24T01:01:03.526-0800: 0.796: [GC pause (G1 Evacuation Pause) (young) 398M->331M(512M), 0.0114479 secs]
2020-10-24T01:01:03.542-0800: 0.811: [GC pause (G1 Evacuation Pause) (mixed) 348M->315M(512M), 0.0086145 secs]
2020-10-24T01:01:03.551-0800: 0.820: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 319M->318M(512M), 0.0017726 secs]
2020-10-24T01:01:03.553-0800: 0.822: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.553-0800: 0.822: [GC concurrent-root-region-scan-end, 0.0001087 secs]
2020-10-24T01:01:03.553-0800: 0.822: [GC concurrent-mark-start]
2020-10-24T01:01:03.555-0800: 0.824: [GC concurrent-mark-end, 0.0019671 secs]
2020-10-24T01:01:03.555-0800: 0.824: [GC remark, 0.0019290 secs]
2020-10-24T01:01:03.557-0800: 0.827: [GC cleanup 329M->323M(512M), 0.0004966 secs]
2020-10-24T01:01:03.558-0800: 0.827: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.558-0800: 0.827: [GC concurrent-cleanup-end, 0.0000145 secs]
2020-10-24T01:01:03.574-0800: 0.843: [GC pause (G1 Evacuation Pause) (young) 381M->338M(512M), 0.0069495 secs]
2020-10-24T01:01:03.586-0800: 0.855: [GC pause (G1 Evacuation Pause) (mixed) 359M->329M(512M), 0.0074501 secs]
2020-10-24T01:01:03.593-0800: 0.862: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 329M->329M(512M), 0.0015964 secs]
2020-10-24T01:01:03.595-0800: 0.864: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.595-0800: 0.864: [GC concurrent-root-region-scan-end, 0.0000318 secs]
2020-10-24T01:01:03.595-0800: 0.864: [GC concurrent-mark-start]
2020-10-24T01:01:03.598-0800: 0.867: [GC concurrent-mark-end, 0.0031369 secs]
2020-10-24T01:01:03.598-0800: 0.867: [GC remark, 0.0020517 secs]
2020-10-24T01:01:03.600-0800: 0.870: [GC cleanup 341M->335M(512M), 0.0005625 secs]
2020-10-24T01:01:03.601-0800: 0.870: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.601-0800: 0.870: [GC concurrent-cleanup-end, 0.0000249 secs]
2020-10-24T01:01:03.615-0800: 0.885: [GC pause (G1 Evacuation Pause) (young) 391M->346M(512M), 0.0052887 secs]
2020-10-24T01:01:03.625-0800: 0.894: [GC pause (G1 Evacuation Pause) (mixed) 366M->336M(512M), 0.0078610 secs]
2020-10-24T01:01:03.634-0800: 0.903: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 341M->338M(512M), 0.0020524 secs]
2020-10-24T01:01:03.636-0800: 0.905: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.636-0800: 0.905: [GC concurrent-root-region-scan-end, 0.0001527 secs]
2020-10-24T01:01:03.636-0800: 0.905: [GC concurrent-mark-start]
2020-10-24T01:01:03.639-0800: 0.908: [GC concurrent-mark-end, 0.0027488 secs]
2020-10-24T01:01:03.639-0800: 0.908: [GC remark, 0.0018151 secs]
2020-10-24T01:01:03.641-0800: 0.910: [GC cleanup 350M->341M(512M), 0.0005546 secs]
2020-10-24T01:01:03.642-0800: 0.911: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.642-0800: 0.911: [GC concurrent-cleanup-end, 0.0000173 secs]
2020-10-24T01:01:03.653-0800: 0.923: [GC pause (G1 Evacuation Pause) (young) 390M->354M(512M), 0.0049038 secs]
2020-10-24T01:01:03.663-0800: 0.932: [GC pause (G1 Evacuation Pause) (mixed) 375M->344M(512M), 0.0064419 secs]
2020-10-24T01:01:03.670-0800: 0.939: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 345M->344M(512M), 0.0017409 secs]
2020-10-24T01:01:03.671-0800: 0.941: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.672-0800: 0.941: [GC concurrent-root-region-scan-end, 0.0002566 secs]
2020-10-24T01:01:03.672-0800: 0.941: [GC concurrent-mark-start]
2020-10-24T01:01:03.674-0800: 0.943: [GC concurrent-mark-end, 0.0020583 secs]
2020-10-24T01:01:03.674-0800: 0.943: [GC remark, 0.0018603 secs]
2020-10-24T01:01:03.676-0800: 0.945: [GC cleanup 354M->348M(512M), 0.0004793 secs]
2020-10-24T01:01:03.676-0800: 0.946: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.676-0800: 0.946: [GC concurrent-cleanup-end, 0.0000162 secs]
2020-10-24T01:01:03.686-0800: 0.955: [GC pause (G1 Evacuation Pause) (young) 391M->358M(512M), 0.0046351 secs]
2020-10-24T01:01:03.696-0800: 0.965: [GC pause (G1 Evacuation Pause) (mixed) 381M->346M(512M), 0.0072923 secs]
2020-10-24T01:01:03.705-0800: 0.974: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 353M->347M(512M), 0.0016277 secs]
2020-10-24T01:01:03.707-0800: 0.976: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.707-0800: 0.976: [GC concurrent-root-region-scan-end, 0.0001160 secs]
2020-10-24T01:01:03.707-0800: 0.976: [GC concurrent-mark-start]
2020-10-24T01:01:03.709-0800: 0.978: [GC concurrent-mark-end, 0.0019715 secs]
2020-10-24T01:01:03.709-0800: 0.978: [GC remark, 0.0018383 secs]
2020-10-24T01:01:03.711-0800: 0.980: [GC cleanup 358M->352M(512M), 0.0005454 secs]
2020-10-24T01:01:03.711-0800: 0.981: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.711-0800: 0.981: [GC concurrent-cleanup-end, 0.0000149 secs]
2020-10-24T01:01:03.721-0800: 0.990: [GC pause (G1 Evacuation Pause) (young) 391M->355M(512M), 0.0040240 secs]
2020-10-24T01:01:03.730-0800: 0.999: [GC pause (G1 Evacuation Pause) (mixed) 378M->347M(512M), 0.0079070 secs]
2020-10-24T01:01:03.738-0800: 1.008: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 349M->347M(512M), 0.0019331 secs]
2020-10-24T01:01:03.740-0800: 1.010: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.741-0800: 1.010: [GC concurrent-root-region-scan-end, 0.0001491 secs]
2020-10-24T01:01:03.741-0800: 1.010: [GC concurrent-mark-start]
2020-10-24T01:01:03.743-0800: 1.012: [GC concurrent-mark-end, 0.0026549 secs]
2020-10-24T01:01:03.743-0800: 1.013: [GC remark, 0.0018494 secs]
2020-10-24T01:01:03.745-0800: 1.015: [GC cleanup 361M->351M(512M), 0.0005323 secs]
2020-10-24T01:01:03.746-0800: 1.015: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.746-0800: 1.015: [GC concurrent-cleanup-end, 0.0000336 secs]
2020-10-24T01:01:03.755-0800: 1.024: [GC pause (G1 Evacuation Pause) (young) 389M->357M(512M), 0.0045006 secs]
2020-10-24T01:01:03.765-0800: 1.034: [GC pause (G1 Evacuation Pause) (mixed) 381M->350M(512M), 0.0061475 secs]
2020-10-24T01:01:03.774-0800: 1.043: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 358M->352M(512M), 0.0016123 secs]
2020-10-24T01:01:03.775-0800: 1.044: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.775-0800: 1.045: [GC concurrent-root-region-scan-end, 0.0001106 secs]
2020-10-24T01:01:03.775-0800: 1.045: [GC concurrent-mark-start]
2020-10-24T01:01:03.778-0800: 1.047: [GC concurrent-mark-end, 0.0024248 secs]
2020-10-24T01:01:03.778-0800: 1.047: [GC remark, 0.0019011 secs]
2020-10-24T01:01:03.780-0800: 1.049: [GC cleanup 364M->357M(512M), 0.0004630 secs]
2020-10-24T01:01:03.780-0800: 1.050: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.780-0800: 1.050: [GC concurrent-cleanup-end, 0.0000165 secs]
2020-10-24T01:01:03.788-0800: 1.057: [GC pause (G1 Evacuation Pause) (young) 394M->363M(512M), 0.0045789 secs]
2020-10-24T01:01:03.797-0800: 1.066: [GC pause (G1 Evacuation Pause) (mixed) 386M->355M(512M), 0.0053723 secs]
2020-10-24T01:01:03.803-0800: 1.072: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 358M->356M(512M), 0.0014142 secs]
2020-10-24T01:01:03.804-0800: 1.073: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.804-0800: 1.074: [GC concurrent-root-region-scan-end, 0.0001134 secs]
2020-10-24T01:01:03.804-0800: 1.074: [GC concurrent-mark-start]
2020-10-24T01:01:03.807-0800: 1.076: [GC concurrent-mark-end, 0.0023952 secs]
2020-10-24T01:01:03.807-0800: 1.076: [GC remark, 0.0019296 secs]
2020-10-24T01:01:03.809-0800: 1.078: [GC cleanup 366M->360M(512M), 0.0005211 secs]
2020-10-24T01:01:03.810-0800: 1.079: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.810-0800: 1.079: [GC concurrent-cleanup-end, 0.0000169 secs]
2020-10-24T01:01:03.816-0800: 1.086: [GC pause (G1 Evacuation Pause) (young) 391M->364M(512M), 0.0037537 secs]
2020-10-24T01:01:03.825-0800: 1.094: [GC pause (G1 Evacuation Pause) (mixed) 391M->360M(512M), 0.0073764 secs]
2020-10-24T01:01:03.833-0800: 1.102: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 362M->360M(512M), 0.0017485 secs]
2020-10-24T01:01:03.835-0800: 1.104: [GC concurrent-root-region-scan-start]
2020-10-24T01:01:03.835-0800: 1.104: [GC concurrent-root-region-scan-end, 0.0001058 secs]
2020-10-24T01:01:03.835-0800: 1.104: [GC concurrent-mark-start]
2020-10-24T01:01:03.837-0800: 1.106: [GC concurrent-mark-end, 0.0020419 secs]
2020-10-24T01:01:03.837-0800: 1.107: [GC remark, 0.0019712 secs]
2020-10-24T01:01:03.839-0800: 1.109: [GC cleanup 372M->364M(512M), 0.0006731 secs]
2020-10-24T01:01:03.840-0800: 1.109: [GC concurrent-cleanup-start]
2020-10-24T01:01:03.840-0800: 1.109: [GC concurrent-cleanup-end, 0.0000190 secs]
2020-10-24T01:01:03.846-0800: 1.116: [GC pause (G1 Evacuation Pause) (young) 391M->365M(512M), 0.0035237 secs]
2020-10-24T01:01:03.855-0800: 1.125: [GC pause (G1 Evacuation Pause) (mixed) 392M->360M(512M), 0.0087715 secs]

```
- 这里也打印了各个阶段：
    - 年轻代模式转移暂停(Evacuation Pause)
      G1 GC会通过前面一段时间的运行情况来不断的调整自己的回收策略和行为，以此来比较稳定地控制 暂停时间。在应用程序刚启动时，G1还没有采集到什么足够的信息，这时候就处于初始的 fully- young 模式。当年轻代空间用满后，应用线程会被暂停，年轻代内存块中的存活对象被拷贝到存活 区。如果还没有存活区，则任意选择一部分空闲的内存块作为存活区。
      拷贝的过程称为转移(Evacuation)，这和前面介绍的其他年轻代收集器是一样的工作原理。
    - concurrent-root-region-scan
    - concurrent-mark
    - remark
    - cleanup
    - （完成并发标记后会引起执行mixed collection ，但不是紧跟着，而是发生多次young 模式转移暂停后触发） pause (G1 Evacuation Pause) (young) (G1 Evacuation Pause) (mixed)

###128m (0)
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(117136k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=134217728 -XX:MaxHeapSize=134217728 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC 
2020-10-24T09:38:25.137-0800: 0.226: [GC pause (G1 Evacuation Pause) (young) 18M->8968K(128M), 0.0040434 secs]
2020-10-24T09:38:25.167-0800: 0.256: [GC pause (G1 Evacuation Pause) (young) 22M->12M(128M), 0.0058090 secs]
2020-10-24T09:38:25.187-0800: 0.276: [GC pause (G1 Evacuation Pause) (young) 39M->21M(128M), 0.0051136 secs]
2020-10-24T09:38:25.224-0800: 0.313: [GC pause (G1 Evacuation Pause) (young) 54M->31M(128M), 0.0054219 secs]
2020-10-24T09:38:25.251-0800: 0.340: [GC pause (G1 Evacuation Pause) (young) 82M->48M(128M), 0.0077115 secs]
2020-10-24T09:38:25.265-0800: 0.353: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 72M->58M(128M), 0.0044709 secs]
2020-10-24T09:38:25.269-0800: 0.358: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.269-0800: 0.358: [GC concurrent-root-region-scan-end, 0.0001413 secs]
2020-10-24T09:38:25.269-0800: 0.358: [GC concurrent-mark-start]
2020-10-24T09:38:25.271-0800: 0.360: [GC concurrent-mark-end, 0.0015992 secs]
2020-10-24T09:38:25.271-0800: 0.360: [GC remark, 0.0010249 secs]
2020-10-24T09:38:25.272-0800: 0.361: [GC cleanup 67M->66M(128M), 0.0003077 secs]
2020-10-24T09:38:25.273-0800: 0.361: [GC concurrent-cleanup-start]
2020-10-24T09:38:25.273-0800: 0.361: [GC concurrent-cleanup-end, 0.0000161 secs]
2020-10-24T09:38:25.282-0800: 0.371: [GC pause (G1 Evacuation Pause) (young) 97M->68M(128M), 0.0040250 secs]
2020-10-24T09:38:25.287-0800: 0.375: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 69M->68M(128M), 0.0017144 secs]
2020-10-24T09:38:25.288-0800: 0.377: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.288-0800: 0.377: [GC concurrent-root-region-scan-end, 0.0000305 secs]
2020-10-24T09:38:25.288-0800: 0.377: [GC concurrent-mark-start]
2020-10-24T09:38:25.289-0800: 0.378: [GC concurrent-mark-end, 0.0011262 secs]
2020-10-24T09:38:25.290-0800: 0.379: [GC remark, 0.0010857 secs]
2020-10-24T09:38:25.291-0800: 0.380: [GC cleanup 74M->74M(128M), 0.0003106 secs]
2020-10-24T09:38:25.299-0800: 0.388: [GC pause (G1 Evacuation Pause) (young)-- 105M->86M(128M), 0.0020946 secs]
2020-10-24T09:38:25.303-0800: 0.391: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 91M->89M(128M), 0.0015188 secs]
2020-10-24T09:38:25.304-0800: 0.393: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.304-0800: 0.393: [GC concurrent-root-region-scan-end, 0.0001241 secs]
2020-10-24T09:38:25.304-0800: 0.393: [GC concurrent-mark-start]
2020-10-24T09:38:25.306-0800: 0.395: [GC concurrent-mark-end, 0.0013024 secs]
2020-10-24T09:38:25.306-0800: 0.395: [GC remark, 0.0010704 secs]
2020-10-24T09:38:25.307-0800: 0.396: [GC cleanup 95M->94M(128M), 0.0003385 secs]
2020-10-24T09:38:25.307-0800: 0.396: [GC concurrent-cleanup-start]
2020-10-24T09:38:25.307-0800: 0.396: [GC concurrent-cleanup-end, 0.0000137 secs]
2020-10-24T09:38:25.309-0800: 0.398: [GC pause (G1 Evacuation Pause) (young) 101M->93M(128M), 0.0018220 secs]
2020-10-24T09:38:25.312-0800: 0.401: [GC pause (G1 Evacuation Pause) (mixed) 101M->91M(128M), 0.0022052 secs]
2020-10-24T09:38:25.315-0800: 0.404: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 95M->93M(128M), 0.0011477 secs]
2020-10-24T09:38:25.316-0800: 0.405: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.317-0800: 0.405: [GC concurrent-root-region-scan-end, 0.0000277 secs]
2020-10-24T09:38:25.317-0800: 0.405: [GC concurrent-mark-start]
2020-10-24T09:38:25.318-0800: 0.407: [GC concurrent-mark-end, 0.0013320 secs]
2020-10-24T09:38:25.318-0800: 0.407: [GC remark, 0.0010633 secs]
2020-10-24T09:38:25.319-0800: 0.408: [GC cleanup 101M->100M(128M), 0.0002701 secs]
2020-10-24T09:38:25.320-0800: 0.408: [GC concurrent-cleanup-start]
2020-10-24T09:38:25.320-0800: 0.408: [GC concurrent-cleanup-end, 0.0000102 secs]
2020-10-24T09:38:25.320-0800: 0.408: [GC pause (G1 Evacuation Pause) (young) 100M->95M(128M), 0.0010262 secs]
2020-10-24T09:38:25.322-0800: 0.411: [GC pause (G1 Evacuation Pause) (mixed) 101M->94M(128M), 0.0012985 secs]
2020-10-24T09:38:25.324-0800: 0.413: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 96M->94M(128M), 0.0006413 secs]
2020-10-24T09:38:25.325-0800: 0.414: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.325-0800: 0.414: [GC concurrent-root-region-scan-end, 0.0000902 secs]
2020-10-24T09:38:25.325-0800: 0.414: [GC concurrent-mark-start]
2020-10-24T09:38:25.326-0800: 0.415: [GC concurrent-mark-end, 0.0010371 secs]
2020-10-24T09:38:25.326-0800: 0.415: [GC remark, 0.0010516 secs]
2020-10-24T09:38:25.327-0800: 0.416: [GC cleanup 100M->99M(128M), 0.0003797 secs]
2020-10-24T09:38:25.328-0800: 0.417: [GC concurrent-cleanup-start]
2020-10-24T09:38:25.328-0800: 0.417: [GC concurrent-cleanup-end, 0.0000129 secs]
2020-10-24T09:38:25.328-0800: 0.417: [GC pause (G1 Evacuation Pause) (young) 99M->95M(128M), 0.0009700 secs]
2020-10-24T09:38:25.330-0800: 0.419: [GC pause (G1 Evacuation Pause) (mixed) 101M->97M(128M), 0.0017235 secs]
2020-10-24T09:38:25.333-0800: 0.422: [GC pause (G1 Evacuation Pause) (young) 102M->98M(128M), 0.0010892 secs]
2020-10-24T09:38:25.335-0800: 0.424: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 103M->100M(128M), 0.0009473 secs]
2020-10-24T09:38:25.336-0800: 0.425: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.336-0800: 0.425: [GC concurrent-root-region-scan-end, 0.0001094 secs]
2020-10-24T09:38:25.336-0800: 0.425: [GC concurrent-mark-start]
2020-10-24T09:38:25.337-0800: 0.426: [GC pause (G1 Evacuation Pause) (young) 105M->101M(128M), 0.0009371 secs]
2020-10-24T09:38:25.339-0800: 0.427: [GC concurrent-mark-end, 0.0023261 secs]
2020-10-24T09:38:25.339-0800: 0.428: [GC remark, 0.0013125 secs]
2020-10-24T09:38:25.340-0800: 0.429: [GC cleanup 102M->101M(128M), 0.0003224 secs]
2020-10-24T09:38:25.341-0800: 0.429: [GC concurrent-cleanup-start]
2020-10-24T09:38:25.341-0800: 0.429: [GC concurrent-cleanup-end, 0.0000130 secs]
2020-10-24T09:38:25.342-0800: 0.430: [GC pause (G1 Evacuation Pause) (young) 106M->103M(128M), 0.0012750 secs]
2020-10-24T09:38:25.344-0800: 0.433: [GC pause (G1 Humongous Allocation) (mixed)-- 109M->109M(128M), 0.0009135 secs]
2020-10-24T09:38:25.346-0800: 0.434: [GC pause (G1 Evacuation Pause) (young) (initial-mark)-- 111M->110M(128M), 0.0008865 secs]
2020-10-24T09:38:25.347-0800: 0.435: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.347-0800: 0.435: [GC concurrent-root-region-scan-end, 0.0000143 secs]
2020-10-24T09:38:25.347-0800: 0.435: [GC concurrent-mark-start]
2020-10-24T09:38:25.347-0800: 0.436: [GC pause (G1 Humongous Allocation) (young)-- 110M->110M(128M), 0.0005989 secs]
2020-10-24T09:38:25.347-0800: 0.436: [Full GC (Allocation Failure)  110M->92M(128M), 0.0188380 secs]
2020-10-24T09:38:25.366-0800: 0.455: [GC concurrent-mark-abort]
2020-10-24T09:38:25.367-0800: 0.456: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 94M->93M(128M), 0.0009018 secs]
2020-10-24T09:38:25.368-0800: 0.457: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.368-0800: 0.457: [GC concurrent-root-region-scan-end, 0.0000980 secs]
2020-10-24T09:38:25.368-0800: 0.457: [GC concurrent-mark-start]
2020-10-24T09:38:25.370-0800: 0.458: [GC concurrent-mark-end, 0.0016963 secs]
2020-10-24T09:38:25.370-0800: 0.459: [GC remark, 0.0012715 secs]
2020-10-24T09:38:25.371-0800: 0.460: [GC cleanup 100M->100M(128M), 0.0003635 secs]
2020-10-24T09:38:25.372-0800: 0.461: [GC pause (G1 Evacuation Pause) (young)-- 100M->99M(128M), 0.0013433 secs]
2020-10-24T09:38:25.373-0800: 0.462: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 100M->100M(128M), 0.0007686 secs]
2020-10-24T09:38:25.374-0800: 0.463: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.374-0800: 0.463: [GC concurrent-root-region-scan-end, 0.0000122 secs]
2020-10-24T09:38:25.374-0800: 0.463: [GC concurrent-mark-start]
2020-10-24T09:38:25.374-0800: 0.463: [GC pause (G1 Humongous Allocation) (young) 100M->100M(128M), 0.0005298 secs]
2020-10-24T09:38:25.375-0800: 0.464: [Full GC (Allocation Failure)  100M->95M(128M), 0.0054593 secs]
2020-10-24T09:38:25.381-0800: 0.469: [GC concurrent-mark-abort]
2020-10-24T09:38:25.381-0800: 0.470: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 98M->96M(128M), 0.0006930 secs]
2020-10-24T09:38:25.382-0800: 0.471: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.382-0800: 0.471: [GC concurrent-root-region-scan-end, 0.0000858 secs]
2020-10-24T09:38:25.382-0800: 0.471: [GC concurrent-mark-start]
2020-10-24T09:38:25.383-0800: 0.472: [GC pause (G1 Evacuation Pause) (young)-- 99M->99M(128M), 0.0007575 secs]
2020-10-24T09:38:25.384-0800: 0.473: [GC pause (G1 Evacuation Pause) (young)-- 100M->100M(128M), 0.0006400 secs]
2020-10-24T09:38:25.385-0800: 0.473: [Full GC (Allocation Failure)  100M->97M(128M), 0.0049762 secs]
2020-10-24T09:38:25.390-0800: 0.479: [GC concurrent-mark-abort]
2020-10-24T09:38:25.390-0800: 0.479: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 98M->97M(128M), 0.0005781 secs]
2020-10-24T09:38:25.391-0800: 0.479: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.391-0800: 0.480: [GC concurrent-root-region-scan-end, 0.0000274 secs]
2020-10-24T09:38:25.391-0800: 0.480: [GC concurrent-mark-start]
2020-10-24T09:38:25.391-0800: 0.480: [GC pause (G1 Humongous Allocation) (young)-- 98M->97M(128M), 0.0007068 secs]
2020-10-24T09:38:25.392-0800: 0.481: [GC pause (G1 Evacuation Pause) (young) 98M->97M(128M), 0.0006190 secs]
2020-10-24T09:38:25.393-0800: 0.482: [GC pause (G1 Humongous Allocation) (young)-- 97M->97M(128M), 0.0004845 secs]
2020-10-24T09:38:25.393-0800: 0.482: [Full GC (Allocation Failure)  97M->97M(128M), 0.0028033 secs]
2020-10-24T09:38:25.396-0800: 0.485: [GC concurrent-mark-abort]
2020-10-24T09:38:25.397-0800: 0.486: [GC pause (G1 Evacuation Pause) (young)-- 100M->99M(128M), 0.0011775 secs]
2020-10-24T09:38:25.398-0800: 0.487: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 100M->100M(128M), 0.0004983 secs]
2020-10-24T09:38:25.399-0800: 0.488: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.399-0800: 0.488: [GC concurrent-root-region-scan-end, 0.0000091 secs]
2020-10-24T09:38:25.399-0800: 0.488: [GC concurrent-mark-start]
2020-10-24T09:38:25.399-0800: 0.488: [GC pause (G1 Humongous Allocation) (young) 100M->100M(128M), 0.0004078 secs]
2020-10-24T09:38:25.399-0800: 0.488: [Full GC (Allocation Failure)  100M->98M(128M), 0.0028572 secs]
2020-10-24T09:38:25.402-0800: 0.491: [GC concurrent-mark-abort]
2020-10-24T09:38:25.403-0800: 0.491: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 99M->98M(128M), 0.0008687 secs]
2020-10-24T09:38:25.404-0800: 0.492: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.404-0800: 0.492: [GC concurrent-root-region-scan-end, 0.0000101 secs]
2020-10-24T09:38:25.404-0800: 0.492: [GC concurrent-mark-start]
2020-10-24T09:38:25.404-0800: 0.493: [GC pause (G1 Evacuation Pause) (young) 99M->98M(128M), 0.0005901 secs]
2020-10-24T09:38:25.405-0800: 0.494: [GC pause (G1 Evacuation Pause) (young) 99M->98M(128M), 0.0004713 secs]
2020-10-24T09:38:25.406-0800: 0.494: [GC pause (G1 Evacuation Pause) (young)-- 99M->99M(128M), 0.0004298 secs]
2020-10-24T09:38:25.406-0800: 0.495: [Full GC (Allocation Failure)  99M->98M(128M), 0.0029949 secs]
2020-10-24T09:38:25.409-0800: 0.498: [GC concurrent-mark-abort]
2020-10-24T09:38:25.409-0800: 0.498: [GC pause (G1 Evacuation Pause) (young)-- 99M->99M(128M), 0.0006801 secs]
2020-10-24T09:38:25.410-0800: 0.499: [Full GC (Allocation Failure)  99M->98M(128M), 0.0054572 secs]
2020-10-24T09:38:25.416-0800: 0.505: [GC pause (G1 Evacuation Pause) (young)-- 99M->99M(128M), 0.0004757 secs]
2020-10-24T09:38:25.417-0800: 0.505: [Full GC (Allocation Failure)  99M->99M(128M), 0.0027810 secs]
2020-10-24T09:38:25.420-0800: 0.509: [GC pause (G1 Evacuation Pause) (young)-- 100M->100M(128M), 0.0005296 secs]
2020-10-24T09:38:25.420-0800: 0.509: [Full GC (Allocation Failure)  100M->99M(128M), 0.0087005 secs]
2020-10-24T09:38:25.429-0800: 0.518: [GC pause (G1 Evacuation Pause) (young)-- 100M->100M(128M), 0.0006006 secs]
2020-10-24T09:38:25.430-0800: 0.519: [Full GC (Allocation Failure)  100M->99M(128M), 0.0029400 secs]
2020-10-24T09:38:25.433-0800: 0.522: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 99M->99M(128M), 0.0004284 secs]
2020-10-24T09:38:25.434-0800: 0.523: 2020-10-24T09:38:25.434-0800[GC pause (G1 Humongous Allocation) (young): 0.523: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.434-0800: 0.523: [GC concurrent-root-region-scan-end, 0.0000363 secs]
2020-10-24T09:38:25.434-0800: 0.523: [GC concurrent-mark-start]
 99M->99M(128M), 0.0004196 secs]
2020-10-24T09:38:25.434-0800: 0.523: [Full GC (Allocation Failure)  99M->99M(128M), 0.0108401 secs]
2020-10-24T09:38:25.445-0800: 0.534: [GC concurrent-mark-abort]
2020-10-24T09:38:25.445-0800: 0.534: [GC pause (G1 Evacuation Pause) (young)-- 100M->100M(128M), 0.0006879 secs]
2020-10-24T09:38:25.446-0800: 0.535: [Full GC (Allocation Failure)  100M->99M(128M), 0.0126027 secs]
2020-10-24T09:38:25.459-0800: 0.548: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 100M->100M(128M), 0.0004580 secs]
2020-10-24T09:38:25.460-0800: 0.549: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.460-0800: 0.549: [GC concurrent-root-region-scan-end, 0.0000098 secs]
2020-10-24T09:38:25.460-0800: 0.549: [GC concurrent-mark-start]
2020-10-24T09:38:25.460-0800: 0.549: [GC pause (G1 Humongous Allocation) (young) 100M->100M(128M), 0.0003921 secs]
2020-10-24T09:38:25.460-0800: 0.549: [Full GC (Allocation Failure)  100M->99M(128M), 0.0029139 secs]
2020-10-24T09:38:25.463-0800: 0.552: [GC concurrent-mark-abort]
2020-10-24T09:38:25.464-0800: 0.553: [GC pause (G1 Evacuation Pause) (young)-- 101M->100M(128M), 0.0007529 secs]
2020-10-24T09:38:25.465-0800: 0.554: [GC pause (G1 Evacuation Pause) (young) (initial-mark)-- 101M->101M(128M), 0.0005100 secs]
2020-10-24T09:38:25.465-0800: 0.554: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.465-0800: 0.554: [GC concurrent-root-region-scan-end, 0.0000107 secs]
2020-10-24T09:38:25.465-0800: 0.554: [GC concurrent-mark-start]
2020-10-24T09:38:25.465-0800: 0.554: [Full GC (Allocation Failure)  101M->100M(128M), 0.0030622 secs]
2020-10-24T09:38:25.469-0800: 0.557: [GC concurrent-mark-abort]
2020-10-24T09:38:25.469-0800: 0.558: [GC pause (G1 Evacuation Pause) (young)-- 101M->101M(128M), 0.0004620 secs]
2020-10-24T09:38:25.469-0800: 0.558: [Full GC (Allocation Failure)  101M->100M(128M), 0.0029772 secs]
2020-10-24T09:38:25.472-0800: 0.561: [Full GC (Allocation Failure)  100M->100M(128M), 0.0031147 secs]
2020-10-24T09:38:25.476-0800: 0.564: [GC pause (G1 Evacuation Pause) (young) 100M->100M(128M), 0.0003735 secs]
2020-10-24T09:38:25.476-0800: 0.565: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 100M->100M(128M), 0.0004401 secs]
2020-10-24T09:38:25.477-0800: 0.565: [GC concurrent-root-region-scan-start]
2020-10-24T09:38:25.477-0800: 0.565: [GC concurrent-root-region-scan-end, 0.0000076 secs]
2020-10-24T09:38:25.477-0800: 0.565: [GC concurrent-mark-start]
2020-10-24T09:38:25.477-0800: 0.565: [Full GC (Allocation Failure)  100M->428K(128M), 0.0028833 secs]
2020-10-24T09:38:25.480-0800: 0.568: [GC concurrent-mark-abort]

```
- 内存溢出 这里退化为 SerialGC 进行内存收集

### 2048m
```$xslt
Java HotSpot(TM) 64-Bit Server VM (25.51-b03) for bsd-amd64 JRE (1.8.0_51-b16), built on Jun  8 2015 18:01:11 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
Memory: 4k page, physical 8388608k(198016k free)

/proc/meminfo:

CommandLine flags: -XX:InitialHeapSize=2147483648 -XX:MaxHeapSize=2147483648 -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC 
2020-10-24T09:48:00.453-0800: 0.363: [GC pause (G1 Evacuation Pause) (young) 131M->46M(2048M), 0.0266132 secs]
2020-10-24T09:48:00.540-0800: 0.450: [GC pause (G1 Evacuation Pause) (young) 147M->75M(2048M), 0.0279898 secs]
2020-10-24T09:48:00.632-0800: 0.542: [GC pause (G1 Evacuation Pause) (young) 182M->108M(2048M), 0.0196197 secs]
2020-10-24T09:48:00.688-0800: 0.598: [GC pause (G1 Evacuation Pause) (young) 217M->143M(2048M), 0.0236610 secs]
2020-10-24T09:48:00.784-0800: 0.694: [GC pause (G1 Evacuation Pause) (young) 261M->190M(2048M), 0.0423823 secs]
2020-10-24T09:48:00.886-0800: 0.796: [GC pause (G1 Evacuation Pause) (young) 294M->220M(2048M), 0.0177711 secs]
2020-10-24T09:48:00.948-0800: 0.858: [GC pause (G1 Evacuation Pause) (young) 332M->266M(2048M), 0.0295377 secs]
2020-10-24T09:48:01.044-0800: 0.954: [GC pause (G1 Evacuation Pause) (young) 404M->319M(2048M), 0.0425337 secs]
2020-10-24T09:48:01.152-0800: 1.063: [GC pause (G1 Evacuation Pause) (young) 476M->370M(2048M), 0.0722349 secs]

```
- 一直处于预热阶段，只发生了youngGC，但是发生的次数相对其他的GC要多，因为G1默认从60%就会触碰到阈值，进行GC
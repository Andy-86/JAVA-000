###注意点
thread.setDeamon(true);设置该线程位守护线程，当jvm里面只有守护线程那么jvm就会自动关闭。
###x线程接收Interrupt的方式
- sleep();
- wait();
- join();
### yield() 的用途
```
while(Thread.activeCount()>2){
    Thread.yield();
}
// 这里大于二是因为每个进程启动都会有一个main线程和一个ctr+break线程，后者是用于 ctl+c中断进程的，
//所以假如启动多个线程的话当前活动线程数量就大于2。
```
###出现线程安全问题的原因
- 多线程访问共享资源，且存在竞态条件

package java0.homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author mac
 */
public class Condition {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        final int[] result = {0};
        Lock lock = new ReentrantLock();
        java.util.concurrent.locks.Condition notEnd = lock.newCondition();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    result[0] = sum();
                    notEnd.signal();
                } finally {
                    lock.unlock();
                }
            }
        });
        
        lock.lock();
        thread.start();
        try {
            notEnd.await();
        } finally {
            lock.unlock();
        }

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为：" + result[0]);

        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");

        // 然后退出main线程
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }
}

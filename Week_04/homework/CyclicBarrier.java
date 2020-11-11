package java0.homework;

import java.util.concurrent.BrokenBarrierException;

/**
 * @author mac
 */
public class CyclicBarrier {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        long start = System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        final int[] result = {0};
        java.util.concurrent.CyclicBarrier cyclicBarrier = new java.util.concurrent.CyclicBarrier(2);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                result[0] = sum();
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });
        //这是得到的返回值
        thread.start();
        cyclicBarrier.await();
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

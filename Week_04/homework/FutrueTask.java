package java0.homework;

import java.util.concurrent.*;

/**
 * @author mac
 */
public class FutrueTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long start = System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        final int[] result = {0};

        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                return sum();
            }
        });
        executor.execute(task);
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为：" + task.get());

        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
        executor.shutdown();
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

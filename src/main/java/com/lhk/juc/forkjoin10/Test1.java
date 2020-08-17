package com.lhk.juc.forkjoin10;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 16:16
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1=new MyRunnable1();
        ForkJoinPool pool=new ForkJoinPool();
        pool.execute(myRunnable1);
        pool.shutdown();//关闭线程池
        System.out.println("main begin"+System.currentTimeMillis());
        System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));//最多等待10秒，阻塞
        System.out.println("main end "+System.currentTimeMillis());
        //返回值打印false代表任务池并没有被销毁。
    }
}

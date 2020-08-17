package com.lhk.juc.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 10:45
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool=new ForkJoinPool();
        pool.submit(new MyRecursiveAction(1,10));
        Thread.sleep(5000);
    }
}

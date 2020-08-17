package com.lhk.juc.forkjoin3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 11:10
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool=new ForkJoinPool();
        MyRecursiveTask task=new MyRecursiveTask(1,20);
        ForkJoinTask<String> runTaskA=pool.submit(task);
        System.out.println(runTaskA.join()+"=========");
        Thread.sleep(5000);
    }
}

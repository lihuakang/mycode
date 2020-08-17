package com.lhk.juc.forkjoin6;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:04
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask=new MyRecursiveTask();
            ForkJoinPool pool=new ForkJoinPool();
            pool.execute(myRecursiveTask);
            System.out.println(System.currentTimeMillis());
            System.out.println(myRecursiveTask.get());
            System.out.println(System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

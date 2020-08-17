package com.lhk.juc.forkjoin2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 10:58
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            MyRecursiveTask task1=new MyRecursiveTask();
            System.out.println(task1.hashCode());
            ForkJoinPool pool=new ForkJoinPool();
            ForkJoinTask task2=pool.submit(task1);
            System.out.println(task2.hashCode()+" "+task2.get());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

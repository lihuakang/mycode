package com.lhk.juc.forkjoin4;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 14:18
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyRecursiveTask task=new MyRecursiveTask(1,10);
            ForkJoinPool pool=new ForkJoinPool();
            System.out.println("结果值： "+pool.submit(task).get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

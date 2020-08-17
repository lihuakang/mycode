package com.lhk.juc.forkjoin5;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:00
 */
public class Run {
    public static void main(String[] args) {
        try {
            ForkJoinPool pool=new ForkJoinPool();
            pool.execute(new MyRecursiveAction());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

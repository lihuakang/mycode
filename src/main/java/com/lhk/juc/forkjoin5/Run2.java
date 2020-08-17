package com.lhk.juc.forkjoin5;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:01
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            ForkJoinPool pool=new ForkJoinPool();
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("THreadName="+Thread.currentThread().getName());
                }
            });
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

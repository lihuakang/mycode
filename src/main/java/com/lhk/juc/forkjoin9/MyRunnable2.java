package com.lhk.juc.forkjoin9;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:59
 */
public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE/100;i++){
            new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("任务完成了");
    }
}

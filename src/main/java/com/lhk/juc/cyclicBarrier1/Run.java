package com.lhk.juc.cyclicBarrier1;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 15:41
 */
public class Run {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(2, new Runnable() {
            public void run() {
                System.out.println("全部到了");
            }
        });
        MyThread[] myThreads=new MyThread[6];
        for (int i=0;i<myThreads.length;i++){
            myThreads[i] =new MyThread(cyclicBarrier);
            myThreads[i].start();
        }
    }
}

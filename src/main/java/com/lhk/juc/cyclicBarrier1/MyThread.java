package com.lhk.juc.cyclicBarrier1;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 15:38
 */
public class MyThread extends Thread {
    private CyclicBarrier cbRef;
    public MyThread(CyclicBarrier cbRef){
        super();
        this.cbRef=cbRef;
    }
    public void run(){
        try {
            Thread.sleep((int)Math.random()*10000);
            System.out.println(Thread.currentThread().getName()+"到了"+System.currentTimeMillis());
            cbRef.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.lhk.juc.countDownLatch2;

import java.util.concurrent.CountDownLatch;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:41
 */
public class MyThread extends Thread {
    private CountDownLatch maxRunner;
    public MyThread(CountDownLatch maxRunner){
        super();
        this.maxRunner=maxRunner;
    }
    public void run(){
        try {
            Thread.sleep(2000);
            maxRunner.countDown();
            System.out.println("开炮");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

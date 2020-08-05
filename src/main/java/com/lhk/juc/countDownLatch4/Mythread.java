package com.lhk.juc.countDownLatch4;

import java.util.concurrent.CountDownLatch;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 10:52
 */
public class Mythread extends Thread {
    private CountDownLatch comingTag;//裁判等所有运动员的到来
    private CountDownLatch waitTag;//等待裁判说准备开始
    private CountDownLatch waitRunTag;//等待起跑
    private CountDownLatch beginTag;//起跑
    private CountDownLatch endTag;//所有运动员到达终点
    public Mythread(CountDownLatch comingTag,CountDownLatch waitTag,
                    CountDownLatch waitRunTag,CountDownLatch beginTag,CountDownLatch endTag){
        super();
        this.comingTag=comingTag;
        this.waitTag=waitTag;
        this.waitRunTag=waitRunTag;
        this.beginTag=beginTag;
        this.endTag=endTag;
    }
    public void run() {
        try {
            System.out.println("运动员不同速度来到起跑点");
            Thread.sleep((int)Math.random()*10000);
            System.out.println(Thread.currentThread().getName()+"到起跑点了");
            comingTag.countDown();
            System.out.println("等待裁判说准备");
            waitTag.await();
            System.out.println("各就各位");
            Thread.sleep((int)Math.random()*10000);
            waitTag.countDown();
            beginTag.await();
            System.out.println(Thread.currentThread().getName()+"起跑，到达时间不确定");
            Thread.sleep((int)Math.random()*10000);
            endTag.countDown();
            System.out.println(Thread.currentThread().getName()+"到达终点");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    }

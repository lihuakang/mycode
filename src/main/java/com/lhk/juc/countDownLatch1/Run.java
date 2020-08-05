package com.lhk.juc.countDownLatch1;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:26
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService=new MyService();
        MyThread myThread=new MyThread(myService);
        myThread.start();
        Thread.sleep(2000);
        myService.downMethod();
    }
}

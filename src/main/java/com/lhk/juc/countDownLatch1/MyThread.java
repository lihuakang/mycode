package com.lhk.juc.countDownLatch1;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:25
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        this.myService=myService;
    }
    public void run(){
        myService.testMethod();
    }
}

package com.lhk.juc.countDownLatch3;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:51
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }
    public void run() {
        myService.testMethod();
    }
    }

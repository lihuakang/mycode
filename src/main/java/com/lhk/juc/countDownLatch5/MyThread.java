package com.lhk.juc.countDownLatch5;

import com.lhk.juc.countDownLatch4.Mythread;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 15:24
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }
    public void run(){
        myService.testMethod();
    }
}

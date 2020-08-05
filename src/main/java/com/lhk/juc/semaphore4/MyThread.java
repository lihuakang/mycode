package com.lhk.juc.semaphore4;

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

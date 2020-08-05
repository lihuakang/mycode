package com.lhk.juc.semaphore6;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 10:21
 */
public class ThreadC extends Thread {
    private RepastService service;
    public ThreadC(RepastService service){
        super();
        this.service=service;
    }
    public void run(){
        service.get();
    }
}

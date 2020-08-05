package com.lhk.juc.semaphore6;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 10:21
 */
public class ThreadP extends Thread {
    private RepastService service;
    public ThreadP(RepastService service){
        super();
        this.service=service;
    }
    public void run(){
        service.set();
    }
}

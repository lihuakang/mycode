package com.lhk.juc.Exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 11:22
 */
public class ThreadA extends Thread {
    private Exchanger<String> exchanger;
    public ThreadA(Exchanger<String> exchanger){
        super();
        this.exchanger=exchanger;
    }
    public void run(){
        try {
            System.out.println("线程A中得到线程B的值"+exchanger.exchange("中国人A"));
            System.out.println("A end");
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
}

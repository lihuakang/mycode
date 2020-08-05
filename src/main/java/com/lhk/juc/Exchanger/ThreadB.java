package com.lhk.juc.Exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 11:27
 */
public class ThreadB extends Thread {
    private Exchanger<String> exchanger;
    public ThreadB(Exchanger exchanger){
        super();
        this.exchanger=exchanger;
    }
    public void run(){
        try {
            System.out.println("线程B获取线程A的值="+exchanger.exchange("中国人B"));
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}

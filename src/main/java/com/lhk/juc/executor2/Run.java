package com.lhk.juc.executor2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/7 11:02
 */
public class Run {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory=new MyThreadFactory();
        ExecutorService executorService= Executors.newCachedThreadPool(myThreadFactory);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("我在运行"+System.currentTimeMillis()+Thread.currentThread().getName());
            }
        });
    }
}

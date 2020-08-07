package com.lhk.juc.executor1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/7 10:35
 */
public class Run2 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i=0;i<5;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("run!");
                }
            });
        }
    }
}

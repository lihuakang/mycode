package com.lhk.juc.executor3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/7 11:12
 */
public class Run {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i=0;i<3;i++){
            executorService.execute(new MyRunnable(""+(i+1)));
        }
        for (int i=0;i<3;i++){
            executorService.execute(new MyRunnable(""+(i+1)));
        }
    }
}

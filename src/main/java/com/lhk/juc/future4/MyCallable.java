package com.lhk.juc.future4;

import java.util.concurrent.Callable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:38
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int i=0;
        while (i==0){
            if (Thread.currentThread().isInterrupted()){
                throw new InterruptedException();
            }
            System.out.println("正在运行");
        }
        return "我的年龄是100";
    }
}

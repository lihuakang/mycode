package com.lhk.juc.forkjoin7;

import java.util.concurrent.Callable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:26
 */
public class MyCallable implements Callable<String> {
    private long sleepValue;
    public MyCallable(long sleepValue){
        super();
        this.sleepValue=sleepValue;
    }
    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName()+" sleep"+sleepValue+" nowTime"+System.currentTimeMillis());
            Thread.sleep(sleepValue);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "我是返回值";
    }
}

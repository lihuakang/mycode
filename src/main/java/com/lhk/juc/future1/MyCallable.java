package com.lhk.juc.future1;

import com.lhk.juc.semaphore6.ThreadP;

import java.util.concurrent.Callable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 14:57
 */
public class MyCallable implements Callable<String> {
    private int age;
    public MyCallable(int age) {
        super();
        this.age=age;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(8000);
        return "返回值年龄是："+age;
    }
}

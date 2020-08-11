package com.lhk.juc.future3;

import java.util.concurrent.Callable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:23
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "我的年龄是100";
    }
}

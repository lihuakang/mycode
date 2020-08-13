package com.lhk.juc.completionService;

import java.util.concurrent.Callable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 11:06
 */
public class MyCallable implements Callable<String> {
    private String username;
    private long sleepValue;
    public MyCallable(String username,long sleepValue){
        super();
        this.username=username;
        this.sleepValue=sleepValue;
    }
    @Override
    public String call() throws Exception {
        System.out.println(username);
        Thread.sleep(sleepValue);
        return "retuen"+username;
    }
}

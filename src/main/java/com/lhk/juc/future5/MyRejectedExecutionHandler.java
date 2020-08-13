package com.lhk.juc.future5;

import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 10:50
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(((FutureTask)r).toString()+"被拒绝！");
    }
}

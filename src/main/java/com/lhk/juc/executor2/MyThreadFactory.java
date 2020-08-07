package com.lhk.juc.executor2;

import java.util.concurrent.ThreadFactory;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/7 10:58
 */
public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread=new Thread(r);
        thread.setName("定制线程池的线程对象名称"+Math.random());
        return thread;
    }
}

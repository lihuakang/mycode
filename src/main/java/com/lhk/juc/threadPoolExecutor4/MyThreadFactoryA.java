package com.lhk.juc.threadPoolExecutor4;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:39
 */
public class MyThreadFactoryA implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread newThread=new Thread(r);
        newThread.setName("lhk"+new Date());
        return newThread;
    }
}

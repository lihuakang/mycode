package com.lhk.juc.forkjoin2;

import java.util.concurrent.RecursiveTask;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 10:57
 */
public class MyRecursiveTask extends RecursiveTask {

    @Override
    protected Object compute() {
        System.out.println("compute time "+System.currentTimeMillis());
        return 100;
    }
}

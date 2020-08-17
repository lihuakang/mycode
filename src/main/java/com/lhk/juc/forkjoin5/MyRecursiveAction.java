package com.lhk.juc.forkjoin5;

import java.util.concurrent.RecursiveAction;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 14:59
 */
public class MyRecursiveAction extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.println("ThreadName="+Thread.currentThread().getName());
    }
}

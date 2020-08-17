package com.lhk.juc.forkjoin6;

import java.util.concurrent.RecursiveTask;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:03
 */
public class MyRecursiveTask extends RecursiveTask<String> {
    @Override
    protected String compute() {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "我是返回值";
    }
}

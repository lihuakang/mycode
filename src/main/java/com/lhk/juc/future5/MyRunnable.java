package com.lhk.juc.future5;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 10:54
 */
public class MyRunnable implements Runnable {
    private String username;
    public MyRunnable(String usernam){
        this.username=usernam;
    }
    @Override
    public void run() {
        System.out.println(username+"在运行");
    }
}

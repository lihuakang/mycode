package com.lhk.juc.executor1;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/7 10:44
 */
public class MyRunnable implements Runnable {
    private String name;
    public MyRunnable(String name){
        super();
        this.name=name;
    }
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+"username="+name+"begin"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"username="+name+"end"+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

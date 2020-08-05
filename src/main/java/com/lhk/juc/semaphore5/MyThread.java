package com.lhk.juc.semaphore5;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/3 17:27
 */
public class MyThread extends Thread {
    private ListPool listPool;
    public MyThread(ListPool listPool){
        super();
        this.listPool=listPool;
    }
    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName()+"取得值"+getString);
            listPool.put(getString);
        }
    }
}

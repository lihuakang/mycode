package com.lhk.juc.threadPoolExecutor3;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:25
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i=0;i<Integer.MAX_VALUE/50;i++){
                String newString=new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                if (Thread.currentThread().isInterrupted()==true){
                    System.out.println("任务没有完成就中断了");
                    throw new InterruptedException();
                }
            }
            System.out.println("任务完成了");
        }catch (Exception e){
            System.out.println("进入catch中断了任务");
            e.printStackTrace();
        }
    }
}

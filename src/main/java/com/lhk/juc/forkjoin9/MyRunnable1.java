package com.lhk.juc.forkjoin9;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:45
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i=0;i<Integer.MAX_VALUE;i++){
                String newString=new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                if (Thread.currentThread().isInterrupted()==true){
                    System.out.println("任务没有完成，就结束了");
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

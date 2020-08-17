package com.lhk.juc.forkjoin;

import java.util.concurrent.RecursiveAction;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 10:40
 */
public class MyRecursiveAction extends RecursiveAction {
    private int beginValue;
    private int endValue;
    public MyRecursiveAction(int beginValue,int endValue){
        super();
        this.beginValue=beginValue;
        this.endValue=endValue;
    }
    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName()+"-----------");
        if (endValue-beginValue>2){
            int middelNum=(beginValue+endValue)/2;
            MyRecursiveAction leftAction=new MyRecursiveAction(beginValue,middelNum);
            MyRecursiveAction rightAction=new MyRecursiveAction(middelNum+1,endValue);
            this.invokeAll(leftAction,rightAction);
        }else {
            System.out.println("打印组合："+beginValue+"-"+endValue);
        }
    }
}

package com.lhk.design.template;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 12:56
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for (int i=0;i<5;i++){
            print();
        }
        close();
    }
}

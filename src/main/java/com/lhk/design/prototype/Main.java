package com.lhk.design.prototype;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 14:22
 */
public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();
        MessageBox box=new MessageBox('*');
        MessageBox bb=new MessageBox('/');
        manager.register("warning box",box);
        manager.register("slash box",bb);
        Product product=manager.create("warning box");
        product.use("hello world");
        Product product1=manager.create("slash box");
        product1.use("hello world");
    }
}

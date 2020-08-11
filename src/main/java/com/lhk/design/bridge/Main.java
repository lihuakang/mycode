package com.lhk.design.bridge;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 17:41
 */
public class Main {
    public static void main(String[] args) {
        Display d1=new Display(new StringDisplayImpl("hello China"));
        Display d2=new Display(new StringDisplayImpl("hello world"));
        CountDisplay d3=new CountDisplay(new StringDisplayImpl("hello, Univer"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}

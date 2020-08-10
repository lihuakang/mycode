package com.lhk.design.template;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 13:01
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay=new CharDisplay('H');
        abstractDisplay.display();
    }
}

package com.lhk.design.template;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 12:58
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    public StringDisplay(String ch){
        this.string=string;
    }
    @Override
    public void open() {
        System.out.println("==========");
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void close() {
        System.out.println("=========");
    }
}

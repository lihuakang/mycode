package com.lhk.design.bridge;

import com.lhk.design.template.StringDisplay;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 17:37
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;
    public StringDisplayImpl(String string){
        this.string=string;
        this.width=string.getBytes().length;
    }
    @Override
    public void rawOpen() {
    printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void rawClose() {
    printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}

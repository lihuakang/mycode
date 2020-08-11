package com.lhk.design.decorator;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 11:22
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display){
    this.display=display;
    }
}

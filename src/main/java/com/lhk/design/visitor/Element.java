package com.lhk.design.visitor;

/**
 * @Author : lhk
 * @Description :接受访问者访问的接口
 * @Date : 2020/8/11 14:42
 */
public interface Element {
    public abstract void accept(Visitor v);
}

package com.lhk.design.builder;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 16:59
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String string);
    public abstract void makeItems(String[] items);
    public abstract void close();
}

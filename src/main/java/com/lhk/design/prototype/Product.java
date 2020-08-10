package com.lhk.design.prototype;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 14:05
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}

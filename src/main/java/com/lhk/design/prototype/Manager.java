package com.lhk.design.prototype;

import java.util.HashMap;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 14:07
 */
public class Manager {
    private HashMap showcase=new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String protoname){
    Product p= (Product) showcase.get(protoname);
    return p.createClone();
    }
}

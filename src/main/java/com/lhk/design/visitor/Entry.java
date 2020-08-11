package com.lhk.design.visitor;

import com.lhk.design.composite.FileTreatmentException;
import com.lhk.design.iterator.Iterator;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 14:42
 */
public abstract class Entry implements Element {
    public abstract String getName();//获取名字
    public abstract int getSize();//获取大小
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws  FileTreatmentException{
        throw new FileTreatmentException();
    }
    public String toString(){
        return getName()+"("+getSize()+")";
    }
}

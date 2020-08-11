package com.lhk.design.composite;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 9:38
 */
public abstract class Entry {
    public abstract String getname();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString(){
        return getname()+"("+getSize()+")";
    }
}

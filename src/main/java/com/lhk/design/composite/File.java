package com.lhk.design.composite;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 9:42
 */
public class File extends Entry {
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public String getname() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
    }
}

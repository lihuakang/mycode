package com.lhk.design.builder;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 17:03
 */
public class TextBuilder extends Builder {
    private StringBuffer stringBuffer=new StringBuffer();
    @Override
    public void makeTitle(String title) {
    stringBuffer.append("=====================\n");
    stringBuffer.append("["+title+"]\n");
    stringBuffer.append("\n");
    }

    @Override
    public void makeString(String string) {
    stringBuffer.append("*"+string+"\n");
    stringBuffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
    for (int i=0;i<items.length;i++){
        stringBuffer.append(" ~"+items[i]+"\n");
    }
    stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("==================");
    }
    public String getResult(){
        return stringBuffer.toString();
    }
}

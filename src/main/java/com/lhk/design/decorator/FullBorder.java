package com.lhk.design.decorator;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 11:33
 */
public class FullBorder extends Border {

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if (row==0){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else if (row==display.getRows()+1){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else {
            return "|"+display.getRowText(row)+"|";
        }
    }
    private String makeLine(char ch,int count){
        StringBuffer buf=new StringBuffer();
        for (int i=0;i<count;i++){
            buf.append(buf);
        }
        return buf.toString();
    }
}

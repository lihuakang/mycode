package com.lhk.design.decorator;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 11:24
 */
public class SideBorder extends Border {
    private char borderChar;//装饰边框的字符
    protected SideBorder(Display display,char ch) {
        super(display);
        this.borderChar=ch;
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar+display.getRowText(row)+borderChar;
    }
}

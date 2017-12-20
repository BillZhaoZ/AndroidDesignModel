package com.zhao.bill.designmodel.builder.one;

/**
 * 计算机抽象类
 * product角色
 * Created by Bill on 2017/12/16.
 */
public abstract class Computer {

    private String mBoard;
    private String mDisplay;
    public String mOS;

    protected Computer() {

    }

    // 设置CPU核心数
    public void setBoard(String board) {
        mBoard = board;
    }

    // 设置内存
    public void setDisplay(String display) {
        mDisplay = display;
    }

    // 设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return " My Computer:[ mBoard == " + mBoard + " ,mDisplay == " + mDisplay + " , mOS == " + mOS + "]";
    }
}

package com.zhao.bill.designmodel.builder.one;

/**
 * 抽象Builder类
 * Created by Bill on 2017/12/16.
 */
public abstract class Builder {

    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();

}

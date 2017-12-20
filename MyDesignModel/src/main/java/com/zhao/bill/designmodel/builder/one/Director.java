package com.zhao.bill.designmodel.builder.one;

/**
 * Director类，负责构建computer
 * Created by Bill on 2017/12/16.
 */
public class Director {

    private Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}

package com.zhao.bill.designmodel.builder.one;

/**
 * 具体的Computer类
 * Created by Bill on 2017/12/16.
 */
public class MacBook extends Computer {

    public MacBook() {
    }

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.13";
    }
}

package com.zhao.bill.designmodel.abstractfactory.engine;

/**
 * Created by Bill on 2018/1/12.
 */

public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}

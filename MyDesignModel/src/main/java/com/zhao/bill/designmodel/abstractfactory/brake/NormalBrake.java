package com.zhao.bill.designmodel.abstractfactory.brake;

/**
 * Created by Bill on 2018/1/12.
 */

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}

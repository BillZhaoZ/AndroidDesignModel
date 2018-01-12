package com.zhao.bill.designmodel.abstractfactory.tire;

/**
 * Created by Bill on 2018/1/12.
 */

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}

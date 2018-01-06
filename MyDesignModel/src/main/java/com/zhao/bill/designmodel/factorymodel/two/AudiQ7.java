package com.zhao.bill.designmodel.factorymodel.two;

/**
 * Created by Bill on 2018/1/6.
 */

public class AudiQ7 extends AudiCar {

    @Override
    public void drive() {
        System.out.print("Q7 启动啦！！！");
    }

    @Override
    public void selefNavigation() {
        System.out.print("Q7 开始自动巡航啦！！！");
    }
}

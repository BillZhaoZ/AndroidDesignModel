package com.zhao.bill.designmodel.factorymodel.two;

/**
 * 具体汽车生产子类
 * Created by Bill on 2018/1/6.
 */

public class AudiQ5 extends AudiCar {

    @Override
    public void drive() {
        System.out.println("Q5  启动啦！！！");
    }

    @Override
    public void selefNavigation() {
        System.out.println("Q5  开始自动巡航啦！！！");
    }
}

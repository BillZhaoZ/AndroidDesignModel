package com.zhao.bill.designmodel.factorymodel.two;

/**
 * 客户类
 * Created by Bill on 2018/1/6.
 */
public class Client {

    public static void main(String[] args) {

        AudiFactory factory = new AudiCarFactory();

        // 生产汽车
        AudiQ3 audiQ3 = factory.createAudioCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selefNavigation();

        AudiQ5 audiQ5 = factory.createAudioCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selefNavigation();

        AudiQ7 audiQ7 = factory.createAudioCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selefNavigation();

    }
}

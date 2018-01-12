package com.zhao.bill.designmodel.abstractfactory;

/**
 * 客户类
 * Created by Bill on 2018/1/12.
 */

public class CarBuilderClient {

    public static void main(String[] args) {

        Q3Factory factory = new Q3Factory();
        factory.createBrake().brake();
        factory.createEngine().engine();
        factory.createTire().tire();

        System.out.println("=======================");

        Q7Factory q7Factory = new Q7Factory();
        q7Factory.createBrake().brake();
        q7Factory.createEngine().engine();
        q7Factory.createTire().tire();
    }
}

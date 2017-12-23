package com.zhao.bill.designmodel.factorymodel;

/**
 * 具体工厂类
 * Created by Bill on 2017/12/23.
 */
public class ConcreateFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

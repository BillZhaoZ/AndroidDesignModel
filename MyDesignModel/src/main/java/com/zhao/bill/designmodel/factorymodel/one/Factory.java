package com.zhao.bill.designmodel.factorymodel.one;

/**
 * 抽象工厂类
 * Created by Bill on 2017/12/23.
 */
public abstract class Factory {

    /**
     * 抽象工厂方法
     *
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> tClass);

    public abstract Product createProduct();

}

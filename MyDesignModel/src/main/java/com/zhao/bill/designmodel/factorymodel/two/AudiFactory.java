package com.zhao.bill.designmodel.factorymodel.two;

/**
 * 工厂
 * Created by Bill on 2018/1/6.
 */

public abstract class AudiFactory {

    public abstract <T extends AudiCar> T createAudioCar(Class<T> tClass);
}

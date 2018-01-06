package com.zhao.bill.designmodel.factorymodel.two;

/**
 * Created by Bill on 2018/1/6.
 */

public class AudiCarFactory extends AudiFactory {

    @Override
    public <T extends AudiCar> T createAudioCar(Class<T> tClass) {

        AudiCar car = null;

        try {
            car = (AudiCar) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) car;
    }

}

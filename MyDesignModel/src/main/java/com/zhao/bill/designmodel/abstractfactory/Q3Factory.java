package com.zhao.bill.designmodel.abstractfactory;

import com.zhao.bill.designmodel.abstractfactory.brake.IBrake;
import com.zhao.bill.designmodel.abstractfactory.brake.NormalBrake;
import com.zhao.bill.designmodel.abstractfactory.engine.DomesticEngine;
import com.zhao.bill.designmodel.abstractfactory.engine.IEngine;
import com.zhao.bill.designmodel.abstractfactory.tire.ITire;
import com.zhao.bill.designmodel.abstractfactory.tire.NormalTire;

/**
 * Created by Bill on 2018/1/12.
 */

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}

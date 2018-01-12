package com.zhao.bill.designmodel.abstractfactory;

import com.zhao.bill.designmodel.abstractfactory.brake.IBrake;
import com.zhao.bill.designmodel.abstractfactory.brake.SeniorBrake;
import com.zhao.bill.designmodel.abstractfactory.engine.IEngine;
import com.zhao.bill.designmodel.abstractfactory.engine.ImportEngine;
import com.zhao.bill.designmodel.abstractfactory.tire.ITire;
import com.zhao.bill.designmodel.abstractfactory.tire.SUVTire;

/**
 * Created by Bill on 2018/1/12.
 */

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}

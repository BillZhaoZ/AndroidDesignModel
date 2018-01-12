package com.zhao.bill.designmodel.abstractfactory;

import com.zhao.bill.designmodel.abstractfactory.engine.IEngine;
import com.zhao.bill.designmodel.abstractfactory.brake.IBrake;
import com.zhao.bill.designmodel.abstractfactory.tire.ITire;

/**
 * 抽象车子类
 * Created by Bill on 2018/1/12.
 */

public abstract class CarFactory {

    // 生产轮胎
    public abstract ITire createTire();

    // 生产轮胎
    public abstract IEngine createEngine();

    // 生产制动系统
    public abstract IBrake createBrake();
}

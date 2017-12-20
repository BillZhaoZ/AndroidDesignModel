package com.zhao.bill.designmodel.singleInstance.enmu;

/**
 * 枚举单例
 * 写法简单  默认枚举都是线程安全的  在任何情况下都是单例
 * Created by Bill on 2017/12/16.
 */
public enum enmuSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("do it!!!");
    }
}

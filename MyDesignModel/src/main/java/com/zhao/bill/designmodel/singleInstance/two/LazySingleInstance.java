package com.zhao.bill.designmodel.singleInstance.two;

/**
 * 懒汉模式
 * 声明一个静态对象，并且在第一次调用getInstance 方法时进行初始化
 * Created by Bill on 2017/12/15.
 */
public class LazySingleInstance {

    private static LazySingleInstance lazySingleInstance;

    private LazySingleInstance() {

    }

    // 保证多线程下的安全
    public static synchronized LazySingleInstance getLazySingleInstance() {
        if (lazySingleInstance == null) {
            lazySingleInstance = new LazySingleInstance();
        }

        return lazySingleInstance;
    }

}

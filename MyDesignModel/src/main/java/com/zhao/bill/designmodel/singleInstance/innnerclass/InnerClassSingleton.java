package com.zhao.bill.designmodel.singleInstance.innnerclass;

/**
 * 静态内部类
 * Created by Bill on 2017/12/16.
 */

public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.innerInstance;
    }

    /**
     * 静态内部类
     * 保证线程安全，也能保证单例对象的唯一性，同事也延迟加载了单利的实例化
     */
    private static class SingletonHolder {
        private static final InnerClassSingleton innerInstance = new InnerClassSingleton();
    }
}

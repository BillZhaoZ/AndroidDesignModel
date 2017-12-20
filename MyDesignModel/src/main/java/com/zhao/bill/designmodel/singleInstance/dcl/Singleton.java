package com.zhao.bill.designmodel.singleInstance.dcl;

/**
 * double check lock
 * <p>
 * 优点：资源利用高，第一次执行getInstance()方法才会实例化对象，效率高。
 * 缺点：第一次加载反应稍慢，也由于Java内存模型的原因偶尔会失败。
 * Created by Bill on 2017/12/16.
 */

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) { // 避免不必要的同步
                if (singleton == null) { // 在null的情况下创建实例
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

}

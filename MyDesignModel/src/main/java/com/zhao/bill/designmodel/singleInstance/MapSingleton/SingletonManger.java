package com.zhao.bill.designmodel.singleInstance.MapSingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器管理单例
 * <p>
 * 在程序初始化的时候，将多种单例模式注入到一个统一的管理类中，在使用的时候根据key获取对象对应类型的单例对像。
 * 这种方式是得我们可以管理多种单例，并且在使用的时候通过统一的接口进行获取操作，降低了用户的使用成本；
 * <p>
 * Created by Bill on 2017/12/16.
 */

public class SingletonManger {

    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManger() {

    }

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}

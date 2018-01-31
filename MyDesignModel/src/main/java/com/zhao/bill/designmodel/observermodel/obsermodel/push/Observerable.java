package com.zhao.bill.designmodel.observermodel.obsermodel.push;

/**
 * desc:被观察者接口
 * author：Bill
 * date: 2018/1/31
 */
public interface Observerable {

    // 注册
    void registerObserver(Observer o);

    // 解绑
    void removeObserver(Observer o);

    // 通知观测者
    void notifyObservers();
}

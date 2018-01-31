package com.zhao.bill.designmodel.observermodel.obsermodel.push;

/**
 * desc: 观测者 抽象接口
 * author：Bill
 * date: 2018/1/31
 */
public interface Observer {

    void update(int edition, float cost);
}

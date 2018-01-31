package com.zhao.bill.designmodel.observermodel;

/**
 * desc: 具体的观察者  实现观察者抽象接口Observer
 * author：Bill
 * date: 2018/1/31
 */

public class Customer implements Observer {

    private String name;
    private int edition;
    private float cost;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(int edition, float cost) {

        this.edition = edition;
        this.cost = cost;
        buy();
    }

    private void buy() {
        System.out.println(name + "购买了第" + edition + "期的杂志，花费了" + cost + "元。");
    }
}

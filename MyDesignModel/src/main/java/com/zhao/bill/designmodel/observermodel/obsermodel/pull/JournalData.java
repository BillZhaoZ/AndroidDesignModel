package com.zhao.bill.designmodel.observermodel.obsermodel.pull;

import java.util.Observable;

/**
 * 我们来利用Java内置的观察者模式结合拉模型来实现我们上面的小例子。
 */
public class JournalData extends Observable {

    private int edition;
    private float cost;

    public void setInfomation(int edition, float cost) {
        this.edition = edition;
        this.cost = cost;
        setChanged();

        //调用无参数的方法，使用拉模型
        notifyObservers();
    }

    //提供get方法
    public int getEdition() {
        return edition;
    }

    public float getCost() {
        return cost;
    }
}

package com.zhao.bill.designmodel.observermodel.obsermodel.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Consumer implements Observer {

    private String name;
    private int edition;
    private float cost;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        //判断o是否是JournalData的一个实例
        if (o instanceof JournalData) {
            //强制转化为JournalData类型
            JournalData journalData = (JournalData) o;

            //拉取数据
            this.edition = journalData.getEdition();
            this.cost = journalData.getCost();

            buy();
        }

    }

    public void buy() {
        System.out.println(name + "购买了第" + edition + "期的杂志，花费了" + cost + "元。");
    }

}

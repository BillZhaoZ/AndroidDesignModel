package com.zhao.bill.designmodel.observermodel.obsermodel;

import com.zhao.bill.designmodel.observermodel.obsermodel.pull.Consumer;
import com.zhao.bill.designmodel.observermodel.obsermodel.pull.JournalData;

public class Test {

    public static void main(String[] args) {

        /**
         * 推模型
         */

       /* //创建被观察者
        MagazineData magazine = new MagazineData();

        //创建三个不同的观察者
        Observer customerA = new Customer("A");
        Observer customerB = new Customer("B");
        Observer customerC = new Customer("C");

        //将观察者注册到被观察者中
        magazine.registerObserver(customerA);
        magazine.registerObserver(customerB);
        magazine.registerObserver(customerC);

        //更新被观察者中的数据，当数据更新后，会自动通知所有已注册的观察者
        magazine.setInformation(5, 12);*/


        /**
         * 拉模型
         */
        //创建被观察者
        JournalData journal = new JournalData();

        //创建三个不同的观察者
        Consumer consumerA = new Consumer("A");
        Consumer consumerB = new Consumer("B");
        Consumer consumerC = new Consumer("C");

        //将观察者注册到被观察者中
        journal.addObserver(consumerA);
        journal.addObserver(consumerB);
        journal.addObserver(consumerC);

        //更新被观察者中的数据
        journal.setInfomation(6, 11);
    }

}

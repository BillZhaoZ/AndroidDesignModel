package com.zhao.bill.designmodel.observermodel.obsermodel.push;

import java.util.ArrayList;
import java.util.List;

/**
 * desc: 被观测者
 * author：Bill
 * date: 2018/1/31
 */
public class MagazineData implements Observerable {

    private List<Observer> mObservers;
    private int edition;
    private float cost;

    public MagazineData() {
        mObservers = new ArrayList<>();
    }

    /**
     * 注册观察者
     *
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    /**
     * 移除观察者
     *
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = mObservers.indexOf(o);

        if (i >= 0) {
            mObservers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {

        // 遍历观察者 发送通知
        for (int i = 0; i < mObservers.size(); i++) {
            Observer observer = mObservers.get(i);
            observer.update(edition, cost);
        }
    }

    public void setInformation(int edition, float cost) {
        this.edition = edition;
        this.cost = cost;

        //信息更新完毕，通知所有观察者
        notifyObservers();
    }

}

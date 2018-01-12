package com.zhao.bill.designmodel.factorymodel.three;

/**
 * 数据库操作抽象产子类
 * Created by Bill on 2018/1/12.
 */

public class DBHanlder extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {
        return "db";
    }
}

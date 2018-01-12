package com.zhao.bill.designmodel.factorymodel.three;

/**
 * 数据库操作抽象产品类
 * 基类
 * Created by Bill on 2018/1/12.
 */
public abstract class IOHandler {

    /**
     * 添加
     *
     * @param id
     * @param name
     */
    public abstract void add(String id, String name);

    /**
     * 删除
     *
     * @param id
     */
    public abstract void remove(String id);

    /**
     * 更新
     *
     * @param id
     * @param name
     */
    public abstract void update(String id, String name);

    /**
     * 查询
     *
     * @param id
     */
    public abstract String query(String id);
}

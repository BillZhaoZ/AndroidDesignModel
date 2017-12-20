package com.zhao.bill.designmodel.singleInstance.two;

import com.zhao.bill.designmodel.singleInstance.one.Staff;

/**
 * CEo
 * 饿汉单例模式
 * 声明对象时就已经初始化了
 */
public class CEO extends Staff {

    public static final CEO mCeo = new CEO();

    // 构造函数私有化
    private CEO() {

    }

    // 公有的静态方法  对外暴露获取单利的接口
    public static CEO getCeo() {
        return mCeo;
    }

    @Override
    public void work() {
        super.work();
        // 管理vp
    }

}
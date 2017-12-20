package com.zhao.bill.designmodel.builder;

import com.zhao.bill.designmodel.builder.one.Computer;
import com.zhao.bill.designmodel.builder.one.Director;
import com.zhao.bill.designmodel.builder.one.HuaShuoBuilder;
import com.zhao.bill.designmodel.builder.one.MacBookBuilder;

/**
 * Builder 模式
 * <p>
 * 通过具体的MacBookBuilder来构建MacBook对像，而Director封装了构建复杂产品的过程，对外隐藏了细节。
 * Builder和Director一起，将一个复杂对象的构建和表示分开，使得同样的构建过程  可以创建不同的对对象。
 * <p>
 * Created by Bill on 2017/12/15.
 */
public class BuilderModel {

    public static void main(String[] args) {
        // 实例1
        // 构建器
        MacBookBuilder builder = new MacBookBuilder();

        // Director 表示器
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");

        Computer computer = builder.create();
        System.out.println("Computer Info:" + computer.toString());


        // 例子2
        HuaShuoBuilder builder1 = new HuaShuoBuilder();

        Director director1 = new Director(builder1);
        director1.construct("华硕主板", "4K高端显示器");

        Computer computer1 = builder1.create();
        System.out.println("Computer Info:" + computer1.toString());

    }

}

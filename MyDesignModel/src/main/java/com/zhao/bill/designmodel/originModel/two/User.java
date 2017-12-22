package com.zhao.bill.designmodel.originModel.two;

/**
 * Created by Bill on 2017/12/22.
 */

public class User implements Cloneable {

    public int age;
    public String name;
    public String phoneNum;
    public Adress adress;

    @Override
    protected User clone() {
        User user = null;

        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public String toString() {
        return "User ;;;;  age = " + age + "name = " + name + "address = " + adress;
    }
}

package com.zhao.bill.designmodel.originModel.two;

/**
 * Created by Bill on 2017/12/22.
 */

public class Adress {

    public String city;
    public String district;
    public String street;

    public Adress(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Adress ;;;;  city = " + city + "district = " + district + "street = " + street;
    }
}

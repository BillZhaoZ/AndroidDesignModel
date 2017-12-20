package com.zhao.bill.designmodel.singleInstance.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司类
 * Created by Bill on 2017/12/15.
 */
public class Company {

    private List<Staff> allStaff = new ArrayList<Staff>();

    public void addStaff(Staff staff) {
        allStaff.add(staff);
    }

    public void showAllStaff() {
        for (Staff staff : allStaff) {
            System.out.println("obj:" + staff.toString());
        }
    }
}

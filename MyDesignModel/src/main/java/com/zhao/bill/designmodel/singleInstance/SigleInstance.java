package com.zhao.bill.designmodel.singleInstance;

import com.zhao.bill.designmodel.singleInstance.enmu.enmuSingleton;
import com.zhao.bill.designmodel.singleInstance.one.Company;
import com.zhao.bill.designmodel.singleInstance.one.Staff;
import com.zhao.bill.designmodel.singleInstance.one.VP;
import com.zhao.bill.designmodel.singleInstance.two.CEO;

/**
 * 单例模式
 * Created by Bill on 2017/12/15.
 */

public class SigleInstance {

    public static void main(String[] args) {

        instanceOne();

        enmuSingleton instance = enmuSingleton.INSTANCE;
    }

    /**
     * 实例1
     */
    private static void instanceOne() {
        Company company = new Company();

        // ceo 只能通过getCEO 函数获取
        Staff ceoa1 = CEO.getCeo();
        Staff ceoa2 = CEO.getCeo();

        company.addStaff(ceoa1);
        company.addStaff(ceoa2);

        // 通过new 创建vp对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();

        // 通过new 创建staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        company.addStaff(vp1);
        company.addStaff(vp2);
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);

        company.showAllStaff();
    }

}

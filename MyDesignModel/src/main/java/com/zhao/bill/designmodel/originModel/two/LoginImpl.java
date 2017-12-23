package com.zhao.bill.designmodel.originModel.two;

/**
 * 登录实现类
 * Created by Bill on 2017/12/22.
 */

public class LoginImpl implements Login {

    @Override
    public void login() {

        User user = new User();
        user.age = 22;
        user.name = "Mr.Simple";
        user.adress = new Adress("北京市", "海淀区", "西直门外");

        // setLoginUser(user);

        LoginSession.getLoginSession().setLoginUser(user);
    }
}

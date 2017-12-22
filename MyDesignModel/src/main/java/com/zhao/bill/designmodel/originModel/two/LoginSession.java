package com.zhao.bill.designmodel.originModel.two;

/**
 * 登录session
 * Created by Bill on 2017/12/22.
 */

public class LoginSession {

    static LoginSession loginSession = null;

    private User mUser;

    private LoginSession() {

    }

    public static LoginSession getLoginSession() {
        if (loginSession == null) {
            loginSession = new LoginSession();
        }

        return loginSession;
    }

    public  void setLoginUser(User user) {
        mUser = user;
    }

    public User getLoginUser() {
        return mUser;
    }
}

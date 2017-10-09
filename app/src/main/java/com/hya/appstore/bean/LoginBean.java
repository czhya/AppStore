package com.hya.appstore.bean;

/**
 * Created by 洪裕安 on 2017/10/7.
 */

public class LoginBean extends BaseBean {

    private String token;
    private User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

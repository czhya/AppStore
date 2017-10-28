package com.hya.appstore.data;

import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.bean.requestBean.LoginRequestBean;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.LoginContract;

import rx.Observable;

/**
 * Created by hya on 2017/10/26.
 */

public class LoginModel implements LoginContract.ILoginModel {

    private ApiService apiService;

    public LoginModel(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Observable<BaseBean<LoginBean>> login(String phone, String password) {

        LoginRequestBean params = new LoginRequestBean();
        params.setEmail(phone);
        params.setPassword(password);

        return apiService.login(params);
    }
}
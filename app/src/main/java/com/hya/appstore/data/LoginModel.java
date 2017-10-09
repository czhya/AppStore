package com.hya.appstore.data;

import android.util.Log;

import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.bean.request.LoginRequestBean;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.LoginPresenter;
import com.hya.appstore.presenter.contract.LoginContract;

import rx.Observable;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

/**
 * Created by 洪裕安 on 2017/10/7.
 */

public class LoginModel implements LoginContract.ILoginModel {

    private ApiService apiService;

    public LoginModel(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Observable<BaseEntry<LoginBean>> login(String phone, String password) {

        LoginRequestBean params = new LoginRequestBean();
        params.setEmail(phone);
        params.setPassword(password);

        System.out.println(params.getPassword()+"  "+params.getEmail());

        return apiService.login(params);
    }
}

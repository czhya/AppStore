package com.hya.appstore.di.module;

import com.hya.appstore.data.LoginModel;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.LoginContract;

import dagger.Module;
import dagger.Provides;

/**
 * @author hya
 */
@Module
public class LoginModule {
    private LoginContract.ILoginView  mView;

    public LoginModule(LoginContract.ILoginView  mView) {
        this.mView = mView;
    }

    @Provides
    public LoginContract.ILoginView provideView() {
        return mView;
    }

    @Provides
    public LoginContract.ILoginModel provideModel(ApiService apiService) {
        return new LoginModel(apiService);
    }
}
package com.hya.appstore.presenter.contract;

import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.ui.BaseView;

import io.reactivex.Observable;


/**
 * Created by hya on 2017/10/26.
 */

public interface LoginContract {

    interface ILoginModel {

        Observable<BaseBean<LoginBean>> login(String phone, String password);

    }

    interface ILoginView extends BaseView {
        void checkPhoneError();

        void checkPhoneSuccess();

        void loginSuccess(LoginBean bean);
    }
}

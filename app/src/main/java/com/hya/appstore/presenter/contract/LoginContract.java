package com.hya.appstore.presenter.contract;

import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.ui.BaseView;

import rx.Observable;

/**
 * Created by 洪裕安 on 2017/10/7.
 */

public interface LoginContract {

    public interface ILoginModel{

        Observable<BaseEntry<LoginBean>> login(String phone, String password);

    }

    public interface ILoginView extends BaseView{
        void checkPhoneError();
        void checkPhoneSuccess();
        void checkPasswordError();

        void loginSuccess(LoginBean bean);
    }
}

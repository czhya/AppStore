package com.hya.appstore.presenter;

import android.util.Log;

import com.hwangjr.rxbus.RxBus;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.bean.User;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ErrorHandlerSubscriber;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.presenter.contract.LoginContract;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

/**
 * Created by 洪裕安 on 2017/10/7.
 */

public class LoginPresenter extends BasePersenter<LoginContract.ILoginModel,LoginContract.ILoginView> {


    @Inject
    public LoginPresenter(LoginContract.ILoginModel iLoginModel, LoginContract.ILoginView iLoginView) {
        super(iLoginModel, iLoginView);
    }

    public void login(String phone,String password){
//        if (VerificationUtils.matcherPhoneNum(phone)){
//            mView.checkPhoneError();
//            return;
//        }else {
//            mView.checkPhoneSuccess();
//        }
//        if (VerificationUtils.matcherPassword(password)){
//            mView.checkPasswordError();
//            return;
//        }

        mModel.login(phone,password)
                .compose(RxHttpResponseCompat.<LoginBean>compatResult())
                .subscribe(new ErrorHandlerSubscriber<LoginBean>(mContext) {
                    @Override
                    public void onStart() {

                        mView.showLoading();
                    }

                    @Override
                    public void onCompleted() {

                        mView.dismissLoading();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mView.dismissLoading();
                    }

                    @Override
                    public void onNext(Object o) {
                        LoginBean loginBean = (LoginBean) o;
                        mView.loginSuccess(loginBean);
                        saveUser(loginBean);
                        RxBus.get().post(loginBean.getUser());
                    }
                });

    }

    private void saveUser(LoginBean bean){
        ACache aCache = ACache.get(mContext);


        User user = bean.getUser();
        String q = user.getUserName()+" "+user.getLogin_url()+" "+user.getEmail()+" "+user.getMobi();
        System.out.println(q);


        aCache.put("token",bean.getToken());
        aCache.put("user",bean.getUser());
    }


}

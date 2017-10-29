package com.hya.appstore.presenter;

import android.util.Log;

import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.common.rx.RxBus;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ErrorHandlerSubscriber;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.common.util.VerificationUtils;
import com.hya.appstore.presenter.contract.LoginContract;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

/**
 * Created by hya on 2017/10/26.
 */

public class LoginPresenter extends BasePresenter<LoginContract.ILoginModel, LoginContract.ILoginView> {


    private static final String TAG = "LoginPresenter";
    @Inject
    public LoginPresenter(LoginContract.ILoginModel iLoginModel, LoginContract.ILoginView iLoginView) {
        super(iLoginModel, iLoginView);
    }

    public void login(String phone, String password) {
        if (!VerificationUtils.matcherPhoneNum(phone)) {
            mView.checkPhoneError();
            return;
        } else {
            mView.checkPhoneSuccess();
        }

        mModel.login(phone, password)
                .compose(RxHttpResponseCompat.<LoginBean>compatResult())
                .subscribe(new ErrorHandlerSubscriber<LoginBean>(mContext) {

                    @Override
                    public void onSubscribe(Disposable d) {
                        mView.showLoading();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mView.dismissLoading();
                    }

                    @Override
                    public void onComplete() {
                        mView.dismissLoading();
                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        mView.loginSuccess(loginBean);
                        saveUser(loginBean);
                        RxBus.getDefault().post(loginBean.getUser());//发送数据

                    }


                });

    }

    private void saveUser(LoginBean bean) {

        {
            if (bean.getUser()!=null){
                Log.e(TAG, "saveUser1: "+bean.getUser().getLogin_url()+ bean.getUser().getUserName()+bean.getUser().getEmail()+bean.getUser().getMobi()+bean.getUser().getId());
            }

            Log.e(TAG, "saveUser2: "+bean.getToken() );
        }



        ACache aCache = ACache.get(mContext);

        aCache.put("token", bean.getToken());
        aCache.put("user", bean.getUser());
    }


}

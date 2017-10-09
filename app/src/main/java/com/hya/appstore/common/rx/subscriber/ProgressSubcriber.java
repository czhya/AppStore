package com.hya.appstore.common.rx.subscriber;

import android.content.Context;

import com.hya.appstore.common.exception.BaseException;
import com.hya.appstore.common.util.ProgressDialogHandler;
import com.hya.appstore.ui.BaseView;

/**
 * Created by 洪裕安 on 2017/10/5.
 */

public abstract class ProgressSubcriber<T> extends ErrorHandlerSubscriber<T> {

    private BaseView mView;

    public ProgressSubcriber(Context context, BaseView mView) {
        super(context);
        this.mView = mView;
    }

    public boolean isShowProgress(){
        return true;
    }

    @Override
    public void onStart() {
        if (isShowProgress()){
            mView.showLoading();
        }
    }

    @Override
    public void onCompleted() {
        mView.dismissLoading();
    }

    @Override
    public void onError(Throwable e) {
        BaseException baseException = rxErrorHandler.handlerError(e);
        mView.showError(baseException.getMsg());
    }
}

package com.hya.appstore.common.rx.subscriber;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.hya.appstore.common.exception.BaseException;
import com.hya.appstore.common.rx.RxErrorHandler;
import com.hya.appstore.ui.activity.LoginActivity;

/**
 * @author hya
 * @date 2017/10/24
 */

public abstract class ErrorHandlerSubscriber<T> extends BaseSubscriber<T> {

    public RxErrorHandler rxErrorHandler;

    protected Context mContext;

    public ErrorHandlerSubscriber(Context context) {
        this.mContext = context;
        this.rxErrorHandler = new RxErrorHandler(mContext);
    }

    @Override
    public void onError(Throwable e) {
        BaseException baseException = rxErrorHandler.handlerError(e);

        if (baseException == null) {
            e.printStackTrace();
            Log.d("ErrorHandlerSubscriber", e.getMessage());
        } else {
            if (baseException.getCode()==BaseException.ERROR_TOKEN){
                toLogin();
            }
            rxErrorHandler.showErrorMessage(baseException);
        }
    }

    private void toLogin() {
        mContext.startActivity(new Intent(mContext, LoginActivity.class));
    }
}

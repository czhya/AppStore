package com.hya.appstore.common.rx.subscriber;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.hya.appstore.common.exception.BaseException;
import com.hya.appstore.common.rx.RxErrorHandler;
import com.hya.appstore.ui.activity.LoginActivity;


/**
 * Created by 洪裕安 on 2017/10/4.
 */

public abstract class ErrorHandlerSubscriber<T> extends BaseSubscriber {

    protected RxErrorHandler rxErrorHandler = null;

    protected Context mContext;

    public ErrorHandlerSubscriber(Context context) {
        this.mContext = context;
        rxErrorHandler = new RxErrorHandler(mContext);
    }

    @Override
    public void onError(Throwable e) {
        BaseException baseException = rxErrorHandler.handlerError(e);

        System.out.println(baseException.getMsg()+baseException.getCode());

        if (baseException == null) {
            e.printStackTrace();
            Log.d("ErrorHandlerSubscriber", e.getMessage());
        } else {
            rxErrorHandler.showErrorMessage(baseException);
            if(baseException.getCode() == BaseException.ERROR_TOKEN){
                toLogin();
            }
        }
    }

    private void toLogin() {

        Intent intent = new Intent(mContext, LoginActivity.class);
        mContext.startActivity(intent);
    }


}

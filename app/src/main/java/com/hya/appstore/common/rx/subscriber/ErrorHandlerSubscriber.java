package com.hya.appstore.common.rx.subscriber;

import android.content.Context;
import android.util.Log;

import com.hya.appstore.common.exception.BaseException;


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

        if (baseException == null) {
            e.printStackTrace();
            Log.d("ErrorHandlerSubscriber", e.getMessage());
        } else {
            rxErrorHandler.showErrorMessage(baseException);
        }
    }


}

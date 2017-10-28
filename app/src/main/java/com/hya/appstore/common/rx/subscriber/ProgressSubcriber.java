package com.hya.appstore.common.rx.subscriber;

import android.content.Context;

import com.hya.appstore.common.exception.BaseException;
import com.hya.appstore.common.util.ProgressDialogHandler;
import com.hya.appstore.ui.BaseView;

/**
 *
 * @author hya
 * @date 2017/10/25
 */

public  abstract  class ProgressSubcriber<T> extends ErrorHandlerSubscriber<T>  implements ProgressDialogHandler.OnProgressCancelListener {

    private BaseView mBaseView;


    public ProgressSubcriber(Context context, BaseView baseView) {
        super(context);
        this.mBaseView = baseView;

    }

    protected boolean isShowProgressDialog(){
        return  true;
    }

    @Override
    public void onCancelProgress() {
        unsubscribe();
    }

    @Override
    public void onStart() {

        if(isShowProgressDialog()){
           mBaseView.showLoading();
        }

    }

    @Override
    public void onCompleted() {
        if(isShowProgressDialog()){
            mBaseView.dismissLoading();
        }
    }

    @Override
    public void onError(Throwable e) {
        BaseException baseException =  rxErrorHandler.handlerError(e);
        if(isShowProgressDialog()){
            mBaseView.dismissLoading();
        }

        mBaseView.showError(baseException.getDisplayMessage());

    }

}

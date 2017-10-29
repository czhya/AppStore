package com.hya.appstore.common.rx.subscriber;

import android.content.Context;

import com.hya.appstore.common.util.ProgressDialogHandler;

import io.reactivex.disposables.Disposable;

/**
 *
 * @author hya
 * @date 2017/10/25
 */

public  abstract  class ProgressDialogSubcriber<T> extends ErrorHandlerSubscriber<T>  implements ProgressDialogHandler.OnProgressCancelListener {



    private ProgressDialogHandler mProgressDialogHandler;
    private Disposable mDisposable;


    public ProgressDialogSubcriber(Context context) {
        super(context);

        mProgressDialogHandler = new ProgressDialogHandler(mContext,true,this);
    }

    protected boolean isShowProgressDialog(){
        return  true;
    }

    @Override
    public void onCancelProgress() {
        mDisposable.dispose();
    }

    @Override
    public void onSubscribe(Disposable d) {
        mDisposable = d;
        if(isShowProgressDialog()){
            this.mProgressDialogHandler.showProgressDialog();
        }
    }


    @Override
    public void onComplete() {



        if(isShowProgressDialog()){
            this.mProgressDialogHandler.dismissProgressDialog();
        }
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);

        if(isShowProgressDialog()){
            this.mProgressDialogHandler.dismissProgressDialog();
        }

    }

}

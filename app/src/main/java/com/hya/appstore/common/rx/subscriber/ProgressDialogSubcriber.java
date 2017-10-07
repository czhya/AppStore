package com.hya.appstore.common.rx.subscriber;

import android.app.ProgressDialog;
import android.content.Context;

import com.hya.appstore.common.util.ProgressDialogHandler;

/**
 * Created by 洪裕安 on 2017/10/5.
 */

public abstract class ProgressDialogSubcriber<T> extends ErrorHandlerSubscriber<T> implements ProgressDialogHandler.OnProgressCancelListener{

    private ProgressDialogHandler mProgressDialogHandler;


    public ProgressDialogSubcriber(Context context) {
        super(context);

        mProgressDialogHandler = new ProgressDialogHandler(this,true,mContext);
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
            this.mProgressDialogHandler.showProgressDialog();
        }

    }

    @Override
    public void onCompleted() {



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

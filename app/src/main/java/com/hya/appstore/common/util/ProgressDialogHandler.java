package com.hya.appstore.common.util;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;

import com.hya.appstore.R;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by 洪裕安 on 2017/10/5.
 */

public class ProgressDialogHandler extends Handler {

    public static final int SHOW_PROGRESS_DIALOG = 1;
    public static final int DISMISS_PROGRESS_DIALOG = 0;

    private SweetAlertDialog mProgressDialog;

    private Context context;
    private boolean cancelable;
    private OnProgressCancelListener listener;

    public ProgressDialogHandler(OnProgressCancelListener listener, boolean cancelable, Context context) {
        this.listener = listener;
        this.cancelable = cancelable;
        this.context = context;

        initProgressDialog();
    }

    private void initProgressDialog() {

        if (mProgressDialog==null){
            mProgressDialog = new SweetAlertDialog(context,SweetAlertDialog.PROGRESS_TYPE);
            mProgressDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
            mProgressDialog.setTitleText(context.getResources().getString(R.string.loading));

            if (cancelable){
                mProgressDialog.setCancelText(context.getResources().getString(R.string.dialog_cancel));
                mProgressDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        sweetAlertDialog.cancel();
                        if (listener!=null){
                            listener.onCancelProgress();
                        }
                    }
                });
            }
        }
    }

    public void showProgressDialog(){
        if (mProgressDialog!=null&&!mProgressDialog.isShowing()){
            mProgressDialog.show();
        }
    }

    public void dismissProgressDialog(){
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
            mProgressDialog = null;
        }
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case SHOW_PROGRESS_DIALOG:
                showProgressDialog();
                break;
            case DISMISS_PROGRESS_DIALOG:
                dismissProgressDialog();
                break;
        }
    }

    public interface OnProgressCancelListener{

        void onCancelProgress();
    }

}

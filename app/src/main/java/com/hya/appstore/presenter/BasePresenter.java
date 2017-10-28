package com.hya.appstore.presenter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import com.hya.appstore.ui.BaseView;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class BasePresenter<M,V extends BaseView> {


    protected M mModel;

    protected V mView;

    protected Context mContext;

    public BasePresenter(M mModel, V mView) {
        this.mModel = mModel;
        this.mView = mView;
        initContext();
    }

    private void initContext(){
        if (mView instanceof Fragment){
            mContext = ((Fragment) mView).getActivity();
        }else {
            mContext = (Activity)mView;
        }
    }


}

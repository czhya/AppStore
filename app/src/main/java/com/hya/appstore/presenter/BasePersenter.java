package com.hya.appstore.presenter;

import com.hya.appstore.ui.BaseView;

/**
 * Created by 洪裕安 on 2017/10/2.
 */

public class BasePersenter<M, V extends BaseView> {

    protected M mModel;
    protected V mView;

    public BasePersenter(M mModel, V mView) {
        this.mModel = mModel;
        this.mView = mView;
    }
}

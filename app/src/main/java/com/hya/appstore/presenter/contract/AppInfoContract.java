package com.hya.appstore.presenter.contract;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.ui.BaseView;

import java.util.List;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public interface AppInfoContract {
    interface View extends BaseView{

        void showResult(IndexBean indexBean);
        void onRequestPermissionSuccess();
        void onRequestPermissionError();
    }

    interface AppInfoView extends BaseView{
        void showResult(PageBean<AppInfo> PageBean);

        void onLoadMoreComplete();
    }
}

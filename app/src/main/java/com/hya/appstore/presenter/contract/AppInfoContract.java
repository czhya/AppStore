package com.hya.appstore.presenter.contract;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.presenter.BasePresenter;
import com.hya.appstore.ui.BaseView;

import java.util.List;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public interface AppInfoContract {

    interface View extends BaseView {

        void showResult(IndexBean indexBean);

        void onRequestPermissionSuccess();
        void onRequestPermissionError();
    }

    interface AppInfoView extends BaseView{

        void showResult(PageBean<AppInfo> bean);

        void onLoadMoreComplete();

    }
    interface  AppDetailView extends BaseView{

        void showAppDetail(AppInfo appInfo);
    }


}

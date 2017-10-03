package com.hya.appstore.presenter.contract;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.ui.BaseView;

import java.util.List;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public interface RecommendContract {
    interface View extends BaseView{
        void showResult(List<AppInfo> datas);
        void showNoData();
        void showError(String msg);
    }
}

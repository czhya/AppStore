package com.hya.appstore.presenter;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.presenter.contract.AppInfoContract;

import javax.inject.Inject;

/**
 *
 * @author hya
 * @date 2017/10/27
 */

public class AppDetailPresenter extends BasePresenter<AppInfoModel, AppInfoContract.AppDetailView> {

    @Inject
    public AppDetailPresenter(AppInfoModel appInfoModel, AppInfoContract.AppDetailView appDetailView) {
        super(appInfoModel, appDetailView);
    }

    public void getAppDetail(int id) {


        mModel.getAppDetail(id).compose(RxHttpResponseCompat.<AppInfo>compatResult())
                .subscribe(new ProgressSubcriber<AppInfo>(mContext, mView) {
                    @Override
                    public void onNext(AppInfo appInfo) {
                        mView.showAppDetail(appInfo);
                    }
                });

    }
}
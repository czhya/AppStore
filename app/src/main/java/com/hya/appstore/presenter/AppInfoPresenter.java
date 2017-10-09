package com.hya.appstore.presenter;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ErrorHandlerSubscriber;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.presenter.BasePersenter;
import com.hya.appstore.presenter.contract.AppInfoContract;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by 洪裕安 on 2017/10/7.
 */

public class AppInfoPresenter extends BasePersenter<AppInfoModel,AppInfoContract.AppInfoView> {

    @Inject
    public AppInfoPresenter(AppInfoModel mModel, AppInfoContract.AppInfoView mView) {
        super(mModel, mView);
    }

    public void getApps(int type,int page){
        getObservable(type,page).compose(RxHttpResponseCompat.<PageBean<AppInfo>>compatResult()).subscribe(subscriber(page));
    }




    private Subscriber subscriber(int page){
        Subscriber subscriber = null;
        if (page==0){

            subscriber = new ProgressSubcriber<PageBean<AppInfo>>(mContext,mView) {
                @Override
                public void onNext(Object o) {
                    mView.showResult((PageBean<AppInfo>) o);
                }
            };
        }else {
            subscriber = new ErrorHandlerSubscriber<PageBean<AppInfo>>(mContext) {
                @Override
                public void onCompleted() {

                    mView.onLoadMoreComplete();
                }

                @Override
                public void onNext(Object o) {
                    mView.showResult((PageBean<AppInfo>) o);
                }
            };
        }

        return subscriber;
    }

    private Observable<BaseEntry<PageBean<AppInfo>>> getObservable(int type, int page){
        switch (type){
            case Constant.TOPLIST:
               return mModel.topList(page);
            case Constant.GAME:
                return mModel.games(page);
        }

        return Observable.empty();
    }


}

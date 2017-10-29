package com.hya.appstore.presenter;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ErrorHandlerSubscriber;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.presenter.contract.AppInfoContract;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**
 *
 * @author hya
 * @date 2017/10/26
 */

public class AppInfoPresenter extends BasePresenter<AppInfoModel, AppInfoContract.AppInfoView> {


    public static final int TOP_LIST = 1;
    public static final int GAME = 2;
    public static final int CATEGORY = 3;


    public static final int FEATURED = 0;
    public static final int TOPLIST = 1;
    public static final int NEWLIST = 2;


    @Inject
    public AppInfoPresenter(AppInfoModel mModel, AppInfoContract.AppInfoView mView) {
        super(mModel, mView);
    }

    public void getApps(int type, int page) {
        Observable observable = getObservable(type, page, 0, 0);
        observable.compose(RxHttpResponseCompat.<PageBean<AppInfo>>compatResult())
                .subscribe(subscriber(page));
    }

    public void requestCategoryApps(int page, int categoryId, int flagType) {
        getObservable(CATEGORY, page, flagType,categoryId).compose(RxHttpResponseCompat.<PageBean<AppInfo>>compatResult()).subscribe(subscriber(page));

    }

    private Observable<BaseBean<PageBean<AppInfo>>> getObservable(int type, int page, int flagType, int categoryId) {

        switch (type) {

            case TOP_LIST:
                return mModel.topList(page);


            case GAME:
                return mModel.game(page);

            case CATEGORY:

                if (flagType == FEATURED) {

                    return mModel.getFeaturedAppsByCategory(categoryId, page);
                } else if (flagType == TOPLIST) {

                    return mModel.getTopListAppsByCategory(categoryId, page);
                } else if (flagType == NEWLIST) {

                    return mModel.getNewListAppsByCategory(categoryId, page);
                }


            default:
                return Observable.empty();
        }
    }

    private Observer subscriber(int page) {
        Observer subscriber = null;

        if (page == 0) {

            subscriber = new ProgressSubcriber<PageBean<AppInfo>>(mContext, mView) {
                @Override
                public void onNext(PageBean<AppInfo> appInfoPageBean) {
                    mView.showResult(appInfoPageBean);
                }
            };
        } else {

            subscriber = new ErrorHandlerSubscriber<PageBean<AppInfo>>(mContext) {

                @Override
                public void onComplete() {
                    mView.onLoadMoreComplete();
                }

                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(PageBean<AppInfo> pageBean) {
                    mView.showResult(pageBean);
                }
            };
        }

        return subscriber;
    }
}

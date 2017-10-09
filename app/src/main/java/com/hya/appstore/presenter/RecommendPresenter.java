package com.hya.appstore.presenter;

import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.common.rx.RxErrorHandler;
import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.presenter.contract.AppInfoContract;

import javax.inject.Inject;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class RecommendPresenter extends BasePersenter<AppInfoModel, AppInfoContract.View> {

    public RxErrorHandler errorHandler;

    @Inject
    public RecommendPresenter(AppInfoModel mModel, AppInfoContract.View mView, RxErrorHandler errorHandler) {
        super(mModel, mView);
        this.errorHandler = errorHandler;
    }

    public void requestDatas() {

        mModel.index().compose(RxHttpResponseCompat.<IndexBean>compatResult())
                .subscribe(new ProgressSubcriber<IndexBean>(mContext,mView) {
                    @Override
                    public void onNext(Object o) {
                        IndexBean indexBean = (IndexBean) o;
                        mView.showResult(indexBean);
                    }
                });

    }
}

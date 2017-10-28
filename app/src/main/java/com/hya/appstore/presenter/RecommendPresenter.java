package com.hya.appstore.presenter;


import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.presenter.contract.AppInfoContract;

import javax.inject.Inject;

/**
 * @author hya
 * @date 2017/10/24
 */

public class RecommendPresenter extends BasePresenter<AppInfoModel, AppInfoContract.View> {


    @Inject
    public RecommendPresenter(AppInfoModel mModel, AppInfoContract.View mView) {
        super(mModel, mView);

    }


    public void requestDatas() {


        mModel.index().compose(RxHttpResponseCompat.<IndexBean>compatResult())
                .subscribe(new ProgressSubcriber<IndexBean>(mContext,mView) {
                    @Override
                    public void onNext(IndexBean indexBean) {
                        if (indexBean!=null){
                            System.out.println(" RecommendPresenter IndexBean "+indexBean.getRecommendApps().get(0).getDisplayName());
                        }

                        mView.showResult(indexBean);
                    }
                });
    }
}

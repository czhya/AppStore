package com.hya.appstore.presenter.contract;

import android.Manifest;
import android.app.Activity;
import android.util.Log;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.Banner;
import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ErrorHandlerSubscriber;
import com.hya.appstore.common.rx.subscriber.ProgressDialogSubcriber;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.common.rx.subscriber.RxErrorHandler;
import com.hya.appstore.data.RecommendModel;
import com.hya.appstore.presenter.BasePersenter;
import com.tbruyelle.rxpermissions.RxPermissions;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class RecommendPresenter extends BasePersenter<RecommendModel, RecommendContract.View> {

    private RxErrorHandler errorHandler;

    @Inject
    public RecommendPresenter(RecommendModel mModel, RecommendContract.View mView, RxErrorHandler errorHandler) {
        super(mModel, mView);
        this.errorHandler = errorHandler;
    }

    public void requestDatas() {

        mModel.index().compose(RxHttpResponseCompat.<IndexBean>compatResult())
                .subscribe(new ProgressSubcriber<IndexBean>(mContext,mView) {
                    @Override
                    public void onNext(Object o) {
                        IndexBean indexBean = (IndexBean) o;
                        Banner banner = indexBean.getBanners().get(0);
                        Log.d(TAG, "onNext: "+banner.getThumbnail()+" "+banner.getAction()+" "+banner.getId());
                        mView.showResult((IndexBean) o);
                    }
                });

//        RxPermissions rxPermissions = new RxPermissions((Activity) mContext);
//
//        rxPermissions.request(Manifest.permission.READ_PHONE_STATE)
//                .flatMap(new Func1<Boolean, Observable<PageBean<AppInfo>>>() {
//                    @Override
//                    public Observable<PageBean<AppInfo>> call(Boolean aBoolean) {
//
//                        if (aBoolean) {
//                            return mModel.getApps().compose(RxHttpResponseCompat.<PageBean<AppInfo>>compatResult());
//                        } else {
//                            return Observable.empty();
//                        }
//                    }
//                })
//                .subscribe(new ProgressSubcriber<PageBean<AppInfo>>(mContext, mView) {
//                    @Override
//                    public void onNext(Object o) {
//                        mView.showResult(((PageBean<AppInfo>) o).getDatas());
//                    }
//                });


    }
}

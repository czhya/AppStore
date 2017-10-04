package com.hya.appstore.presenter.contract;

import android.util.Log;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.data.RecommendModel;
import com.hya.appstore.presenter.BasePersenter;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class RecommendPresenter extends BasePersenter<RecommendModel,RecommendContract.View> {
    @Inject
    public RecommendPresenter(RecommendModel mModel, RecommendContract.View mView) {
        super(mModel, mView);
    }

    public void requestDatas(){
        mView.showLoading();

        mModel.getApps(new Callback<PageBean<AppInfo>>() {
            @Override
            public void onResponse(Call<PageBean<AppInfo>> call, Response<PageBean<AppInfo>> response) {
                if (response!=null){
                    mView.showResult(response.body().getDatas());
                }else {
                    mView.showNoData();
                }
                mView.dimissLoading();
            }

            @Override
            public void onFailure(Call<PageBean<AppInfo>> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
                mView.dimissLoading();
                mView.showError(t.getMessage());
            }
        });
    }
}

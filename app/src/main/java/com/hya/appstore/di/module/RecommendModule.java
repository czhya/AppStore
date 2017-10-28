package com.hya.appstore.di.module;

import android.app.ProgressDialog;

import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.ui.fragment.RecommendFragment;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

@Module
public class RecommendModule {

    private AppInfoContract.View mView;

    public RecommendModule(AppInfoContract.View mView) {
        this.mView = mView;
    }


    @Provides
    public AppInfoContract.View providerView(){
        return mView;
    }

    @Provides
    public AppInfoModel providerRecommendModel(ApiService apiService){
        return new AppInfoModel(apiService);
    }

    @Provides
    public ProgressDialog providerProgressDialog(AppInfoContract.View view){
        return new ProgressDialog(((RecommendFragment)view).getActivity());
    }



}

package com.hya.appstore.di.module;

import android.app.ProgressDialog;

import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.ui.adapter.AppInfoAdapter;
import com.hya.appstore.ui.fragment.RecommendFragment;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

@Module
public class AppInfoModule {

    private AppInfoContract.AppInfoView mView;

    public AppInfoModule(AppInfoContract.AppInfoView mView) {
        this.mView = mView;
    }


    @Provides
    public AppInfoContract.AppInfoView providerView(){
        return mView;
    }

    @Provides
    public AppInfoModel providerAppInfoModel(ApiService apiService){
        return new AppInfoModel(apiService);
    }


}

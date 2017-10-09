package com.hya.appstore.di.module;

import android.app.ProgressDialog;

import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.ui.fragment.RecommendFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 洪裕安 on 2017/10/3.
 */
@Module
public class RecommendModule {

    private AppInfoContract.View mView;

    public RecommendModule(AppInfoContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public AppInfoContract.View provideView(){
        return mView;
    }

    @Provides
    public AppInfoModel provideModel(ApiService apiService){
        return new AppInfoModel(apiService);
    }

    @Provides
    public ProgressDialog provideProgressDialog(AppInfoContract.View view){
        return new ProgressDialog(((RecommendFragment)view).getActivity());
    }
}

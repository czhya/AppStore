package com.hya.appstore.di.module;

import com.hya.appstore.presenter.contract.AppInfoContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hya on 2017/10/27.
 */

@Module(includes = {AppModelModule.class})
public class AppDetailModule {

    private AppInfoContract.AppDetailView mView;

    public AppDetailModule(AppInfoContract.AppDetailView view){
        this.mView = view;
    }

    @Provides
    public AppInfoContract.AppDetailView provideView(){
        return mView;
    }

}
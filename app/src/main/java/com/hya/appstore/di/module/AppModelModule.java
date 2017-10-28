package com.hya.appstore.di.module;

import com.hya.appstore.data.AppInfoModel;
import com.hya.appstore.data.http.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hya on 2017/10/27.
 */

@Module
public class AppModelModule {

    @Provides
    public AppInfoModel privodeModel(ApiService apiService){

        return  new AppInfoModel(apiService);
    }

}
package com.hya.appstore.di.module;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 洪裕安 on 2017/10/2.
 */

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application application){
        this.mApplication = application;
    }
    @Provides
    @Singleton
    public Application provideApplication(){
        return mApplication;
    }

    @Provides
    @Singleton
    public Gson provideGson(){
        return  new Gson();
    }
}

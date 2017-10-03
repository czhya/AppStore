package com.hya.appstore.di.component;

import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.di.module.AppModule;
import com.hya.appstore.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 洪裕安 on 2017/10/2.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    public ApiService getApiService();
}

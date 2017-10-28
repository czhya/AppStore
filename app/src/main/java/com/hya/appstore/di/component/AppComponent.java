package com.hya.appstore.di.component;

import android.app.Application;

import com.hya.appstore.common.rx.RxErrorHandler;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.di.module.AppModule;
import com.hya.appstore.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 *
 * @author hya
 * @date 2017/10/24
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    /**
     * 获取ApiService
     * @return ApiService
     */
    public ApiService getApiService();

    public Application getApplication();

    public RxErrorHandler getRxErrorHandler();
}

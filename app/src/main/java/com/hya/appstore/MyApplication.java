package com.hya.appstore;

import android.app.Application;
import android.content.Context;

import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppComponent;
import com.hya.appstore.di.module.AppModule;
import com.hya.appstore.di.module.HttpModule;

/**
 * Created by 洪裕安 on 2017/10/2.
 */

public class MyApplication extends Application {

    private AppComponent appComponent;

    public static MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).httpModule(new HttpModule()).build();
    }
}

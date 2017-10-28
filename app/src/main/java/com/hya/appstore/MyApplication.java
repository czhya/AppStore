package com.hya.appstore;

import android.app.Application;
import android.content.Context;
import android.view.View;

import com.hya.appstore.common.font.Cniao5Font;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppComponent;
import com.hya.appstore.di.module.AppModule;
import com.hya.appstore.di.module.HttpModule;
import com.mikepenz.iconics.Iconics;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class MyApplication extends Application {

    private View mView;
    private AppComponent component;

    public View getView() {
        return mView;
    }

    public void setView(View view) {
        mView = view;
    }
    public static MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();

    }

    public DaggerAppComponent getAppComponent(){
        return (DaggerAppComponent) component;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        //only required if you add a custom or generic font on your own
//        Iconics.init(getApplicationContext());

        //register custom fonts like this (or also provide a font definition file)
//        Iconics.registerFont(new Cniao5Font());


        component =  DaggerAppComponent.builder().appModule(new AppModule(this)).httpModule(new HttpModule()).build();
    }
}

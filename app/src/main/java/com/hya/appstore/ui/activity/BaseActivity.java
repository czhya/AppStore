package com.hya.appstore.ui.activity;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;

import com.hya.appstore.MyApplication;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.presenter.BasePresenter;
import com.mikepenz.iconics.context.IconicsLayoutInflater2;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by hya on 2017/10/24.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    private Unbinder unbinder;

    public MyApplication application;

    @Inject
    T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory2(getLayoutInflater(), new IconicsLayoutInflater2(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        unbinder = ButterKnife.bind(this);
        this.application = (MyApplication) getApplication();

        setupActivityComponent(application.getAppComponent());

        init();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != Unbinder.EMPTY) {
            unbinder.unbind();
        }
    }


    /**
     * 抽象方法，初始化布局控件等
     */
    public abstract void init();

    /**
     * 设置布局文件
     * @return
     */
    public abstract int setLayout();

    public abstract void setupActivityComponent(AppComponent component);


}

package com.hya.appstore.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;

import com.hya.appstore.MyApplication;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.presenter.BasePersenter;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public abstract class BaseActivity<T extends BasePersenter> extends AppCompatActivity {
    private Unbinder unBinder;
    private MyApplication myApplication;


    @Inject
    T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        unBinder = ButterKnife.bind(this);
        this.myApplication = (MyApplication) getApplication();

        setupAcitivtyComponent(myApplication.getAppComponent());
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unBinder!=Unbinder.EMPTY){
            unBinder.unbind();
        }
    }

    public abstract int setLayout();
    public abstract void init();
    public abstract  void setupAcitivtyComponent(AppComponent appComponent);
}

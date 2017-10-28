package com.hya.appstore.ui.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hya.appstore.MyApplication;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.presenter.BasePresenter;
import com.hya.appstore.ui.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by hya on 2017/10/24.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements BaseView{

    private Unbinder unbinder;
    private MyApplication application;

    View mRootView;


    @Inject
    T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mRootView = inflater.inflate(setLayout(), container, false);
        unbinder = ButterKnife.bind(this, mRootView);


        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        this.application = (MyApplication) getActivity().getApplication();
        setupActivityComponent(application.getAppComponent());

        init();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != Unbinder.EMPTY) {
            unbinder.unbind();
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void dismissLoading() {

    }

    public abstract void init();

    public abstract int setLayout();

    public abstract void setupActivityComponent(AppComponent component);

}

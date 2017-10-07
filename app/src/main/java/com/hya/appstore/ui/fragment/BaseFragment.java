package com.hya.appstore.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hya.appstore.MyApplication;
import com.hya.appstore.R;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.presenter.BasePersenter;
import com.hya.appstore.ui.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public abstract class BaseFragment<T extends BasePersenter> extends Fragment implements BaseView{

    private Unbinder unbinder;
    private MyApplication myApplication;
    private View mRootView;
    @Inject
    T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(setLayout(),container,false);
        unbinder = ButterKnife.bind(this,mRootView);
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.myApplication = (MyApplication)(getActivity().getApplication());
        setupActivityComponent(myApplication.getAppComponent());
        init();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder!=unbinder.EMPTY){
            unbinder.unbind();
        }
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showLoading() {

    }

    public abstract int setLayout();
    public abstract void setupActivityComponent(AppComponent appComponent);
    public abstract void init();
}

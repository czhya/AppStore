package com.hya.appstore.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.hya.appstore.MyApplication;
import com.hya.appstore.R;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.presenter.BasePresenter;
import com.hya.appstore.ui.BaseView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by hya on 2017/10/25.
 */

public abstract class ProgressFragment<T extends BasePresenter> extends Fragment implements BaseView{


    private FrameLayout mRootView;

    private  View mViewEmpty;
    private  FrameLayout mViewContent;
    private  View mViewProgress;
    private Unbinder unbinder;

    private TextView mTextError;

    public MyApplication application;

    @Inject
    T mPresenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mRootView = (FrameLayout) inflater.inflate(R.layout.fragment_progress, container, false);


        mViewProgress = mRootView.findViewById(R.id.view_progress);
        mViewContent = mRootView.findViewById(R.id.view_content);
        mViewEmpty = mRootView.findViewById(R.id.view_empty);
        mTextError = mRootView.findViewById(R.id.text_tip);

        mViewEmpty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emptyViewClick();
            }
        });
        return mRootView;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        this.application = (MyApplication) getActivity().getApplication();
        setupActivityComponent(application.getAppComponent());

        setRealContentView();

        init();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != Unbinder.EMPTY) {
            unbinder.unbind();
        }
    }




    private void setRealContentView() {

        View realContentView = LayoutInflater.from(getActivity()).inflate(setLayout(), mViewContent, true);
        unbinder = ButterKnife.bind(this, realContentView);


    }

    public void showProgressView() {
        showView(R.id.view_progress);

    }

    public void showContentView() {
        showView(R.id.view_content);
    }

    public void showEmptyView() {
        showView(R.id.view_empty);
    }

    public void showEmptyView(int resId) {
        showEmptyView();
        showView(R.id.view_empty);
        mTextError.setText(resId);
    }

    public void showEmptyView(String msg) {
        showEmptyView();
        showView(R.id.view_empty);
        mTextError.setText(msg);
    }


    public void showView(int viewId) {
        for (int i = 0; i < mRootView.getChildCount(); i++) {
            if (mRootView.getChildAt(i).getId() == viewId) {
                mRootView.getChildAt(i).setVisibility(View.VISIBLE);
            } else {
                mRootView.getChildAt(i).setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void showLoading() {
        showProgressView();
    }

    @Override
    public void showError(String message) {

       showEmptyView(message);
    }

    @Override
    public void dismissLoading() {

        showContentView();
    }


    public void emptyViewClick() {}
    /**
     * 初始化布局
     */
    public abstract void init();

    public abstract int setLayout();

    public abstract void setupActivityComponent(AppComponent component);


}

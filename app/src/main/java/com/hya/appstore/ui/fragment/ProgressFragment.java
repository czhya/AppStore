package com.hya.appstore.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.hya.appstore.MyApplication;
import com.hya.appstore.R;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.presenter.BasePersenter;
import com.hya.appstore.ui.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 洪裕安 on 2017/10/5.
 */

public abstract class ProgressFragment<T extends BasePersenter> extends Fragment implements BaseView{


    private FrameLayout mRootView;

    private View progressView;
    private FrameLayout contentView;
    private View emptyView;

    private Unbinder unbinder;

    private TextView mTextError;

    private MyApplication myApplication;

    @Inject
    T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = (FrameLayout) inflater.inflate(R.layout.fragment_progress, container, false);
        progressView = mRootView.findViewById(R.id.view_progress);
        contentView = (FrameLayout) mRootView.findViewById(R.id.view_content);
        emptyView = mRootView.findViewById(R.id.view_empty);

        mTextError = ( TextView) mRootView.findViewById(R.id.text_tip);
        mTextError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emptyViewClick();
            }
        });


        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.myApplication = (MyApplication)(getActivity().getApplication());
        setupActivityComponent(myApplication.getAppComponent());
        setRealContentView();
        init();
    }

    private void setRealContentView() {
        View realContentView = LayoutInflater.from(getActivity()).inflate(setLayout(), contentView, true);
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
        showView(R.id.view_empty);
        mTextError.setText(resId);
    }

    public void showEmptyView(String msg) {
        showView(R.id.view_empty);
        mTextError.setText(msg);
    }

    public void emptyViewClick(){

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
    public void dismissLoading() {
        showContentView();
    }

    @Override
    public void showError(String msg) {
        showError(msg);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder!=unbinder.EMPTY){
            unbinder.unbind();
        }
    }

    public abstract int setLayout();
    public abstract void setupActivityComponent(AppComponent appComponent);
    public abstract void init();
}

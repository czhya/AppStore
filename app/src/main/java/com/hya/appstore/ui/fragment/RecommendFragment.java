package com.hya.appstore.ui.fragment;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hya.appstore.R;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerRecommentComponent;
import com.hya.appstore.di.module.RecommendModule;
import com.hya.appstore.presenter.contract.RecommendContract;
import com.hya.appstore.presenter.contract.RecommendPresenter;
import com.hya.appstore.ui.adapter.IndexMultipleAdapter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 洪裕安 on 2017/10/1.
 */

public class RecommendFragment extends BaseFragment<RecommendPresenter> implements RecommendContract.View {

    @BindView(R.id.recyclerview_recomment)
    RecyclerView recyclerviewRecomment;
    Unbinder unbinder;
    private IndexMultipleAdapter mAdapter;


    private void initRecyclerView() {
        //为RecyclerView设置布局管理器
        recyclerviewRecomment.setLayoutManager(new LinearLayoutManager(getActivity()));

        //动画
        recyclerviewRecomment.setItemAnimator(new DefaultItemAnimator());

    }



    @Override
    public void showError(String msg) {
        Toast.makeText(getActivity(), "服务器出错", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(IndexBean indexBean) {
        mAdapter = new IndexMultipleAdapter(getActivity());
        mAdapter.setData(indexBean);

        recyclerviewRecomment.setAdapter(mAdapter);

    }

    @Override
    public void onRequestPermissionSuccess() {
        mPresenter.requestDatas();
    }

    @Override
    public void onRequestPermissionError() {
        Toast.makeText(getActivity(),"你已拒绝授权",Toast.LENGTH_LONG).show();
    }


    @Override
    public int setLayout() {
        return R.layout.fragment_recomment;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerRecommentComponent.builder().appComponent(appComponent).recommendModule(new RecommendModule(this)).build().inject(this);
    }

    @Override
    public void init() {
        initRecyclerView();
        mPresenter.requestDatas();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

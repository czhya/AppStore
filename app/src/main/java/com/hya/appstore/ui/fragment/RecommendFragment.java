package com.hya.appstore.ui.fragment;

import android.content.Intent;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.hya.appstore.R;
import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerRecommendComponent;
import com.hya.appstore.di.module.RecommendModule;
import com.hya.appstore.presenter.RecommendPresenter;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.ui.activity.AppDetailActivity;
import com.hya.appstore.ui.adapter.IndexMutilAdapter;


import butterknife.BindView;

/**
 * @author hya
 * @date 2017/10/24
 */

public class RecommendFragment extends ProgressFragment<RecommendPresenter> implements AppInfoContract.View{


    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;


    private IndexMutilAdapter adapter;


    @Override
    public void init() {
        initRecyclerView();
        mPresenter.requestDatas();
    }

    @Override
    public int setLayout() {
        return R.layout.template_recyclerview;
    }

    @Override
    public void setupActivityComponent(AppComponent component) {

      DaggerRecommendComponent.builder().appComponent(component)
                .recommendModule(new RecommendModule(this)).build().inject(this);

    }


    private void initRecyclerView(){

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());




    }



    @Override
    public void emptyViewClick() {
      mPresenter.requestDatas();
    }


    @Override
    public void showResult(IndexBean indexBean) {
        adapter = new IndexMutilAdapter(getActivity());
        adapter.setData(indexBean);
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public void onRequestPermissionSuccess() {
        mPresenter.requestDatas();
    }

    @Override
    public void onRequestPermissionError() {
        Toast.makeText(this.getActivity()  , "你已拒绝授权", Toast.LENGTH_SHORT).show();
    }
}

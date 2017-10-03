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
import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerRecommentComponent;
import com.hya.appstore.di.module.RecommendModule;
import com.hya.appstore.presenter.contract.RecommendContract;
import com.hya.appstore.presenter.contract.RecommendPresenter;
import com.hya.appstore.ui.adapter.RecommentAdapter;
import com.hya.appstore.ui.decoration.DividerItemDecoration;

import java.util.List;

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
    private RecommentAdapter mAdapter;
    @Inject
    ProgressDialog progressDialog;

    @Override
    public void showResult(List<AppInfo> datas) {
        initRecyclerView(datas);
    }

    private void initRecyclerView(List<AppInfo> datas) {
        //为RecyclerView设置布局管理器
        recyclerviewRecomment.setLayoutManager(new LinearLayoutManager(getActivity()));

        //为RecyclerView设置分割线(这个可以对DividerItemDecoration进行修改，自定义)
        recyclerviewRecomment.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.HORIZONTAL_LIST));

        //动画
        recyclerviewRecomment.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new RecommentAdapter(getActivity(),datas);

        recyclerviewRecomment.setAdapter(mAdapter);
    }

    @Override
    public void showNoData() {
        Toast.makeText(getActivity(), "暂无数据，请稍后重试", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showError(String msg) {
        Toast.makeText(getActivity(), "服务器出错", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        progressDialog.show();
    }

    @Override
    public void dimissLoading() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();

        }
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

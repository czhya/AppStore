package com.hya.appstore.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.hya.appstore.R;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.presenter.AppInfoPresenter;
import com.hya.appstore.ui.adapter.AppInfoAdapter;
import com.hya.appstore.ui.decoration.DividerItemDecoration;

import butterknife.BindView;

/**
 * Created by 洪裕安 on 2017/10/7.
 */

public abstract class BaseAppInfoFragment extends ProgressFragment<AppInfoPresenter> implements AppInfoContract.AppInfoView,BaseQuickAdapter.RequestLoadMoreListener {
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    int page = 0;

    public AppInfoAdapter appInfoAdapter;

    @Override
    public void showResult(PageBean pageBean) {

        appInfoAdapter.addData(pageBean.getDatas());

        if (pageBean.isHasMore()){
            page++;
        }
        appInfoAdapter.setEnableLoadMore(pageBean.isHasMore());
    }

    public void initRecyclerView(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST);
        mRecyclerView.addItemDecoration(itemDecoration);

        appInfoAdapter = adapterBuilder();
        appInfoAdapter.setOnLoadMoreListener(this);
        mRecyclerView.setAdapter(appInfoAdapter);

    }

    @Override
    public int setLayout() {
        return R.layout.template_recycler_view;
    }


    @Override
    public void init() {

        mPresenter.getApps(getType(),page);
        initRecyclerView();

    }

    @Override
    public void onLoadMoreRequested() {

        mPresenter.getApps(getType(),page);
    }

    @Override
    public void onLoadMoreComplete() {

        appInfoAdapter.loadMoreComplete();

    }

    abstract AppInfoAdapter adapterBuilder();
    abstract int getType();
}

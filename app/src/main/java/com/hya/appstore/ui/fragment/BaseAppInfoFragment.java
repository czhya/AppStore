package com.hya.appstore.ui.fragment;

import android.content.Intent;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.hya.appstore.R;
import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.presenter.AppInfoPresenter;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.ui.activity.AppDetailActivity;
import com.hya.appstore.ui.adapter.AppInfoAdapter;

import butterknife.BindView;

/**
 *
 * @author hya
 * @date 2017/10/26
 */

public abstract class BaseAppInfoFragment extends ProgressFragment<AppInfoPresenter> implements AppInfoContract.AppInfoView, BaseQuickAdapter.RequestLoadMoreListener {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    int page = 0;

    AppInfoAdapter adapter;

    @Override
    public void showResult(PageBean<AppInfo> pageBean) {
        adapter.addData(pageBean.getDatas());

        if (pageBean.isHasMore()){
            page++;
        }

        adapter.setEnableLoadMore(pageBean.isHasMore());

    }

    @Override
    public void onLoadMoreComplete() {
        adapter.loadMoreComplete();
    }

    @Override
    public void init() {
        mPresenter.getApps(type(),page);

        initRecyclerView();

    }

    public void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(itemDecoration);

        adapter = buildAdapter();
        adapter.setOnLoadMoreListener(this);
        recyclerView.setAdapter(adapter);


        recyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                AppInfo appInfo = (AppInfo) adapter.getItem(position);
                application.setView(view);
                Intent intent  = new Intent(getActivity(), AppDetailActivity.class);
                intent.putExtra("appinfo",appInfo);
                startActivity(intent);
            }
        });

    }

    @Override
    public int setLayout() {
        return R.layout.template_recyclerview;
    }


    @Override
    public void onLoadMoreRequested() {
        mPresenter.getApps(type(),page);
    }


    /**
     * 建立一个adapter
     * @return AppInfoAdapter
     */
    abstract AppInfoAdapter buildAdapter();

    /**
     * 返回一个类型
     * @return Int
     */
    abstract int type();


}

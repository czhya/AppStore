package com.hya.appstore.ui.fragment;

import android.content.Intent;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.hya.appstore.R;
import com.hya.appstore.bean.Category;
import com.hya.appstore.common.Constant;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerCategoryComponent;
import com.hya.appstore.di.module.CategoryModule;
import com.hya.appstore.presenter.CategoryPresenter;
import com.hya.appstore.presenter.contract.CategoryContract;
import com.hya.appstore.ui.activity.CategoryActivity;
import com.hya.appstore.ui.adapter.CategoryAdapter;

import java.util.List;

import butterknife.BindView;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class CategoryFragment extends ProgressFragment<CategoryPresenter> implements CategoryContract.CategoryView{
    @BindView(R.id.recycler_view)
    RecyclerView mRecycleView;

    private CategoryAdapter mAdapter;

    @Override
    public int setLayout() {
        return R.layout.template_recyclerview;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {

        DaggerCategoryComponent.builder().appComponent(appComponent).categoryModule(new CategoryModule(this)).build().inject(this);
    }

    @Override
    public void init() {

        initRecyclerView();
        mPresenter.getCategory();

    }

    private void initRecyclerView() {
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()) );

        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL);

        mRecycleView.addItemDecoration(itemDecoration);
        mAdapter = new CategoryAdapter();

        mRecycleView.setAdapter(mAdapter);

        mRecycleView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {

                Intent intent = new Intent(getActivity(), CategoryActivity.class);

                intent.putExtra(Constant.CATEGORY,mAdapter.getData().get(position));

                startActivity(intent);

            }
        });
    }

    @Override
    public void showResult(List<Category> categories) {

        mAdapter.addData(categories);
    }
}


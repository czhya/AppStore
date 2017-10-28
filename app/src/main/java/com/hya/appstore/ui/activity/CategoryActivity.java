package com.hya.appstore.ui.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.hya.appstore.R;
import com.hya.appstore.bean.Category;
import com.hya.appstore.common.Constant;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerCategoryComponent;
import com.hya.appstore.di.module.CategoryModule;
import com.hya.appstore.ui.adapter.CategoryAppAdapter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.ionicons_typeface_library.Ionicons;

import butterknife.BindView;

/**
 * Created by hya on 2017/10/27.
 */

public class CategoryActivity extends BaseActivity {


    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    @BindView(R.id.tool_bar)
    Toolbar mToolBar;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;
    @BindView(R.id.activity_cateogry_app)
    LinearLayout activityCateogryApp;

    private Category category;

    @Override
    public int setLayout() {
        return R.layout.activity_category;
    }

    @Override
    public void setupActivityComponent(AppComponent component) {
    }

    @Override
    public void init() {

        getData();
        initTabLayout();
    }


    private void initTabLayout() {
        mToolBar.setTitle(category.getName());
        mToolBar.setNavigationIcon(
                new IconicsDrawable(this)
                        .icon(Ionicons.Icon.ion_ios_arrow_back)
                        .sizeDp(16)
                        .color(getResources().getColor(R.color.md_white_1000)
                        )
        );
        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        CategoryAppAdapter appAdapter = new CategoryAppAdapter(getSupportFragmentManager(), category.getId());

        mViewPager.setOffscreenPageLimit(appAdapter.getCount());
        mViewPager.setAdapter(appAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void getData() {
        Intent intent = getIntent();

        category = (Category) intent.getSerializableExtra(Constant.CATEGORY);
    }
}

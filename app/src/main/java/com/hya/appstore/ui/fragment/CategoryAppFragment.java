package com.hya.appstore.ui.fragment;


import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppInfoComponent;
import com.hya.appstore.di.module.AppInfoModule;
import com.hya.appstore.ui.adapter.AppInfoAdapter;

/**
 *
 * @author hya
 * @date 2017/10/27
 */

public class CategoryAppFragment extends BaseAppInfoFragment {

    private int categoryId;
    private int mFlagType;


    public CategoryAppFragment(int categoryId, int flagType){
        this.categoryId = categoryId;
        this.mFlagType = flagType;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {

        DaggerAppInfoComponent.builder().appComponent(appComponent).appInfoModule(new AppInfoModule(this))
                .build().injectCategoryAppFragment(this);
    }

    @Override
    public void init() {
        mPresenter.requestCategoryApps(page,categoryId,mFlagType);
        initRecyclerView();

    }

    @Override
    AppInfoAdapter buildAdapter() {
        return AppInfoAdapter.builder().showPosition(false).showBrief(true).showCategoryName(false).build();
    }

    @Override
    int type() {
        return 0;
    }



}


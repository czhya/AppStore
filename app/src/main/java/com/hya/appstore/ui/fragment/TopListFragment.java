package com.hya.appstore.ui.fragment;

import com.hya.appstore.R;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppInfoComponent;
import com.hya.appstore.di.module.AppInfoModule;

import com.hya.appstore.presenter.AppInfoPresenter;
import com.hya.appstore.ui.adapter.AppInfoAdapter;

/**
 * @author hya
 * @date 2017/10/24
 */

public class TopListFragment extends BaseAppInfoFragment{

    @Override
    public void setupActivityComponent(AppComponent component) {
        DaggerAppInfoComponent.builder().appComponent(component)
                .appInfoModule(new AppInfoModule(this)).build().injectTopListFragment(this);
}


    @Override
    AppInfoAdapter buildAdapter() {
        return AppInfoAdapter.builder().layout(R.layout.template_appinfo)
                .showPosition(true).showBrief(false).showCategoryName(true).build();
    }

    @Override
    int type() {
        return AppInfoPresenter.TOP_LIST;
    }
}

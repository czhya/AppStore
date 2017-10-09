package com.hya.appstore.ui.fragment;

import com.hya.appstore.common.Constant;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppInfoComponent;
import com.hya.appstore.di.module.AppInfoModule;
import com.hya.appstore.ui.adapter.AppInfoAdapter;

/**
 * Created by 洪裕安 on 2017/10/1.
 */

public class GameFragment extends BaseAppInfoFragment {
    @Override
    AppInfoAdapter adapterBuilder() {
        return AppInfoAdapter.builder().showPosition(false).showBrief(true).showCategoryName(false).build();
    }

    @Override
    int getType() {
        return Constant.GAME;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {

        DaggerAppInfoComponent.builder().appComponent(appComponent).appInfoModule(new AppInfoModule(this)).build().inject(this);
    }
}

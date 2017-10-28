package com.hya.appstore.ui.fragment;

import android.support.v4.app.Fragment;

import com.hya.appstore.R;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppInfoComponent;
import com.hya.appstore.di.module.AppInfoModule;
import com.hya.appstore.presenter.AppInfoPresenter;
import com.hya.appstore.ui.adapter.AppInfoAdapter;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class GameFragment extends BaseAppInfoFragment {
    @Override
    AppInfoAdapter buildAdapter() {
        return AppInfoAdapter.builder().layout(R.layout.template_appinfo)
                .showPosition(false).showBrief(true).showCategoryName(true).build();
    }

    @Override
    int type() {
        return AppInfoPresenter.GAME;
    }

    @Override
    public void setupActivityComponent(AppComponent component) {
        DaggerAppInfoComponent.builder().appComponent(component)
                .appInfoModule(new AppInfoModule(this)).build().injectGameFragment(this);
    }
}

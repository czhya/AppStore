package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.AppInfoModule;
import com.hya.appstore.ui.fragment.GameFragment;
import com.hya.appstore.ui.fragment.TopListFragment;

import dagger.Component;

/**
 * Created by 洪裕安 on 2017/10/7.
 */
@FragmentScope
@Component(modules = AppInfoModule.class,dependencies = AppComponent.class)
public interface AppInfoComponent {
    void inject(TopListFragment fragment);
    void inject(GameFragment fragment);
}

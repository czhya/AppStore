package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.AppInfoModule;
import com.hya.appstore.ui.fragment.CategoryAppFragment;
import com.hya.appstore.ui.fragment.GameFragment;
import com.hya.appstore.ui.fragment.TopListFragment;

import dagger.Component;

/**
 * Created by hya on 2017/10/26.
 */
@FragmentScope
@Component(modules = AppInfoModule.class,dependencies = AppComponent.class)
public interface AppInfoComponent {

    void injectTopListFragment(TopListFragment fragment);
    void injectGameFragment(GameFragment fragment);
    void injectCategoryAppFragment(CategoryAppFragment fragment);
}

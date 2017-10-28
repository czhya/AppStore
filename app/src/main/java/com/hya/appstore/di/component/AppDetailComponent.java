package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.AppDetailModule;
import com.hya.appstore.ui.fragment.AppDetailFragment;

import dagger.Component;

/**
 * Created by hya on 2017/10/27.
 */

@FragmentScope
@Component(modules = AppDetailModule.class,dependencies = AppComponent.class)
public interface AppDetailComponent {
    void inject(AppDetailFragment fragment);

}

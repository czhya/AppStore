package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.RecommendModule;
import com.hya.appstore.ui.fragment.RecommendFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 洪裕安 on 2017/10/3.
 */
@FragmentScope
@Component(modules = RecommendModule.class,dependencies = AppComponent.class)
public interface RecommentComponent {
    void inject(RecommendFragment fragment);
}

package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.RecommendModule;
import com.hya.appstore.ui.fragment.RecommendFragment;

import dagger.Component;

/**
 *
 * @author hya
 * @date 2017/10/24
 */
@FragmentScope
@Component(modules = RecommendModule.class,dependencies = AppComponent.class)
public interface RecommendComponent {

    void inject(RecommendFragment fragment);

}

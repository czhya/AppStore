package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.CategoryModule;
import com.hya.appstore.ui.fragment.CategoryFragment;

import dagger.Component;

/**
 *
 * @author hya
 * @date 2017/10/27
 */

@FragmentScope
@Component(modules = CategoryModule.class,dependencies = AppComponent.class)
public interface CategoryComponent {

    void inject(CategoryFragment fragment);
}

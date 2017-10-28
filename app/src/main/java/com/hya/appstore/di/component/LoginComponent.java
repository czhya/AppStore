package com.hya.appstore.di.component;

import com.hya.appstore.di.FragmentScope;
import com.hya.appstore.di.module.LoginModule;
import com.hya.appstore.ui.activity.LoginActivity;

import dagger.Component;

/**
 * Created by hya on 2017/10/26.
 */

@FragmentScope
@Component(modules = LoginModule.class,dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity activity);
}

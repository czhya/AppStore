package com.hya.appstore.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by 洪裕安 on 2017/10/2.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface FragmentScope {
}

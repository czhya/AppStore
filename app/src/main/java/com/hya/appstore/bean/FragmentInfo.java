package com.hya.appstore.bean;

import android.support.v4.app.Fragment;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class FragmentInfo {
    private String title;
    private Class fragment;

    public FragmentInfo(String title, Class fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }
}

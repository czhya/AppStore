package com.hya.appstore.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class GuideFragmentAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments;

    public void setFragments(List<Fragment> fragments) {
        if (fragments==null){
            fragments = new ArrayList<>();
        }else {
            this.fragments = fragments;
        }
    }

    public GuideFragmentAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

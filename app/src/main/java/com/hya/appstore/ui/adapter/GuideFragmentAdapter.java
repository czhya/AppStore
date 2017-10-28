package com.hya.appstore.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class GuideFragmentAdapter extends FragmentPagerAdapter {

    List<Fragment> mFragments;

    public GuideFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setFragments(List<Fragment> fragments){
        if (fragments!=null){
            mFragments = fragments;
        }else {
            mFragments = new ArrayList<>();
        }
    }



    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}

package com.hya.appstore.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.hya.appstore.ui.fragment.CategoryAppFragment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hya
 * @date 2017/10/27
 */


public class CategoryAppAdapter extends FragmentStatePagerAdapter {
    private List<String> titles = new ArrayList<>(3);

    private int mCategoryId;


    public CategoryAppAdapter(FragmentManager fm, int categoryId) {
        super(fm);
        this.mCategoryId = categoryId;
        titles.add("精品");
        titles.add("排行");
        titles.add("新品");
    }

    @Override
    public Fragment getItem(int position) {
        return new CategoryAppFragment(mCategoryId,position);
    }


    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position).toString();
    }
}


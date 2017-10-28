package com.hya.appstore.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.hya.appstore.bean.FragmentInfo;
import com.hya.appstore.ui.fragment.CategoryFragment;
import com.hya.appstore.ui.fragment.GameFragment;
import com.hya.appstore.ui.fragment.RecommendFragment;
import com.hya.appstore.ui.fragment.TopListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    private List<FragmentInfo> mFragments = new ArrayList<>(4);
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        initFragment();
    }

    void initFragment(){

        mFragments.add(new FragmentInfo("推荐",RecommendFragment.class));
        mFragments.add(new FragmentInfo("排行",TopListFragment.class));
        mFragments.add(new FragmentInfo("游戏",GameFragment.class));
        mFragments.add(new FragmentInfo("分类",CategoryFragment.class));
    }


    @Override
    public Fragment getItem(int position) {

        try {
            return (Fragment) mFragments.get(position).getFragment().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getTitle();
    }
}

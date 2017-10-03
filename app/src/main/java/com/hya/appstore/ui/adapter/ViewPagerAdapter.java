package com.hya.appstore.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.hya.appstore.bean.FragmentInfo;
import com.hya.appstore.ui.fragment.CategoryFragment;
import com.hya.appstore.ui.fragment.GameFragment;
import com.hya.appstore.ui.fragment.RankingFragment;
import com.hya.appstore.ui.fragment.RecommendFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 洪裕安 on 2017/10/1.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<FragmentInfo> fragmentInfos = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        initFragment();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        try {
            fragment = (Fragment) fragmentInfos.get(position).getFragment().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return fragment;
    }

    private void initFragment(){
        fragmentInfos.add(new FragmentInfo("推荐", RecommendFragment.class));
        fragmentInfos.add(new FragmentInfo("游戏", GameFragment.class));
        fragmentInfos.add(new FragmentInfo("分类", CategoryFragment.class));
        fragmentInfos.add(new FragmentInfo("排行", RankingFragment.class));
    }

    @Override
    public int getCount() {
        return fragmentInfos.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentInfos.get(position).getTitle().toString();
    }
}

package com.hya.appstore.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.hya.appstore.R;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.ui.adapter.GuideFragmentAdapter;
import com.hya.appstore.ui.fragment.GuideFragment;
import com.hya.appstore.ui.wight.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GuideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    public static String IS_GUIDE = "GUIDE";


    @BindView(R.id.viewpager_guide)
    ViewPager viewpagerGuide;
    @BindView(R.id.indicator)
    CircleIndicator indicator;
    @BindView(R.id.layout_relative_guide)
    RelativeLayout activityGuide;
    @BindView(R.id.btn_enter)
    Button btnEnter;

    private GuideFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initDatas();
    }

    private void initDatas() {
        List<Fragment> fragments = new ArrayList<>();

        fragments.add(GuideFragment.newInstance(R.drawable.guide_1, R.color.color_bg_guide1, R.string.guide_1));
        fragments.add(GuideFragment.newInstance(R.drawable.guide_2, R.color.color_bg_guide2, R.string.guide_2));
        fragments.add(GuideFragment.newInstance(R.drawable.guide_3, R.color.color_bg_guide3, R.string.guide_3));

        adapter = new GuideFragmentAdapter(getSupportFragmentManager());
        adapter.setFragments(fragments);

        viewpagerGuide.setCurrentItem(0);
        viewpagerGuide.setOffscreenPageLimit(adapter.getCount());
        viewpagerGuide.setAdapter(adapter);

        viewpagerGuide.addOnPageChangeListener(this);

        indicator.setViewPager(viewpagerGuide);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        btnEnter.setVisibility((position == adapter.getCount() - 1) ? View.VISIBLE : View.GONE);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    @OnClick(R.id.btn_enter)
    public void OnClick(){
        ACache.get(this).put(IS_GUIDE,"0");
        startActivity(new Intent(GuideActivity.this,MainActivity.class));
        this.finish();
    }
}

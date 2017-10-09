package com.hya.appstore.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hwangjr.rxbus.RxBus;
import com.hwangjr.rxbus.annotation.Subscribe;
import com.hya.appstore.R;
import com.hya.appstore.bean.User;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.font.Font;
import com.hya.appstore.common.imageloader.GlideCircleTransform;
import com.hya.appstore.common.imageloader.ImageLoader;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.common.util.PermissionUtil;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.ui.adapter.ViewPagerAdapter;
import com.hya.appstore.ui.wight.BannerLayout;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsLayoutInflater;
import com.mikepenz.ionicons_typeface_library.Ionicons;

import butterknife.BindView;
import rx.functions.Action1;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.layout_drawer)
    DrawerLayout mdrawerLayout;
    @BindView(R.id.design_navigation_view)
    NavigationView navigationview;
    @BindView(R.id.tool_bar)
    Toolbar toolbar;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.tab)
    TabLayout tab;


    ActionBarDrawerToggle mdrawerToggle;
    private View headerview;

    private ImageView mUserImg;
    private TextView mUserName;

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setupAcitivtyComponent(AppComponent appComponent) {

    }

    @Override
    public void init() {
        RxBus.get().register(this);

        PermissionUtil.requestPermisson(this, Manifest.permission.READ_PHONE_STATE)
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean aBoolean) {

                        if(aBoolean){
                            initDrawerLayout();

                            initViewPager();

                            initUser();
                        }else {
                            //------
                        }
                    }
                });



    }

    private void initViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(adapter.getCount());
        tab.setupWithViewPager(viewpager);
    }

    private void initDrawerLayout() {
        headerview = navigationview.getHeaderView(0);
        headerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });
        mUserImg = (ImageView) headerview.findViewById(R.id.img_user);
        mUserImg.setImageDrawable(new IconicsDrawable(this, Font.Icon.cniao_head).colorRes(R.color.white));
        mUserName = (TextView) headerview.findViewById(R.id.text_user_name);


        navigationview.getMenu().findItem(R.id.menu_app_update).setIcon(new IconicsDrawable(this, Ionicons.Icon.ion_ios_loop));
        navigationview.getMenu().findItem(R.id.menu_download_manager).setIcon(new IconicsDrawable(this, Font.Icon.cniao_download));
        navigationview.getMenu().findItem(R.id.menu_app_uninstall).setIcon(new IconicsDrawable(this, Ionicons.Icon.ion_ios_trash_outline));
        navigationview.getMenu().findItem(R.id.menu_setting).setIcon(new IconicsDrawable(this, Ionicons.Icon.ion_ios_gear_outline));

        navigationview.getMenu().findItem(R.id.menu_logout).setIcon(new IconicsDrawable(this, Font.Icon.cniao_shutdown));
        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_logout:
                        logout();
                        break;
                }
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setTitle("AppStore");
        mdrawerToggle = new ActionBarDrawerToggle(this, mdrawerLayout, toolbar, R.string.open, R.string.close);
        mdrawerToggle.syncState();

        mdrawerLayout.addDrawerListener(mdrawerToggle);
    }


    @Subscribe
    public void getUser(User user){

        initUserHeadView(user);
    }

    private void initUser(){

        Object objUser= ACache.get(this).getAsObject(Constant.USER);


        if(objUser ==null){

            headerview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,LoginActivity.class));
                }
            });

        }
        else{

            User user = (User) objUser;

            Log.d(TAG, "initUser: "+user.getUserName());
            initUserHeadView(user);

        }


    }
    private void initUserHeadView(User user){
        System.out.println(user.getUserName()+" "+user.getLogin_url());

        Glide.with(this).load(user.getLogin_url()).transform(new GlideCircleTransform(this)).into(mUserImg);

        mUserName.setText(user.getUserName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RxBus.get().unregister(this);
    }

    private void logout() {

        ACache aCache = ACache.get(this);
        aCache.put(Constant.TOKEN,"");
        aCache.put(Constant.USER,"");

        mUserImg.setImageDrawable(new IconicsDrawable(this, Font.Icon.cniao_head).colorRes(R.color.white));
        mUserName.setText("未登录");

        navigationview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });

        Toast.makeText(MainActivity.this,"您已退出登录",Toast.LENGTH_LONG).show();
    }
}

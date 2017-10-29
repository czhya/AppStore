package com.hya.appstore.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hya.appstore.R;
import com.hya.appstore.bean.User;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.font.Cniao5Font;
import com.hya.appstore.common.imageloader.GlideCircleTransform;
import com.hya.appstore.common.rx.RxBus;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.common.util.PermissionUtil;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.ui.adapter.ViewPagerAdapter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.ionicons_typeface_library.Ionicons;

import butterknife.BindView;
import io.reactivex.functions.Consumer;

/**
 * @author hya
 * @date 2017/10/24
 */

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    @BindView(R.id.Drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.toolBar)
    Toolbar mToolBar;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;

    private View mHeaderView;
    private ImageView mUserHeadView;
    private TextView mTextUserName;


    @Override
    protected void onDestroy() {
        super.onDestroy();
//        RxBus.get().unregister(this);
    }


    private void initUserHeadView(User user) {
        if (user==null){
            Log.e(TAG, " initUserHeadView: user = null" );
        }

        if (user.getLogin_url() != null) {
            Log.d(TAG, "initUserHeadView: " + user.getLogin_url());
        }

        Glide.with(this).load(user.getLogin_url()).transform(new GlideCircleTransform(this)).into(mUserHeadView);

        mTextUserName.setText(user.getUserName());
    }


    @Override
    public void init() {
        RxBus.getDefault().toObservable(User.class).subscribe(new Consumer<User>() {
            @Override
            public void accept(User user) throws Exception {
                initUserHeadView(user);
            }
        });

        PermissionUtil.requestPermisson(this, Manifest.permission.READ_PHONE_STATE)
                .subscribe(new Consumer<Boolean>() {


                    @Override
                    public void accept(Boolean aBoolean) throws Exception {

                        if (aBoolean) {
                            initDrawerLayout();

                            initTabLayout();

                            initUser();
                        } else {
                            //------
                        }
                    }

                });
    }

    private void initUser() {

        Object objUser = ACache.get(this).getAsObject(Constant.USER);

        if (objUser == null) {

            mHeaderView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            });

        } else {

            User user = (User) objUser;
            initUserHeadView(user);

        }


    }

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setupActivityComponent(AppComponent component) {

    }

    void initTabLayout() {

        PagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setOffscreenPageLimit(adapter.getCount());
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }

    void initDrawerLayout() {

        mHeaderView = mNavigationView.getHeaderView(0);

        mUserHeadView = mHeaderView.findViewById(R.id.img_user);
        mUserHeadView.setImageDrawable(new IconicsDrawable(this, Cniao5Font.Icon.cniao_head).colorRes(R.color.white));

        mTextUserName = mHeaderView.findViewById(R.id.text_user_name);


        mNavigationView.getMenu().findItem(R.id.menu_app_update).setIcon(new IconicsDrawable(this, Ionicons.Icon.ion_ios_loop));
        mNavigationView.getMenu().findItem(R.id.menu_download_manager).setIcon(new IconicsDrawable(this, Cniao5Font.Icon.cniao_download));
        mNavigationView.getMenu().findItem(R.id.menu_app_uninstall).setIcon(new IconicsDrawable(this, Ionicons.Icon.ion_ios_trash_outline));
        mNavigationView.getMenu().findItem(R.id.menu_setting).setIcon(new IconicsDrawable(this, Ionicons.Icon.ion_ios_gear_outline));

        mNavigationView.getMenu().findItem(R.id.menu_logout).setIcon(new IconicsDrawable(this, Cniao5Font.Icon.cniao_shutdown));


        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_app_update:
                        //............
                        break;
                    case R.id.menu_download_manager:
                        //............
                        break;
                    case R.id.menu_app_uninstall:
                        //............
                        break;
                    case R.id.menu_setting:
                        //............
                        break;

                    case R.id.menu_logout:
                        logout();
                        break;

                    default:
                        break;

                }
                return false;
            }
        });

        mToolBar.inflateMenu(R.menu.toolbar_menu);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolBar, R.string.open, R.string.close);

        drawerToggle.syncState();

        mDrawerLayout.addDrawerListener(drawerToggle);
    }

    private void logout() {

        ACache aCache = ACache.get(this);

        aCache.put(Constant.TOKEN, "");
        aCache.put(Constant.USER, "");

        mUserHeadView.setImageDrawable(new IconicsDrawable(this, Cniao5Font.Icon.cniao_head).colorRes(R.color.white));
        mTextUserName.setText("未登录");

        mHeaderView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        Toast.makeText(MainActivity.this, "您已退出登录", Toast.LENGTH_LONG).show();
    }
}

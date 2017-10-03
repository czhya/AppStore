package com.hya.appstore.ui.activity;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.hya.appstore.R;
import com.hya.appstore.ui.adapter.ViewPagerAdapter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initDrawerLayout();
        initViewPager();
    }

    private void initViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
        tab.setupWithViewPager(viewpager);
    }

    private void initDrawerLayout() {
        headerview = navigationview.getHeaderView(0);
        headerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "headerview", Toast.LENGTH_SHORT).show();
            }
        });
        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.list_item_A:
                        Toast.makeText(MainActivity.this, "list_item_A", Toast.LENGTH_SHORT).show();
                    case R.id.list_item_B:
                        Toast.makeText(MainActivity.this, "list_item_B", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setTitle(R.string.app_name);
        mdrawerToggle = new ActionBarDrawerToggle(this, mdrawerLayout, toolbar, R.string.open, R.string.close);
        mdrawerToggle.syncState();
        mdrawerLayout.addDrawerListener(mdrawerToggle);
    }
}

package com.hya.appstore.ui.fragment;

import android.annotation.SuppressLint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hya.appstore.R;
import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.imageloader.ImageLoader;
import com.hya.appstore.common.util.DateUtils;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerAppDetailComponent;
import com.hya.appstore.di.module.AppDetailModule;
import com.hya.appstore.di.module.AppModelModule;
import com.hya.appstore.presenter.AppDetailPresenter;
import com.hya.appstore.presenter.contract.AppInfoContract;
import com.hya.appstore.ui.adapter.AppInfoAdapter;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;

/**
 *
 * @author hya
 * @date 2017/10/27
 */

@SuppressLint("ValidFragment")
public class AppDetailFragment extends ProgressFragment<AppDetailPresenter>  implements AppInfoContract.AppDetailView{

    @BindView(R.id.view_gallery)
    LinearLayout mViewGallery;

    @BindView(R.id.view_introduction)
    ExpandableTextView mViewIntroduction;
    @BindView(R.id.txt_update_time)
    TextView mTxtUpdateTime;
    @BindView(R.id.txt_version)
    TextView mTxtVersion;
    @BindView(R.id.txt_apk_size)
    TextView mTxtApkSize;
    @BindView(R.id.txt_publisher)
    TextView mTxtPublisher;
    @BindView(R.id.txt_publisher2)
    TextView mTxtPublisher2;
    @BindView(R.id.recycler_view_same_dev)
    RecyclerView mRecyclerViewSameDev;
    @BindView(R.id.recycler_view_relate)
    RecyclerView mRecyclerViewRelate;


    private LayoutInflater mInflater;

    private int mAppId;

    private AppInfoAdapter mAdapter;

    @SuppressLint("ValidFragment")
    public AppDetailFragment(int id){
        this.mAppId = id;

    }


    @Override
    public void init() {

        mInflater = LayoutInflater.from(getActivity());
        mPresenter.getAppDetail(mAppId);
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_app_detail;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerAppDetailComponent.builder().appComponent(appComponent)
                .appDetailModule(new AppDetailModule(this))
                .appModelModule(new AppModelModule())
                .build().inject(this);
    }


    @Override
    public void showAppDetail(AppInfo appInfo) {

        //应用详情图
        showScreenshot(appInfo.getScreenshot());

        //应用描述
        mViewIntroduction.setText(appInfo.getIntroduction());



        //详细信息
        mTxtUpdateTime.setText(DateUtils.formatDate(appInfo.getUpdateTime()));
        mTxtApkSize.setText((appInfo.getApkSize() / 1014 / 1024) + " Mb");
        mTxtVersion.setText(appInfo.getVersionName());
        mTxtPublisher.setText(appInfo.getPublisherName());
        mTxtPublisher2.setText(appInfo.getPublisherName());


        //相同开发者的应用
        mAdapter = AppInfoAdapter.builder().layout(R.layout.template_appinfo2).build();
        mRecyclerViewSameDev.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mAdapter.addData(appInfo.getSameDevAppInfoList());
        mRecyclerViewSameDev.setAdapter(mAdapter);


        //相关的应用
        mAdapter = AppInfoAdapter.builder().layout(R.layout.template_appinfo2).build();
        mRecyclerViewRelate.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mAdapter.addData(appInfo.getRelateAppInfoList());
        mRecyclerViewRelate.setAdapter(mAdapter);

    }


    private void showScreenshot(String screentShot) {


        List<String> urls = Arrays.asList(screentShot.split(","));


        for (String url : urls) {

            ImageView imageView = (ImageView) mInflater.inflate(R.layout.template_imageview, mViewGallery, false);

            ImageLoader.load(Constant.BASE_IMG_URL + url, imageView);

            mViewGallery.addView(imageView);

        }


    }
}


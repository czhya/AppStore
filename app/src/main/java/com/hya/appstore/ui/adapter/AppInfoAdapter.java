package com.hya.appstore.ui.adapter;

import com.hya.appstore.R;
import com.hya.appstore.bean.AppInfo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hya.appstore.common.imageloader.ImageLoader;
import com.hya.appstore.ui.widget.DownloadButtonConntroller;
import com.hya.appstore.ui.widget.DownloadProgressButton;

import zlc.season.rxdownload2.RxDownload;


/**
 * @author 洪裕安
 * @date 2017/10/6
 */

public class AppInfoAdapter extends BaseQuickAdapter<AppInfo, BaseViewHolder> {
    String baseImgUrl = "http://file.market.xiaomi.com/mfc/thumbnail/png/w150q80/";


    private Builder mBuilder;
    private DownloadButtonConntroller mDownloadButtonConntroller;

    private AppInfoAdapter(Builder builder) {
        super(builder.layoutId);

        this.mBuilder = builder;
        mDownloadButtonConntroller = new DownloadButtonConntroller(builder.rxDownload);

        openLoadAnimation();
    }


    public static Builder builder() {

        return new Builder();
    }

    @Override
    protected void convert(BaseViewHolder helper, AppInfo item) {

        ImageLoader.load(baseImgUrl + item.getIcon(), (ImageView) helper.getView(R.id.img_app_icon));

        if (item.getBriefShow() != null) {
            helper.setText(R.id.txt_brief, item.getBriefShow());
        }
        helper.setText(R.id.txt_app_name, item.getDisplayName());
//        helper.setText(R.id.txt_brief, item.getBriefShow());


        TextView txtViewPosition = helper.getView(R.id.txt_position);
        if (txtViewPosition != null) {
            txtViewPosition.setVisibility(mBuilder.isShowPosition ? View.VISIBLE : View.GONE);
            txtViewPosition.setText(item.getPosition() + 1 + ". ");
        }


        TextView txtViewCategory = helper.getView(R.id.txt_category);
        if (txtViewCategory != null) {
            txtViewCategory.setVisibility(mBuilder.isShowCategoryName ? View.VISIBLE : View.GONE);
            txtViewCategory.setText(item.getLevel1CategoryName());
        }


        TextView txtViewBrief = helper.getView(R.id.txt_brief);
        if (txtViewBrief != null) {
            txtViewBrief.setVisibility(mBuilder.isShowBrief ? View.VISIBLE : View.GONE);
            txtViewBrief.setText(item.getBriefShow());
        }

        TextView textViewSize = helper.getView(R.id.txt_apk_size);

        if(textViewSize !=null){
            textViewSize.setText((item.getApkSize() / 1014 / 1024) +"Mb");
        }



        helper.addOnClickListener(R.id.btn_download);

        View viewBtn  = helper.getView(R.id.btn_download);

        if (viewBtn instanceof  DownloadProgressButton){

            DownloadProgressButton btn = (DownloadProgressButton) viewBtn;
            mDownloadButtonConntroller.handClick(btn,item);
        }
    }

    public static class Builder {

        private boolean isShowPosition;
        private boolean isShowCategoryName;
        private boolean isShowBrief;

        private RxDownload rxDownload;
        private int layoutId = R.layout.template_appinfo;


        public Builder showPosition(boolean b) {

            this.isShowPosition = b;
            return this;
        }


        public Builder showCategoryName(boolean b) {

            this.isShowCategoryName = b;
            return this;
        }


        public Builder showBrief(boolean b) {

            this.isShowBrief = b;
            return this;
        }

        public Builder rxDownload(RxDownload rxDownload){
            this.rxDownload = rxDownload;
            return this;
        }

        public AppInfoAdapter build() {
            return new AppInfoAdapter(this);
        }

        public Builder layout(int resId) {
            this.layoutId = resId;
            return this;
        }


    }


}

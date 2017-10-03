package com.hya.appstore.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hya.appstore.R;
import com.hya.appstore.bean.AppInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class RecommentAdapter extends RecyclerView.Adapter<RecommentAdapter.ViewHolder> {


    private Context context;
    private List<AppInfo> mDatas;
    private LayoutInflater layoutInflater;

    public RecommentAdapter(Context context,List<AppInfo> mDatas) {
        this.mDatas = mDatas;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_recommend, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AppInfo appInfo = mDatas.get(position);

        String baseUrl = "http://file.market.xiaomi.com/mfc/thumbnail/png/w150q80/";
        Picasso.with(context).load(baseUrl + appInfo.getIcon()).into(holder.imgIcon);

        holder.textTitle.setText(appInfo.getDisplayName());
        holder.textSize.setText(appInfo.getApkSize() / 1024 / 1024 + " MB");
    }

    @Override
    public int getItemCount() {
        return mDatas==null?0:mDatas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_icon)
        ImageView imgIcon;
        @BindView(R.id.text_title)
        TextView textTitle;
        @BindView(R.id.text_size)
        TextView textSize;
        @BindView(R.id.btn_dl)
        Button btnDl;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

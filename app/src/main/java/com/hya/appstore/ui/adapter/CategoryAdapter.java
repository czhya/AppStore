package com.hya.appstore.ui.adapter;

import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hya.appstore.R;
import com.hya.appstore.bean.Category;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.imageloader.ImageLoader;

/**
 *
 * @author hya
 * @date 2017/10/27
 */

public class CategoryAdapter extends BaseQuickAdapter<Category,BaseViewHolder> {

    public CategoryAdapter() {
        super(R.layout.template_category);
    }

    @Override
    protected void convert(BaseViewHolder helper, Category item) {

        helper.setText(R.id.text_name,item.getName());
        ImageLoader.load(Constant.BASE_IMG_URL+item.getIcon(), (ImageView) helper.getView(R.id.img_icon));
    }
}

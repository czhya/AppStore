package com.hya.appstore.presenter.contract;

import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.Category;
import com.hya.appstore.ui.BaseView;

import java.util.List;

import rx.Observable;


/**
 *
 * @author hya
 * @date 2017/10/27
 */

public interface CategoryContract {
    public interface CategoryView extends BaseView{
        void showResult(List<Category> categories);
    }

    public interface ICategoryModel{

        Observable<BaseBean<List<Category>>> getCategory();

    }

}

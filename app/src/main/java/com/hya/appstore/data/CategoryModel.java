package com.hya.appstore.data;

import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.Category;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.CategoryContract;

import java.util.List;

import io.reactivex.Observable;


/**
 *
 * @author hya
 * @date 2017/10/27
 */

public class CategoryModel implements CategoryContract.ICategoryModel {

    private ApiService mApiService;

    public CategoryModel(ApiService mApiService) {
        this.mApiService = mApiService;
    }

    @Override
    public Observable<BaseBean<List<Category>>> getCategory() {
        return mApiService.category();
    }
}

package com.hya.appstore.di.module;

import com.hya.appstore.data.CategoryModel;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.CategoryContract;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author hya
 * @date 2017/10/27
 */

@Module
public class CategoryModule {

    private CategoryContract.CategoryView mView;

    public CategoryModule(CategoryContract.CategoryView view){


        this.mView = view;
    }

    @Provides
    public CategoryContract.CategoryView provideView(){
        return mView;
    }

    @Provides
    public CategoryContract.ICategoryModel privodeModel(ApiService apiService){
        return  new CategoryModel(apiService);
    }
}

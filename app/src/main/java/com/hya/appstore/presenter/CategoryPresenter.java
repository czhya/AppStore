package com.hya.appstore.presenter;

import com.hya.appstore.bean.Category;
import com.hya.appstore.common.rx.RxHttpResponseCompat;
import com.hya.appstore.common.rx.subscriber.ProgressSubcriber;
import com.hya.appstore.presenter.contract.CategoryContract;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by hya on 2017/10/27.
 */

public class CategoryPresenter extends BasePresenter<CategoryContract.ICategoryModel,CategoryContract.CategoryView> {


    @Inject
    public CategoryPresenter(CategoryContract.ICategoryModel mModel, CategoryContract.CategoryView mView) {
        super(mModel, mView);
    }

    public void getCategory(){

        mModel.getCategory().compose(RxHttpResponseCompat.<List<Category>>compatResult())
                .subscribe(new ProgressSubcriber<List<Category>>(mContext,mView) {

                    @Override
                    public void onNext(List<Category> categories) {
                        mView.showResult(categories);
                    }
                });
    }
}

package com.hya.appstore.di.module;

import android.app.ProgressDialog;

import com.hya.appstore.data.RecommendModel;
import com.hya.appstore.data.http.ApiService;
import com.hya.appstore.presenter.contract.RecommendContract;
import com.hya.appstore.ui.fragment.RecommendFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 洪裕安 on 2017/10/3.
 */
@Module
public class RecommendModule {

    private RecommendContract.View mView;

    public RecommendModule(RecommendContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public RecommendContract.View provideView(){
        return mView;
    }

    @Provides
    public RecommendModel provideModel(ApiService apiService){
        return new RecommendModel(apiService);
    }

    @Provides
    public ProgressDialog provideProgressDialog(RecommendContract.View view){
        return new ProgressDialog(((RecommendFragment)view).getActivity());
    }
}

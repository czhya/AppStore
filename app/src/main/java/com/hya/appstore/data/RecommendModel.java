package com.hya.appstore.data;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.data.http.ApiService;

import retrofit2.Callback;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class RecommendModel {
    private ApiService apiService;

    public RecommendModel(ApiService apiService) {
        this.apiService = apiService;
    }

    public void getApps(Callback<PageBean<AppInfo>> callback){
        apiService.getApps("{'page':0}").enqueue(callback);
    }
}

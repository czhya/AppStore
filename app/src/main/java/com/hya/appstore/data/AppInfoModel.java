package com.hya.appstore.data;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.data.http.ApiService;

import retrofit2.Callback;
import rx.Observable;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class AppInfoModel {
    private ApiService apiService;

    public AppInfoModel(ApiService apiService) {
        this.apiService = apiService;
    }

    public Observable<BaseEntry<PageBean<AppInfo>>> getApps() {
        return apiService.getApps("{'page':0}");
    }

    public Observable<BaseEntry<IndexBean>> index() {
        return apiService.index();
    }

    public Observable<BaseEntry<PageBean<AppInfo>>> topList(int page) {
        return apiService.topList(page);
    }

    public Observable<BaseEntry<PageBean<AppInfo>>> games(int page) {
        return apiService.game(page);
    }

}

package com.hya.appstore.data;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.data.http.ApiService;

import rx.Observable;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class AppInfoModel {

    private ApiService apiService;

    public AppInfoModel(ApiService apiService) {
        this.apiService = apiService;
    }


    public Observable<BaseBean<IndexBean>> index() {

        return apiService.index();
    }

    public Observable<BaseBean<PageBean<AppInfo>>> topList(int page) {

        return apiService.topList(page);
    }

    public Observable<BaseBean<PageBean<AppInfo>>> game(int page) {

        return apiService.game(page);
    }
    public Observable<BaseBean<PageBean<AppInfo>>> getFeaturedAppsByCategory(int categoryId, int page) {
        return apiService.getFeaturedAppsByCategory(categoryId,page);
    }

    public Observable<BaseBean<PageBean<AppInfo>>> getTopListAppsByCategory(int categoryId, int page) {
        return apiService.getTopListAppsByCategory(categoryId,page);
    }

    public Observable<BaseBean<PageBean<AppInfo>>> getNewListAppsByCategory(int categoryId, int page) {
        return apiService.getNewListAppsByCategory(categoryId,page);
    }

    public Observable<BaseBean<AppInfo>> getAppDetail( int id){

        return  apiService.getAppDetail(id);
    }
}

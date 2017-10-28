package com.hya.appstore.data.http;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.BaseBean;
import com.hya.appstore.bean.Category;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.bean.requestBean.LoginRequestBean;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author hya
 * @date 2017/10/24
 */

public interface ApiService {

    String BASE_URL = "http://112.124.22.238:8081/course_api/cniaoplay/";

    /**
     * 请求推荐数据
     *
     * @param params
     * @return Observable<BaseBean<PageBean<AppInfo>>>
     */
    @GET("featured2")
    Observable<BaseBean<PageBean<AppInfo>>> getApps(@Query("p") String params);


    /**
     * 请求首页数据
     *
     * @return Observable<BaseBean<IndexBean>>
     */
    @GET("index")
    Observable<BaseBean<IndexBean>> index();


    /**
     *
     *
     * @param page
     * @return Observable<BaseBean<AppInfo>>
     */
    @GET("toplist")
    Observable<BaseBean<PageBean<AppInfo>>> topList(@Query("page") int page);

    /**
     * @param page
     * @return Observable<BaseBean<PageBean<AppInfo>>>
     */
    @GET("game")
    Observable<BaseBean<PageBean<AppInfo>>> game(@Query("page") int page);

    /**
     * @return
     */
    @GET("category")
    Observable<BaseBean<List<Category>>> category();


    @POST("login")
    Observable<BaseBean<LoginBean>> login(@Body LoginRequestBean requestBean);

    /**
     * @param categoryid
     * @param page
     * @return
     */
    @GET("category/featured/{categoryid}")
    Observable<BaseBean<PageBean<AppInfo>>> getFeaturedAppsByCategory(@Path("categoryid") int categoryid, @Query("page") int page);

    /**
     * @param categoryid
     * @param page
     * @return
     */
    @GET("category/toplist/{categoryid}")
    Observable<BaseBean<PageBean<AppInfo>>> getTopListAppsByCategory(@Path("categoryid") int categoryid,@Query("page") int page);

    /**
     * @param categoryid
     * @param page
     * @return
     */
    @GET("category/newlist/{categoryid}")
    Observable<BaseBean<PageBean<AppInfo>>> getNewListAppsByCategory(@Path("categoryid") int categoryid,@Query("page") int page);

    /**
     * @param id
     * @return Observable<BaseBean<AppInfo>>
     */
    @GET("app/{id}")
    Observable<BaseBean<AppInfo>> getAppDetail(@Path("id") int id);
}

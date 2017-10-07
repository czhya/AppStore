package com.hya.appstore.data.http;

import com.hya.appstore.bean.AppInfo;
import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.bean.IndexBean;
import com.hya.appstore.bean.PageBean;
import com.hya.appstore.bean.request.LoginRequestBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 洪裕安 on 2017/10/2.
 */

public interface ApiService {
    public static final String BASE_URL = "http://112.124.22.238:8081/course_api/cniaoplay/";

    //    @GET("featured")
//    public Call<PageBean<AppInfo>> getApps(@Query("p") String jsonParam);
    @GET("featured2")
    public Observable<BaseEntry<PageBean<AppInfo>>> getApps(@Query("p") String jsonParam);



    @POST("login")
    public Observable<BaseEntry> login(@Body LoginRequestBean loginRequestBean);


    @GET("index")
    public Observable<BaseEntry<IndexBean>> index();

    @GET("toplist")
    public Observable<BaseEntry<AppInfo>> topList(@Query("page") int page); //


    //{"phone":"","password":""}
//    @POST("login")
//    public Observable<BaseEntry> login(@Body LoginRequestBean bean);

    @FormUrlEncoded // FormBody
    @POST("login")
    public void login2(@Field("phone") String phone);

}

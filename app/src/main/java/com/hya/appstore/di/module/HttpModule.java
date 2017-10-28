package com.hya.appstore.di.module;

import android.app.Application;

import com.google.gson.Gson;
import com.hya.appstore.BuildConfig;
import com.hya.appstore.common.http.CommonParamsInterceptor;
import com.hya.appstore.common.rx.RxErrorHandler;
import com.hya.appstore.data.http.ApiService;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author hya
 * @date 2017/10/24
 */
@Module
public class HttpModule {

    @Provides
    @Singleton
    public OkHttpClient getOkHttpClient(Application application, Gson gson) {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();


        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            builder.addInterceptor(interceptor);

        }


        return builder
                .addInterceptor(new CommonParamsInterceptor(gson,application))
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @Singleton
    public Retrofit getRetrofit(OkHttpClient okHttpClient) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(ApiService.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient);

        return builder.build();
    }


    @Singleton
    @Provides
    public ApiService providerApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Singleton
    @Provides
    public RxErrorHandler providerErrorHandler(Application application) {
        return new RxErrorHandler(application);
    }

}

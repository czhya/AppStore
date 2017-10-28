package com.hya.appstore.di.module;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author hya
 * @date 2017/10/24
 */
@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Singleton
    @Provides
    public Application providerApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    public Gson providerGson() {
        return new GsonBuilder()

                .setDateFormat("yyyy-MM-dd hh:mm:ss")
                .registerTypeAdapter(Double.class, new JsonSerializer<Double>() {
                    @Override
                    public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context) {
                        if (src == src.longValue()) {
                            return new JsonPrimitive(src.longValue());
                        }

                        return new JsonPrimitive(src);
                    }
                })
                .create();
    }


}

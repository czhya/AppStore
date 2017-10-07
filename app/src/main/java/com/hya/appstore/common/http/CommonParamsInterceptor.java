package com.hya.appstore.common.http;

import android.content.Context;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.util.DensityUtil;
import com.hya.appstore.common.util.DeviceUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 * Created by 洪裕安 on 2017/10/5.
 */

public class CommonParamsInterceptor implements Interceptor {

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public Context mContext;
    public Gson mGson;

    public CommonParamsInterceptor(Gson mGson, Context mContext) {
        this.mGson = mGson;
        this.mContext = mContext;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        try {
            String method = request.method();
            HashMap<String, Object> commonParamsMap = new HashMap<>();

            String imei = DeviceUtils.getIMEI(mContext);
            if (imei != null && imei.startsWith("000000")) {
                imei = "5284047f4ffb4e04824a2fd1d1f0cd62";
            }

            commonParamsMap.put(Constant.IMEI, imei);
            commonParamsMap.put(Constant.MODEL, DeviceUtils.getModel());
            commonParamsMap.put(Constant.LANGUAGE, DeviceUtils.getLanguage());
            commonParamsMap.put(Constant.os, DeviceUtils.getBuildVersionIncremental());
            commonParamsMap.put(Constant.RESOLUTION, DensityUtil.getScreenW(mContext) + "*" + DensityUtil.getScreenH(mContext));
            commonParamsMap.put(Constant.SDK, DeviceUtils.getBuildVersionSDK() + "");
            commonParamsMap.put(Constant.DENSITY_SCALE_FACTOR, mContext.getResources().getDisplayMetrics().density + "");


            if (method.equals("GET")) {
                HttpUrl httpUrl = request.url();

                HashMap<String, Object> rootMap = new HashMap<>();
                Set<String> params = httpUrl.queryParameterNames();
                for (String key : params) {

                    if (Constant.PARAM.equals(key)) {
                        String oldParamsJson = httpUrl.queryParameter(Constant.PARAM);
                        if (oldParamsJson != null) {
//                        rootMap = mGson.fromJson(oldParamsJson, HashMap.class);

                            HashMap<String, Object> p = mGson.fromJson(oldParamsJson, HashMap.class); // 原始参数

                            if (p != null) {
                                for (Map.Entry<String, Object> entry : p.entrySet()) {

                                    rootMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            rootMap.put(key, httpUrl.queryParameter(key));
                        }

                    }
                }

                rootMap.put("publicParams", commonParamsMap);
                String newJsonParams = mGson.toJson(rootMap);

                String url = httpUrl.toString();

                int index = url.indexOf("?");
                if (index > 0) {
                    url = url.substring(0, index);
                }
                url = url + "?" + Constant.PARAM + "=" + newJsonParams;

                request = request.newBuilder().url(url).build();

            } else if (method.equals("POST")) {
                RequestBody requestBody = request.body();

                HashMap<String, Object> rootMap = new HashMap<>();
                if (requestBody instanceof FormBody) {
                    for (int i = 0; i < ((FormBody) requestBody).size(); i++) {
                        rootMap.put(((FormBody) requestBody).encodedName(i), ((FormBody) requestBody).encodedValue(i));
                    }
                } else {
                    Buffer buffer = new Buffer();
                    requestBody.writeTo(buffer);

                    String oldJsonParams = buffer.readUtf8();

                    if (!TextUtils.isEmpty(oldJsonParams)) {

                        rootMap = mGson.fromJson(oldJsonParams, HashMap.class); // 原始参数
                        if (rootMap != null) {
                            rootMap.put("publicParams", commonParamsMap); // 重新组装
                            String newJsonParams = mGson.toJson(rootMap); // {"page":0,"publicParams":{"imei":'xxxxx',"sdk":14,.....}}

                            request = request.newBuilder().post(RequestBody.create(JSON, newJsonParams)).build();
                        }
                    }
                }


            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return chain.proceed(request);
    }
}

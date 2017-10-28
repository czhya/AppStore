package com.hya.appstore.common.util;

import android.Manifest;
import android.app.Activity;

import com.tbruyelle.rxpermissions.RxPermissions;

import rx.Observable;
import rx.Subscriber;

/**
 *
 * @author hya
 * @date 2017/10/26
 */


public class PermissionUtil {




    public static void readPhonestate(Activity activity){

        requestPermisson(activity,Manifest.permission.READ_PHONE_STATE).subscribe(new Subscriber<Boolean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Boolean aBoolean) {

            }
        });
    }


    public static Observable<Boolean> requestPermisson(Activity activity, String permission){


        RxPermissions rxPermissions = new RxPermissions(activity);


        return rxPermissions.request(permission);
    }

    public static Observable.Transformer<Object, Boolean> ensure(Activity activity, String permission){

        RxPermissions rxPermissions = new RxPermissions(activity);

        return  rxPermissions.ensure(permission);

    }



}


package com.hya.appstore.common.util;

import android.Manifest;
import android.app.Activity;

import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.Observable;

/**
 *
 * @author hya
 * @date 2017/10/26
 */


public class PermissionUtil {




    public static Observable<Boolean> requestPermisson(Activity activity, String permission){


        RxPermissions rxPermissions = new RxPermissions(activity);


        return rxPermissions.request(permission);
    }





}


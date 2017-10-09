package com.hya.appstore.common.exception;

import android.util.Log;

import static com.mikepenz.iconics.Iconics.TAG;

/**
 * Created by 洪裕安 on 2017/10/4.
 */

public class ApiException extends BaseException {
    public ApiException(int code, String msg) {
        super(code, msg);
        Log.e(TAG, "ApiException: "+code+"  "+msg );
    }
}

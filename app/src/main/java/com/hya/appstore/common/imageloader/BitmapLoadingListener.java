package com.hya.appstore.common.imageloader;

import android.graphics.Bitmap;

/**
 * Created by 洪裕安 on 2017/10/6.
 */

public interface BitmapLoadingListener {

    void onSuccess(Bitmap b);

    void onError();
}

package com.hya.appstore.common;

import android.app.Application;
import android.os.Environment;

import com.hya.appstore.common.util.ACache;

import java.io.File;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import zlc.season.rxdownload2.RxDownload;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

/**
 *
 * @author hya
 * @date 2017/10/29
 */
@Module
public class DownloadModule {

    @Singleton
    @Provides
    public RxDownload providerRxDownload(Application application, Retrofit retrofit,File downDir){


        ACache.get(application).put(Constant.APK_DOWNLOAD_DIR,downDir.getPath());

        return RxDownload.getInstance(application)
                .defaultSavePath(downDir.getPath())
                .retrofit(retrofit)
                .maxDownloadNumber(10)
                .maxThread(10);
    }


    @Singleton
    @Provides
    File providerDownloadDir(){

        return Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS);

    }

}

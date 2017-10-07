package com.hya.appstore.ui.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.widget.Button;
import android.widget.Toast;

import com.hya.appstore.R;
import com.hya.appstore.common.util.DeviceUtils;
import com.hya.appstore.di.component.AppComponent;
import com.tbruyelle.rxpermissions.RxPermissions;

import butterknife.BindView;
import butterknife.OnClick;
import rx.functions.Action1;


public class LoginActivity extends BaseActivity {


    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void init() {

    }

    @Override
    public void setupAcitivtyComponent(AppComponent appComponent) {

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        RxPermissions rxPermissions = new RxPermissions(this);

        rxPermissions.request(Manifest.permission.READ_PHONE_STATE)
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean aBoolean) {

                    }
                });



//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)!= PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_PHONE_STATE},1);
//        }else {
//            String imei  =DeviceUtils.getIMEI(this);
//        }
    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        if (requestCode == 1){
//            if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
//                String imei  = DeviceUtils.getIMEI(this);
//            }else {
//                Toast.makeText(LoginActivity.this,"用户拒绝授权", Toast.LENGTH_LONG).show();
//            }
//        }
//    }
}

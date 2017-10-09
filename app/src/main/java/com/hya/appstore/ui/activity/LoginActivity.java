package com.hya.appstore.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hya.appstore.R;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerLoginComponent;
import com.hya.appstore.di.module.LoginModule;
import com.hya.appstore.presenter.LoginPresenter;
import com.hya.appstore.presenter.contract.LoginContract;
import com.hya.appstore.ui.wight.LoadingButton;
import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func2;


public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.ILoginView {


    @BindView(R.id.tool_bar)
    Toolbar toolBar;
    @BindView(R.id.txt_mobi)
    EditText txtMobi;
    @BindView(R.id.view_mobi_wrapper)
    TextInputLayout viewMobiWrapper;
    @BindView(R.id.txt_password)
    EditText txtPassword;
    @BindView(R.id.view_password_wrapper)
    TextInputLayout viewPasswordWrapper;
    @BindView(R.id.btn_login)
    LoadingButton btnLogin;
    @BindView(R.id.activity_login)
    LinearLayout activityLogin;
    @BindView(R.id.checkbox)
    CheckBox checkbox;

    ACache aCache ;

    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void init() {

        aCache = ACache.get(this);

        if (aCache.getAsObject("checkBox")!=null) {
            String user = aCache.getAsString("Login_userName");
            String pwd = aCache.getAsString("Login_password");
            txtMobi.setText(user);
            txtPassword.setText(pwd);
            checkbox.setChecked(true);
        }

        initView();
    }

    private void initView() {
        //RxBinding2中没有了这种转化方式
        Observable<CharSequence> onMobi = RxTextView.textChanges(txtMobi);
        Observable<CharSequence> onPassword = RxTextView.textChanges(txtPassword);


        Observable.combineLatest(onMobi, onPassword, new Func2<CharSequence, CharSequence, Boolean>() {
            @Override
            public Boolean call(CharSequence onMobi, CharSequence onPassword) {
                if (onMobi.length() == 11 && onPassword.length() >= 8) {

                    return true;
                } else {
                    return false;
                }
            }
        }).subscribe(new Action1<Boolean>() {
            @Override
            public void call(Boolean aBoolean) {
                RxView.enabled(btnLogin).call(aBoolean);
            }
        });
        RxView.clicks(btnLogin).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {


                if (checkbox.isChecked()) {
                    aCache.put("Login_userName", txtMobi.getText().toString());
                    aCache.put("Login_password", txtPassword.getText().toString());
                    aCache.put("checkBox", true);
                    System.out.println("save success");
                } else {
                    if (aCache.getAsObject("checkBox")!=null){
                        aCache.remove("Login_userName");
                        aCache.remove("Login_password");
                        aCache.remove("checkBox");
                    }

                }
                mPresenter.login(txtMobi.getText().toString().trim(), txtPassword.getText().toString().trim());
            }
        });
    }

    @Override
    public void setupAcitivtyComponent(AppComponent appComponent) {

        DaggerLoginComponent.builder().appComponent(appComponent).loginModule(new LoginModule(this)).build().inject(this);
    }

    @Override
    public void checkPhoneError() {
        viewMobiWrapper.setError("手机号输入有误");

    }

    @Override
    public void checkPhoneSuccess() {
        viewMobiWrapper.setError("");
        viewMobiWrapper.setCounterEnabled(false);
    }

    @Override
    public void checkPasswordError() {

    }

    @Override
    public void loginSuccess(LoginBean bean) {
        this.finish();
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showError(String msg) {

    }

}

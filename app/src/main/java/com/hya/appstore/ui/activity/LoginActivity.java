package com.hya.appstore.ui.activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.hya.appstore.R;
import com.hya.appstore.bean.LoginBean;
import com.hya.appstore.common.util.ACache;
import com.hya.appstore.di.component.AppComponent;
import com.hya.appstore.di.component.DaggerLoginComponent;
import com.hya.appstore.di.module.LoginModule;
import com.hya.appstore.presenter.LoginPresenter;
import com.hya.appstore.presenter.contract.LoginContract;
import com.hya.appstore.ui.widget.LoadingButton;
import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.ionicons_typeface_library.Ionicons;

import butterknife.BindView;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func2;

/**
 * @author hya
 */
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.ILoginView {

    @BindView(R.id.tool_Bar)
    Toolbar mToolBar;
    @BindView(R.id.text_mobi)
    EditText mTextMobi;
    @BindView(R.id.text_password)
    EditText mTextPassword;
    @BindView(R.id.checkbox)
    CheckBox checkbox;
    @BindView(R.id.btn_login)
    LoadingButton btnLogin;

    ACache aCache;
    @BindView(R.id.view_mobi_wrapper)
    TextInputLayout viewMobiWrapper;
    @BindView(R.id.view_password_wrapper)
    TextInputLayout viewPasswordWrapper;


    @Override
    public void init() {
        aCache = ACache.get(this);

        /**
         * 从缓存中获取登录密码和账号
         */
        if (aCache.getAsObject("checkBox") != null) {
            String user = aCache.getAsString("Login_userName");
            String pwd = aCache.getAsString("Login_password");
            mTextMobi.setText(user);
            mTextPassword.setText(pwd);
            checkbox.setChecked(true);
        }

        initView();
    }

    private void initView() {

        mToolBar.setNavigationIcon(
                new IconicsDrawable(this)
                        .icon(Ionicons.Icon.ion_ios_arrow_back)
                        .sizeDp(16)
                        .color(getResources().getColor(R.color.md_white_1000)
                        )
        );

        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //RxBinding2中没有了这种转化方式
        Observable<CharSequence> onMobi = RxTextView.textChanges(mTextMobi);
        Observable<CharSequence> onPassword = RxTextView.textChanges(mTextPassword);


        Observable.combineLatest(onMobi, onPassword, new Func2<CharSequence, CharSequence, Boolean>() {
            @Override
            public Boolean call(CharSequence onMobi, CharSequence onPassword) {
                if (onMobi.length() == 11 && onPassword.length() >= 6) {
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


                /**
                 * remenber passowrd
                 */
                if (checkbox.isChecked()) {
                    aCache.put("Login_userName", mTextMobi.getText().toString());
                    aCache.put("Login_password", mTextPassword.getText().toString());
                    aCache.put("checkBox", true);
                } else {
                    if (aCache.getAsObject("checkBox") != null) {
                        aCache.remove("Login_userName");
                        aCache.remove("Login_password");
                        aCache.remove("checkBox");
                    }

                }
                /**
                 * login
                 */
                mPresenter.login(mTextMobi.getText().toString().trim(), mTextPassword.getText().toString().trim());
            }
        });
    }

    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void setupActivityComponent(AppComponent component) {

        DaggerLoginComponent.builder().appComponent(component)
                .loginModule(new LoginModule(this)).build().inject(this);
    }


    @Override
    public void showLoading() {
        btnLogin.showLoading();
    }

    @Override
    public void showError(String message) {
        btnLogin.showButtonText();
    }

    @Override
    public void dismissLoading() {
        btnLogin.showButtonText();
    }

    @Override
    public void checkPhoneError() {
        mTextMobi.setError("手机格式错误");
    }

    @Override
    public void checkPhoneSuccess() {
        viewMobiWrapper.setError("");
        viewMobiWrapper.setErrorEnabled(false);
    }


    @Override
    public void loginSuccess(LoginBean bean) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        this.finish();
    }

}

package com.hya.appstore.ui;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public interface BaseView {
    void showLoading();
    void showError(String message);
    void dismissLoading();

}

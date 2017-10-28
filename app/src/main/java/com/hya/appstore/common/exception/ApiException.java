package com.hya.appstore.common.exception;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class ApiException extends BaseException {

    public ApiException(int code, String displayMessage) {
        super(code, displayMessage);
    }
}

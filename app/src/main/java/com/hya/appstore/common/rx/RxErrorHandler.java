package com.hya.appstore.common.rx;

import android.content.Context;
import android.widget.Toast;

import com.hya.appstore.common.exception.ApiException;
import com.hya.appstore.common.exception.BaseException;
import com.hya.appstore.common.exception.ErrorMessageFactory;

import java.net.SocketException;
import java.net.SocketTimeoutException;

import retrofit2.HttpException;


/**
 * Created by hya on 2017/10/24.
 */

public class RxErrorHandler {



    private Context mContext;

    public RxErrorHandler(Context mContext) {
        this.mContext = mContext;
    }

    public BaseException handlerError(Throwable e){
        BaseException exception = new BaseException();

        if (e instanceof ApiException) {
            exception.setCode(((ApiException) e).getCode());

        } else if (e instanceof SocketException) {
            exception.setCode(BaseException.SOCKET_ERROR);
        } else if (e instanceof SocketTimeoutException){
            exception.setCode(BaseException.SOCKET_TIMEOUT_ERROR);
        }else if (e instanceof HttpException){
            exception.setCode(BaseException.HTTP_ERROR);
        } else {
            exception.setCode(BaseException.UNKNOWN_ERROR);
        }

        exception.setDisplayMessage(ErrorMessageFactory.create(mContext,exception.getCode()));

        return exception;
    }

    public void showErrorMessage(BaseException e){
        Toast.makeText(mContext, e.getDisplayMessage(), Toast.LENGTH_LONG).show();
    }



}

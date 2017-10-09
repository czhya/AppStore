package com.hya.appstore.bean;

import java.io.Serializable;

/**
 * Created by 洪裕安 on 2017/10/4.
 */

public class BaseEntry<T> extends BaseBean {
    private int status;
    private String message;
    private T data;

    public boolean isSuccess(){
        return (status==1);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

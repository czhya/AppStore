package com.hya.appstore.bean;

import java.io.Serializable;

/**
 * Created by hya on 2017/10/24.
 */

public class BaseBean<T> extends BaseEntity {

    private int status;
    private String message;
    private T data;

    public boolean success(){
        return status==1;
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

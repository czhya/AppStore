package com.hya.appstore.common.rx;

import com.hya.appstore.bean.BaseEntry;
import com.hya.appstore.common.exception.ApiException;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by 洪裕安 on 2017/10/4.
 */

public class RxHttpResponseCompat {

    public static <T> Observable.Transformer<BaseEntry<T>, T> compatResult() {

        return new Observable.Transformer<BaseEntry<T>, T>() {
            @Override
            public Observable<T> call(Observable<BaseEntry<T>> baseBeanObservable) {



                return baseBeanObservable.flatMap(new Func1<BaseEntry<T>, Observable<T>>() {
                    @Override
                    public Observable<T> call(final BaseEntry<T> tBaseBean) {

                        if(tBaseBean.isSuccess()){


                            return Observable.create(new Observable.OnSubscribe<T>() {
                                @Override
                                public void call(Subscriber<? super T> subscriber) {

                                    try {
                                        subscriber.onNext(tBaseBean.getData());
                                        subscriber.onCompleted();
                                    }
                                    catch (Exception e){
                                        subscriber.onError(e);
                                    }


                                }
                            });


                        }
                        else {
                            return  Observable.error(new ApiException(tBaseBean.getStatus(),tBaseBean.getMessage()));
                        }

                    }
                }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());

            }
        };
    }
}

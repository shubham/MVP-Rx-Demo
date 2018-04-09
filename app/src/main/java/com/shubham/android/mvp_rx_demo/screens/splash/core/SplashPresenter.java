package com.shubham.android.mvp_rx_demo.screens.splash.core;

import android.util.Log;

import com.shubham.android.mvp_rx_demo.utils.UiUtils;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;


public class SplashPresenter {

    private SplashModel model;
    private RxSchedulers rxSchedulers;
    private CompositeSubscription subscription;

    public SplashPresenter(SplashModel splashModel, RxSchedulers schedulers, CompositeSubscription compositeSubscription) {
        this.model = splashModel;
        this.rxSchedulers = schedulers;
        this.subscription = compositeSubscription;
    }


    public void onCreate() {
        subscription.add(getHeroesList());
    }

    public void onDestroy() {
        subscription.clear();
    }

    private Subscription getHeroesList() {
        return model.isNetworkAvailable().doOnNext(networkAvailable -> {
            if (!networkAvailable) {
                Log.d("no Connection", "No Internet Connection");
            }
        }).filter(isNetworkAvailable -> true).
                flatMap(isAvailable -> model.isNetworkAvailable()).
                subscribeOn(rxSchedulers.internet()).
                observeOn(rxSchedulers.androidThread()).
                subscribe(aBoolean -> model.gotoHeroesListActivity(), throwable -> UiUtils.handleThrowable(throwable));
    }
}

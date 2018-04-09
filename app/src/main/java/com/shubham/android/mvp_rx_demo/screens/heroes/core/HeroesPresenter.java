package com.shubham.android.mvp_rx_demo.screens.heroes.core;

import android.util.Log;

import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.utils.UiUtils;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;

import java.util.ArrayList;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class HeroesPresenter {


    HeroesView view;
    HeroesModel model;
    RxSchedulers rxSchedulers;
    CompositeSubscription subscriptions;
    ArrayList<Hero> heroArrayList = new ArrayList<>();

    public HeroesPresenter(HeroesView view, HeroesModel model, RxSchedulers rxSchedulers, CompositeSubscription subscriptions) {
        this.view = view;
        this.model = model;
        this.rxSchedulers = rxSchedulers;
        this.subscriptions = subscriptions;
    }

    public void onCreate() {
        Log.d("Enter to Presenter", "onCreate: ");

        subscriptions.add(getHeroesList());
        subscriptions.add(respondToClick());

    }

    public void onDestroy() {
        subscriptions.clear();
    }

    private Subscription respondToClick() {
        return view.itemClicks().subscribe(integer -> model.gotoHeroDetailsActivity(heroArrayList.get(integer)));
    }

    private Subscription getHeroesList() {
        return model.isNetworkAvailable().doOnNext(networkAvailable -> {
            if (!networkAvailable) {
                Log.d("No Internet Connection", " No Connection");
            }
        }).filter(isNetworkAvailable -> true)
                .flatMap(isAvailable -> model.provideListHeroes())
                .subscribeOn(rxSchedulers.internet()).
                        observeOn(rxSchedulers.androidThread())
                .subscribe(heroes -> {
                    Log.d("Ok Loaded", "getHeroesList testing");
                    view.swapAdapter((ArrayList<Hero>) heroes.getElements());
                    heroArrayList = (ArrayList<Hero>) heroes.getElements();
                }, throwable -> {
                    UiUtils.handleThrowable(throwable);
                });
    }
}

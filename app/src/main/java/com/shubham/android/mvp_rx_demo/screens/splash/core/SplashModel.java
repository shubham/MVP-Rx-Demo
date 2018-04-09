package com.shubham.android.mvp_rx_demo.screens.splash.core;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.models.Heroes;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;
import com.shubham.android.mvp_rx_demo.utils.NetworkUtils;

import rx.Observable;

public class SplashModel {

    private HeroesApiInterface apiInterface;
    private SplashScreenActivity screenActivity;

    public SplashModel(HeroesApiInterface heroesApiInterface, SplashScreenActivity activity) {
        this.apiInterface = heroesApiInterface;
        this.screenActivity = activity;
    }

    Observable<Heroes> provideListHeroes() {
        return apiInterface.getHeros();
    }

    Observable<Boolean> isNetworkAvailable() {
        return NetworkUtils.isNetworkAvailableObservable(screenActivity);
    }

    public void gotoHeroesListActivity() {
        screenActivity.showHeroesListActivity();
    }
}

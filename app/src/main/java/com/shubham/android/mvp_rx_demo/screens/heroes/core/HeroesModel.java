package com.shubham.android.mvp_rx_demo.screens.heroes.core;


import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.models.Heroes;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;
import com.shubham.android.mvp_rx_demo.utils.NetworkUtils;

import rx.Observable;

public class HeroesModel {

    HeroesListActivity activity;
    HeroesApiInterface apiInterface;

    public HeroesModel(HeroesListActivity listActivity, HeroesApiInterface heroesApiInterface) {
        this.activity = listActivity;
        this.apiInterface = heroesApiInterface;
    }

    Observable<Heroes> provideListHeroes() {
        return apiInterface.getHeros();
    }

    Observable<Boolean> isNetworkAvailable()
    {
        return NetworkUtils.isNetworkAvailableObservable(activity);
    }

    public void gotoHeroDetailsActivity(Hero hero)
    {
        activity.gotoHeroDetailsActivity(hero);
    }
}

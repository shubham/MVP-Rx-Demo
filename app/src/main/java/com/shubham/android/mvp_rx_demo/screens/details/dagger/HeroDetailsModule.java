package com.shubham.android.mvp_rx_demo.screens.details.dagger;

import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.screens.details.HeroDetailsActivity;
import com.shubham.android.mvp_rx_demo.screens.details.core.HeroDetailsView;

import dagger.Module;
import dagger.Provides;

@Module
public class HeroDetailsModule {

    HeroDetailsActivity activity;
    Hero hero;

    public HeroDetailsModule(HeroDetailsActivity activity, Hero hero) {
        this.activity = activity;
        this.hero = hero;
    }

    @Provides
    HeroDetailsView provideView() {
        return new HeroDetailsView(activity, hero);
    }
}

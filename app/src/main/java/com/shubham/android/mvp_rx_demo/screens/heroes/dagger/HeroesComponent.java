package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.application.builder.AppComponent;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;

import dagger.Component;

@HeroesScope
@Component(dependencies = {AppComponent.class}, modules = {HeroesModule.class})
public interface HeroesComponent {

    void inject(HeroesListActivity heroesListActivity);
}

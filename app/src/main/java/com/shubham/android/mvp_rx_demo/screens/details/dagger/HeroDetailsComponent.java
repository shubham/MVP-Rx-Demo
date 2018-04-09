package com.shubham.android.mvp_rx_demo.screens.details.dagger;

import com.shubham.android.mvp_rx_demo.screens.details.HeroDetailsActivity;

import dagger.Component;

@Component(modules = {HeroDetailsModule.class})
public interface HeroDetailsComponent {
    void inject(HeroDetailsActivity activity);
}

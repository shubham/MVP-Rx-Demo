package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class SplashContextModule {
    SplashScreenActivity activity;

    public SplashContextModule(SplashScreenActivity splashScreenActivity) {
        this.activity = splashScreenActivity;
    }

    @SplashScope
    @Provides
    SplashScreenActivity providesSplashContext() {
        return activity;
    }
}

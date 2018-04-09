package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.application.builder.AppComponent;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;

import dagger.Component;


@SplashScope
@Component(modules = {SplashContextModule.class, SplashModule.class}, dependencies = {AppComponent.class})
public interface SplashComponent {
    void inject(SplashScreenActivity activity);
}

package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashModel;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashPresenter;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashView;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;

@Module
public class SplashModule {

    @SplashScope
    @Provides
    SplashPresenter providePresneter(RxSchedulers schedulers, SplashModel model) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        return new SplashPresenter(model, schedulers, compositeSubscription);
    }

    @SplashScope
    @Provides
    SplashView providesSplashView(SplashScreenActivity activity) {
        return new SplashView(activity);
    }

    @SplashScope
    @Provides
    SplashModel providesSplashModel(HeroesApiInterface apiInterface, SplashScreenActivity activity) {
        return new SplashModel(apiInterface, activity);
    }
}

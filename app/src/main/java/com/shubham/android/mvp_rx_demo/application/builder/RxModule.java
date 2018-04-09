package com.shubham.android.mvp_rx_demo.application.builder;

import com.shubham.android.mvp_rx_demo.utils.rx.ApplicationRxSchedulers;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;

import dagger.Module;
import dagger.Provides;

@Module
public class RxModule {

    @Provides
    RxSchedulers provideRxSchedulers() {
        return new ApplicationRxSchedulers();
    }
}

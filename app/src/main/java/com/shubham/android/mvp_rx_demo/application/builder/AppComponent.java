package com.shubham.android.mvp_rx_demo.application.builder;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;

import dagger.Component;

@AppScope
@Component(modules = {NetworkModule.class,AppContextModule.class,RxModule.class,HeroesApiServiceModule.class})
public interface AppComponent {

    RxSchedulers rxSchedulers();
    HeroesApiInterface apiService();
}

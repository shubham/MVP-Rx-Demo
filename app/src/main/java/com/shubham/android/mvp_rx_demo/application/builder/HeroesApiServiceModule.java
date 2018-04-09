package com.shubham.android.mvp_rx_demo.application.builder;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class HeroesApiServiceModule {
    private static final String BASE_URL = "http://coemygroup.fr/";

    @AppScope
    @Provides
    HeroesApiInterface provideApiService(OkHttpClient httpClient, GsonConverterFactory gsonConverterFactory,
                                         RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {
        Retrofit retrofit = new Retrofit.Builder().client(httpClient)
                .baseUrl(BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(rxJavaCallAdapterFactory)
                .build();

        return retrofit.create(HeroesApiInterface.class);
    }
}

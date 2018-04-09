package com.shubham.android.mvp_rx_demo.application.builder;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AppContextModule {

    private final Context context;

    public AppContextModule(Context context) {
        this.context = context;
    }

    @AppScope
    @Provides
    Context providesAppContext() {
        return context;
    }
}

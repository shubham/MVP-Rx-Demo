package com.shubham.android.mvp_rx_demo.application;


import android.app.Application;

import com.shubham.android.mvp_rx_demo.BuildConfig;
import com.shubham.android.mvp_rx_demo.application.builder.AppComponent;
import com.shubham.android.mvp_rx_demo.application.builder.AppContextModule;
import com.shubham.android.mvp_rx_demo.application.builder.DaggerAppComponent;
import com.squareup.leakcanary.LeakCanary;

import timber.log.Timber;

public class AppController extends Application {

    private static AppComponent appComponent;

    public static AppComponent getNetComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initialiseLogger();
        initComponent();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);


    }

    private void initialiseLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new Timber.Tree() {
                @Override
                protected void log(int priority, String tag, String message, Throwable t) {
                    log(priority, tag, message, t);
                }
            });
        }
    }

    private void initComponent() {
        appComponent = DaggerAppComponent.builder().appContextModule(new AppContextModule(this)).build();
    }
}

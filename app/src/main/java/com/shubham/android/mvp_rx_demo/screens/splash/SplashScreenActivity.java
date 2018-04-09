package com.shubham.android.mvp_rx_demo.screens.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.shubham.android.mvp_rx_demo.application.AppController;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashPresenter;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashView;
import com.shubham.android.mvp_rx_demo.screens.splash.dagger.DaggerSplashComponent;
import com.shubham.android.mvp_rx_demo.screens.splash.dagger.SplashContextModule;

import javax.inject.Inject;

public class SplashScreenActivity extends AppCompatActivity {

    @Inject
    SplashView view;
    @Inject
    SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerSplashComponent.builder().appComponent(AppController.getNetComponent())
                .splashContextModule(new SplashContextModule(this))
                .build().inject(this);

        setContentView(view.constructView());
        splashPresenter.onCreate();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashPresenter.onDestroy();
    }

    public void showHeroesListActivity() {
        Log.d("Loaded", "Ok Showed");
        Intent intent = new Intent(this, HeroesListActivity.class);
        startActivity(intent);
    }
}

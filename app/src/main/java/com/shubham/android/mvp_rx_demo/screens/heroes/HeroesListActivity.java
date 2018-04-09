package com.shubham.android.mvp_rx_demo.screens.heroes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shubham.android.mvp_rx_demo.application.AppController;
import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.screens.details.HeroDetailsActivity;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesPresenter;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesView;
import com.shubham.android.mvp_rx_demo.screens.heroes.dagger.DaggerHeroesComponent;
import com.shubham.android.mvp_rx_demo.screens.heroes.dagger.HeroesModule;

import java.io.Serializable;

import javax.inject.Inject;

public class HeroesListActivity extends AppCompatActivity {

    @Inject
    HeroesView view;

    @Inject
    HeroesPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerHeroesComponent.builder()
                .appComponent(AppController.getNetComponent())
                .heroesModule(new HeroesModule(this))
                .build().inject(this);

        setContentView(view.view());
        presenter.onCreate();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void gotoHeroDetailsActivity(Hero hero) {
        Intent intent = new Intent(this, HeroDetailsActivity.class);
        intent.putExtra("hero", (Serializable) hero);
        startActivity(intent);

    }
}

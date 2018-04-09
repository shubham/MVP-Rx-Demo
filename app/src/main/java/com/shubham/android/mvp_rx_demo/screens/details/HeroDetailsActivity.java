package com.shubham.android.mvp_rx_demo.screens.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.screens.details.core.HeroDetailsView;
import com.shubham.android.mvp_rx_demo.screens.details.dagger.DaggerHeroDetailsComponent;
import com.shubham.android.mvp_rx_demo.screens.details.dagger.HeroDetailsModule;

import javax.inject.Inject;

public class HeroDetailsActivity extends AppCompatActivity {

    @Inject
    HeroDetailsView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Hero hero = (Hero) getIntent().getExtras().get("hero");

        DaggerHeroDetailsComponent.builder()
                .heroDetailsModule(new HeroDetailsModule(this, hero))
                .build().inject(this);

        setContentView(view.view());
    }
}

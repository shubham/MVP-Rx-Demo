package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesModel;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesPresenter;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesView;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;

@Module
public class HeroesModule {
    HeroesListActivity heroesListActivity;

    public HeroesModule(HeroesListActivity heroesListActivity) {
        this.heroesListActivity = heroesListActivity;
    }

    @HeroesScope
    @Provides
    HeroesView provideView() {
        return new HeroesView(heroesListActivity);
    }

    @HeroesScope
    @Provides
    HeroesPresenter providePresenter(RxSchedulers schedulers, HeroesView view, HeroesModel model) {
        CompositeSubscription subscriptions = new CompositeSubscription();
        return new HeroesPresenter(view, model, schedulers, subscriptions);
    }

    @HeroesScope
    @Provides
    HeroesListActivity provideContext() {
        return heroesListActivity;
    }

    @HeroesScope
    @Provides
    HeroesModel provideModel(HeroesApiInterface apiInterface) {
        return new HeroesModel(heroesListActivity, apiInterface);
    }
}

package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.application.builder.AppComponent;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity_MembersInjector;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesModel;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesPresenter;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesView;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerHeroesComponent implements HeroesComponent {
  private Provider<HeroesView> provideViewProvider;

  private Provider<RxSchedulers> rxSchedulersProvider;

  private Provider<HeroesApiInterface> apiServiceProvider;

  private Provider<HeroesModel> provideModelProvider;

  private Provider<HeroesPresenter> providePresenterProvider;

  private DaggerHeroesComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideViewProvider =
        DoubleCheck.provider(HeroesModule_ProvideViewFactory.create(builder.heroesModule));
    this.rxSchedulersProvider =
        new com_shubham_android_mvp_rx_demo_application_builder_AppComponent_rxSchedulers(
            builder.appComponent);
    this.apiServiceProvider =
        new com_shubham_android_mvp_rx_demo_application_builder_AppComponent_apiService(
            builder.appComponent);
    this.provideModelProvider =
        DoubleCheck.provider(
            HeroesModule_ProvideModelFactory.create(builder.heroesModule, apiServiceProvider));
    this.providePresenterProvider =
        DoubleCheck.provider(
            HeroesModule_ProvidePresenterFactory.create(
                builder.heroesModule,
                rxSchedulersProvider,
                provideViewProvider,
                provideModelProvider));
  }

  @Override
  public void inject(HeroesListActivity heroesListActivity) {
    injectHeroesListActivity(heroesListActivity);
  }

  private HeroesListActivity injectHeroesListActivity(HeroesListActivity instance) {
    HeroesListActivity_MembersInjector.injectView(instance, provideViewProvider.get());
    HeroesListActivity_MembersInjector.injectPresenter(instance, providePresenterProvider.get());
    return instance;
  }

  public static final class Builder {
    private HeroesModule heroesModule;

    private AppComponent appComponent;

    private Builder() {}

    public HeroesComponent build() {
      if (heroesModule == null) {
        throw new IllegalStateException(HeroesModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerHeroesComponent(this);
    }

    public Builder heroesModule(HeroesModule heroesModule) {
      this.heroesModule = Preconditions.checkNotNull(heroesModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_shubham_android_mvp_rx_demo_application_builder_AppComponent_rxSchedulers
      implements Provider<RxSchedulers> {
    private final AppComponent appComponent;

    com_shubham_android_mvp_rx_demo_application_builder_AppComponent_rxSchedulers(
        AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public RxSchedulers get() {
      return Preconditions.checkNotNull(
          appComponent.rxSchedulers(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_shubham_android_mvp_rx_demo_application_builder_AppComponent_apiService
      implements Provider<HeroesApiInterface> {
    private final AppComponent appComponent;

    com_shubham_android_mvp_rx_demo_application_builder_AppComponent_apiService(
        AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public HeroesApiInterface get() {
      return Preconditions.checkNotNull(
          appComponent.apiService(), "Cannot return null from a non-@Nullable component method");
    }
  }
}

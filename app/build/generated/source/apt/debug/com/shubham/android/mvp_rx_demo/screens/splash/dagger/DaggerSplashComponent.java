package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.application.builder.AppComponent;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity_MembersInjector;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashModel;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashPresenter;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashView;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerSplashComponent implements SplashComponent {
  private Provider<SplashScreenActivity> providesSplashContextProvider;

  private Provider<SplashView> providesSplashViewProvider;

  private Provider<RxSchedulers> rxSchedulersProvider;

  private Provider<HeroesApiInterface> apiServiceProvider;

  private Provider<SplashModel> providesSplashModelProvider;

  private Provider<SplashPresenter> providePresneterProvider;

  private DaggerSplashComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.providesSplashContextProvider =
        DoubleCheck.provider(
            SplashContextModule_ProvidesSplashContextFactory.create(builder.splashContextModule));
    this.providesSplashViewProvider =
        DoubleCheck.provider(
            SplashModule_ProvidesSplashViewFactory.create(
                builder.splashModule, providesSplashContextProvider));
    this.rxSchedulersProvider =
        new com_shubham_android_mvp_rx_demo_application_builder_AppComponent_rxSchedulers(
            builder.appComponent);
    this.apiServiceProvider =
        new com_shubham_android_mvp_rx_demo_application_builder_AppComponent_apiService(
            builder.appComponent);
    this.providesSplashModelProvider =
        DoubleCheck.provider(
            SplashModule_ProvidesSplashModelFactory.create(
                builder.splashModule, apiServiceProvider, providesSplashContextProvider));
    this.providePresneterProvider =
        DoubleCheck.provider(
            SplashModule_ProvidePresneterFactory.create(
                builder.splashModule, rxSchedulersProvider, providesSplashModelProvider));
  }

  @Override
  public void inject(SplashScreenActivity activity) {
    injectSplashScreenActivity(activity);
  }

  private SplashScreenActivity injectSplashScreenActivity(SplashScreenActivity instance) {
    SplashScreenActivity_MembersInjector.injectView(instance, providesSplashViewProvider.get());
    SplashScreenActivity_MembersInjector.injectSplashPresenter(
        instance, providePresneterProvider.get());
    return instance;
  }

  public static final class Builder {
    private SplashContextModule splashContextModule;

    private SplashModule splashModule;

    private AppComponent appComponent;

    private Builder() {}

    public SplashComponent build() {
      if (splashContextModule == null) {
        throw new IllegalStateException(
            SplashContextModule.class.getCanonicalName() + " must be set");
      }
      if (splashModule == null) {
        this.splashModule = new SplashModule();
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerSplashComponent(this);
    }

    public Builder splashContextModule(SplashContextModule splashContextModule) {
      this.splashContextModule = Preconditions.checkNotNull(splashContextModule);
      return this;
    }

    public Builder splashModule(SplashModule splashModule) {
      this.splashModule = Preconditions.checkNotNull(splashModule);
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

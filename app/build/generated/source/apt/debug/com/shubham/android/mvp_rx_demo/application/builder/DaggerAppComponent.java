package com.shubham.android.mvp_rx_demo.application.builder;

import android.content.Context;
import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.io.File;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private RxModule rxModule;

  private Provider<HttpLoggingInterceptor> provideInterceptorProvider;

  private Provider<Context> providesAppContextProvider;

  private Provider<File> provideCacheFileProvider;

  private Provider<Cache> provideCacheProvider;

  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<GsonConverterFactory> provideGsonClientProvider;

  private Provider<RxJavaCallAdapterFactory> provideRxAdapterProvider;

  private Provider<HeroesApiInterface> provideApiServiceProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.rxModule = builder.rxModule;
    this.provideInterceptorProvider =
        DoubleCheck.provider(NetworkModule_ProvideInterceptorFactory.create(builder.networkModule));
    this.providesAppContextProvider =
        DoubleCheck.provider(
            AppContextModule_ProvidesAppContextFactory.create(builder.appContextModule));
    this.provideCacheFileProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideCacheFileFactory.create(
                builder.networkModule, providesAppContextProvider));
    this.provideCacheProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideCacheFactory.create(
                builder.networkModule, provideCacheFileProvider));
    this.provideHttpClientProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideHttpClientFactory.create(
                builder.networkModule, provideInterceptorProvider, provideCacheProvider));
    this.provideGsonClientProvider =
        NetworkModule_ProvideGsonClientFactory.create(builder.networkModule);
    this.provideRxAdapterProvider =
        DoubleCheck.provider(NetworkModule_ProvideRxAdapterFactory.create(builder.networkModule));
    this.provideApiServiceProvider =
        DoubleCheck.provider(
            HeroesApiServiceModule_ProvideApiServiceFactory.create(
                builder.heroesApiServiceModule,
                provideHttpClientProvider,
                provideGsonClientProvider,
                provideRxAdapterProvider));
  }

  @Override
  public RxSchedulers rxSchedulers() {
    return Preconditions.checkNotNull(
        rxModule.provideRxSchedulers(), "Cannot return null from a non-@Nullable @Provides method");
  }

  @Override
  public HeroesApiInterface apiService() {
    return provideApiServiceProvider.get();
  }

  public static final class Builder {
    private RxModule rxModule;

    private NetworkModule networkModule;

    private AppContextModule appContextModule;

    private HeroesApiServiceModule heroesApiServiceModule;

    private Builder() {}

    public AppComponent build() {
      if (rxModule == null) {
        this.rxModule = new RxModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (appContextModule == null) {
        throw new IllegalStateException(AppContextModule.class.getCanonicalName() + " must be set");
      }
      if (heroesApiServiceModule == null) {
        this.heroesApiServiceModule = new HeroesApiServiceModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder appContextModule(AppContextModule appContextModule) {
      this.appContextModule = Preconditions.checkNotNull(appContextModule);
      return this;
    }

    public Builder rxModule(RxModule rxModule) {
      this.rxModule = Preconditions.checkNotNull(rxModule);
      return this;
    }

    public Builder heroesApiServiceModule(HeroesApiServiceModule heroesApiServiceModule) {
      this.heroesApiServiceModule = Preconditions.checkNotNull(heroesApiServiceModule);
      return this;
    }
  }
}

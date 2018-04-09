package com.shubham.android.mvp_rx_demo.application.builder;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroesApiServiceModule_ProvideApiServiceFactory
    implements Factory<HeroesApiInterface> {
  private final HeroesApiServiceModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  private final Provider<RxJavaCallAdapterFactory> rxJavaCallAdapterFactoryProvider;

  public HeroesApiServiceModule_ProvideApiServiceFactory(
      HeroesApiServiceModule module,
      Provider<OkHttpClient> httpClientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<RxJavaCallAdapterFactory> rxJavaCallAdapterFactoryProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
    this.rxJavaCallAdapterFactoryProvider = rxJavaCallAdapterFactoryProvider;
  }

  @Override
  public HeroesApiInterface get() {
    return Preconditions.checkNotNull(
        module.provideApiService(
            httpClientProvider.get(),
            gsonConverterFactoryProvider.get(),
            rxJavaCallAdapterFactoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HeroesApiInterface> create(
      HeroesApiServiceModule module,
      Provider<OkHttpClient> httpClientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<RxJavaCallAdapterFactory> rxJavaCallAdapterFactoryProvider) {
    return new HeroesApiServiceModule_ProvideApiServiceFactory(
        module, httpClientProvider, gsonConverterFactoryProvider, rxJavaCallAdapterFactoryProvider);
  }

  public static HeroesApiInterface proxyProvideApiService(
      HeroesApiServiceModule instance,
      OkHttpClient httpClient,
      GsonConverterFactory gsonConverterFactory,
      RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {
    return instance.provideApiService(httpClient, gsonConverterFactory, rxJavaCallAdapterFactory);
  }
}

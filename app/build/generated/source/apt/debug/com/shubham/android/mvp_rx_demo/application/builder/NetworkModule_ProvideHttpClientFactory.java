package com.shubham.android.mvp_rx_demo.application.builder;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  private final Provider<Cache> cacheProvider;

  public NetworkModule_ProvideHttpClientFactory(
      NetworkModule module,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider,
      Provider<Cache> cacheProvider) {
    this.module = module;
    this.loggingInterceptorProvider = loggingInterceptorProvider;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideHttpClient(loggingInterceptorProvider.get(), cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      NetworkModule module,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider,
      Provider<Cache> cacheProvider) {
    return new NetworkModule_ProvideHttpClientFactory(
        module, loggingInterceptorProvider, cacheProvider);
  }

  public static OkHttpClient proxyProvideHttpClient(
      NetworkModule instance, HttpLoggingInterceptor loggingInterceptor, Cache cache) {
    return instance.provideHttpClient(loggingInterceptor, cache);
  }
}

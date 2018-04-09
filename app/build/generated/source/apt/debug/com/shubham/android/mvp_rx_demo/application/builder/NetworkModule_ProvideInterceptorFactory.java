package com.shubham.android.mvp_rx_demo.application.builder;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideInterceptorFactory
    implements Factory<HttpLoggingInterceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideInterceptorFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HttpLoggingInterceptor> create(NetworkModule module) {
    return new NetworkModule_ProvideInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor proxyProvideInterceptor(NetworkModule instance) {
    return instance.provideInterceptor();
  }
}

package com.shubham.android.mvp_rx_demo.application.builder;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRxAdapterFactory
    implements Factory<RxJavaCallAdapterFactory> {
  private final NetworkModule module;

  public NetworkModule_ProvideRxAdapterFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public RxJavaCallAdapterFactory get() {
    return Preconditions.checkNotNull(
        module.provideRxAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RxJavaCallAdapterFactory> create(NetworkModule module) {
    return new NetworkModule_ProvideRxAdapterFactory(module);
  }

  public static RxJavaCallAdapterFactory proxyProvideRxAdapter(NetworkModule instance) {
    return instance.provideRxAdapter();
  }
}

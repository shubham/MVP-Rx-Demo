package com.shubham.android.mvp_rx_demo.application.builder;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideGsonClientFactory implements Factory<GsonConverterFactory> {
  private final NetworkModule module;

  public NetworkModule_ProvideGsonClientFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public GsonConverterFactory get() {
    return Preconditions.checkNotNull(
        module.provideGsonClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GsonConverterFactory> create(NetworkModule module) {
    return new NetworkModule_ProvideGsonClientFactory(module);
  }

  public static GsonConverterFactory proxyProvideGsonClient(NetworkModule instance) {
    return instance.provideGsonClient();
  }
}

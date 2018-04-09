package com.shubham.android.mvp_rx_demo.application.builder;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideCacheFileFactory implements Factory<File> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideCacheFileFactory(
      NetworkModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public File get() {
    return Preconditions.checkNotNull(
        module.provideCacheFile(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<File> create(NetworkModule module, Provider<Context> contextProvider) {
    return new NetworkModule_ProvideCacheFileFactory(module, contextProvider);
  }

  public static File proxyProvideCacheFile(NetworkModule instance, Context context) {
    return instance.provideCacheFile(context);
  }
}

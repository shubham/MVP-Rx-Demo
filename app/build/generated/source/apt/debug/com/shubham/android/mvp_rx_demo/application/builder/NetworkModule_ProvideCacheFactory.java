package com.shubham.android.mvp_rx_demo.application.builder;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideCacheFactory implements Factory<Cache> {
  private final NetworkModule module;

  private final Provider<File> fileProvider;

  public NetworkModule_ProvideCacheFactory(NetworkModule module, Provider<File> fileProvider) {
    this.module = module;
    this.fileProvider = fileProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.provideCache(fileProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache> create(NetworkModule module, Provider<File> fileProvider) {
    return new NetworkModule_ProvideCacheFactory(module, fileProvider);
  }

  public static Cache proxyProvideCache(NetworkModule instance, File file) {
    return instance.provideCache(file);
  }
}

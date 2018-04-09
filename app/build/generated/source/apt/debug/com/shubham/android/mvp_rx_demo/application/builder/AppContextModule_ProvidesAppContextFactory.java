package com.shubham.android.mvp_rx_demo.application.builder;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppContextModule_ProvidesAppContextFactory implements Factory<Context> {
  private final AppContextModule module;

  public AppContextModule_ProvidesAppContextFactory(AppContextModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.providesAppContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(AppContextModule module) {
    return new AppContextModule_ProvidesAppContextFactory(module);
  }

  public static Context proxyProvidesAppContext(AppContextModule instance) {
    return instance.providesAppContext();
  }
}

package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashContextModule_ProvidesSplashContextFactory
    implements Factory<SplashScreenActivity> {
  private final SplashContextModule module;

  public SplashContextModule_ProvidesSplashContextFactory(SplashContextModule module) {
    this.module = module;
  }

  @Override
  public SplashScreenActivity get() {
    return Preconditions.checkNotNull(
        module.providesSplashContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashScreenActivity> create(SplashContextModule module) {
    return new SplashContextModule_ProvidesSplashContextFactory(module);
  }

  public static SplashScreenActivity proxyProvidesSplashContext(SplashContextModule instance) {
    return instance.providesSplashContext();
  }
}

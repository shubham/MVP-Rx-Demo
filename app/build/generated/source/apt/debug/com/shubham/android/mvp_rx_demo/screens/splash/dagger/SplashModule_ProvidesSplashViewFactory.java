package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashModule_ProvidesSplashViewFactory implements Factory<SplashView> {
  private final SplashModule module;

  private final Provider<SplashScreenActivity> activityProvider;

  public SplashModule_ProvidesSplashViewFactory(
      SplashModule module, Provider<SplashScreenActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public SplashView get() {
    return Preconditions.checkNotNull(
        module.providesSplashView(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashView> create(
      SplashModule module, Provider<SplashScreenActivity> activityProvider) {
    return new SplashModule_ProvidesSplashViewFactory(module, activityProvider);
  }

  public static SplashView proxyProvidesSplashView(
      SplashModule instance, SplashScreenActivity activity) {
    return instance.providesSplashView(activity);
  }
}

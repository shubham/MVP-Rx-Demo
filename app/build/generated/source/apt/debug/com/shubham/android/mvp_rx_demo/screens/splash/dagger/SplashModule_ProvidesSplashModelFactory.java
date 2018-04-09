package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashModule_ProvidesSplashModelFactory implements Factory<SplashModel> {
  private final SplashModule module;

  private final Provider<HeroesApiInterface> apiInterfaceProvider;

  private final Provider<SplashScreenActivity> activityProvider;

  public SplashModule_ProvidesSplashModelFactory(
      SplashModule module,
      Provider<HeroesApiInterface> apiInterfaceProvider,
      Provider<SplashScreenActivity> activityProvider) {
    this.module = module;
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.activityProvider = activityProvider;
  }

  @Override
  public SplashModel get() {
    return Preconditions.checkNotNull(
        module.providesSplashModel(apiInterfaceProvider.get(), activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashModel> create(
      SplashModule module,
      Provider<HeroesApiInterface> apiInterfaceProvider,
      Provider<SplashScreenActivity> activityProvider) {
    return new SplashModule_ProvidesSplashModelFactory(
        module, apiInterfaceProvider, activityProvider);
  }

  public static SplashModel proxyProvidesSplashModel(
      SplashModule instance, HeroesApiInterface apiInterface, SplashScreenActivity activity) {
    return instance.providesSplashModel(apiInterface, activity);
  }
}

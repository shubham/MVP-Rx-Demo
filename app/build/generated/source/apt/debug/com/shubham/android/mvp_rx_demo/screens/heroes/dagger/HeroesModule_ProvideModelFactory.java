package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.api.HeroesApiInterface;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroesModule_ProvideModelFactory implements Factory<HeroesModel> {
  private final HeroesModule module;

  private final Provider<HeroesApiInterface> apiInterfaceProvider;

  public HeroesModule_ProvideModelFactory(
      HeroesModule module, Provider<HeroesApiInterface> apiInterfaceProvider) {
    this.module = module;
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public HeroesModel get() {
    return Preconditions.checkNotNull(
        module.provideModel(apiInterfaceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HeroesModel> create(
      HeroesModule module, Provider<HeroesApiInterface> apiInterfaceProvider) {
    return new HeroesModule_ProvideModelFactory(module, apiInterfaceProvider);
  }

  public static HeroesModel proxyProvideModel(
      HeroesModule instance, HeroesApiInterface apiInterface) {
    return instance.provideModel(apiInterface);
  }
}

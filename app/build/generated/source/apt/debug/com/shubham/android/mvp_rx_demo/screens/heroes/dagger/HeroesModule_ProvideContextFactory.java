package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroesModule_ProvideContextFactory implements Factory<HeroesListActivity> {
  private final HeroesModule module;

  public HeroesModule_ProvideContextFactory(HeroesModule module) {
    this.module = module;
  }

  @Override
  public HeroesListActivity get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HeroesListActivity> create(HeroesModule module) {
    return new HeroesModule_ProvideContextFactory(module);
  }

  public static HeroesListActivity proxyProvideContext(HeroesModule instance) {
    return instance.provideContext();
  }
}

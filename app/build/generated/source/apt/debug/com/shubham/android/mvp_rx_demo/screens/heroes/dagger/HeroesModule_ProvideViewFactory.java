package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroesModule_ProvideViewFactory implements Factory<HeroesView> {
  private final HeroesModule module;

  public HeroesModule_ProvideViewFactory(HeroesModule module) {
    this.module = module;
  }

  @Override
  public HeroesView get() {
    return Preconditions.checkNotNull(
        module.provideView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HeroesView> create(HeroesModule module) {
    return new HeroesModule_ProvideViewFactory(module);
  }

  public static HeroesView proxyProvideView(HeroesModule instance) {
    return instance.provideView();
  }
}

package com.shubham.android.mvp_rx_demo.screens.details.dagger;

import com.shubham.android.mvp_rx_demo.screens.details.core.HeroDetailsView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroDetailsModule_ProvideViewFactory implements Factory<HeroDetailsView> {
  private final HeroDetailsModule module;

  public HeroDetailsModule_ProvideViewFactory(HeroDetailsModule module) {
    this.module = module;
  }

  @Override
  public HeroDetailsView get() {
    return Preconditions.checkNotNull(
        module.provideView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HeroDetailsView> create(HeroDetailsModule module) {
    return new HeroDetailsModule_ProvideViewFactory(module);
  }

  public static HeroDetailsView proxyProvideView(HeroDetailsModule instance) {
    return instance.provideView();
  }
}

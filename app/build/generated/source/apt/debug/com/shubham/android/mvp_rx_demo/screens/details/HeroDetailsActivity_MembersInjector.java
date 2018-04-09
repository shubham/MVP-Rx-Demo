package com.shubham.android.mvp_rx_demo.screens.details;

import com.shubham.android.mvp_rx_demo.screens.details.core.HeroDetailsView;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroDetailsActivity_MembersInjector
    implements MembersInjector<HeroDetailsActivity> {
  private final Provider<HeroDetailsView> viewProvider;

  public HeroDetailsActivity_MembersInjector(Provider<HeroDetailsView> viewProvider) {
    this.viewProvider = viewProvider;
  }

  public static MembersInjector<HeroDetailsActivity> create(
      Provider<HeroDetailsView> viewProvider) {
    return new HeroDetailsActivity_MembersInjector(viewProvider);
  }

  @Override
  public void injectMembers(HeroDetailsActivity instance) {
    injectView(instance, viewProvider.get());
  }

  public static void injectView(HeroDetailsActivity instance, HeroDetailsView view) {
    instance.view = view;
  }
}

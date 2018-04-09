package com.shubham.android.mvp_rx_demo.screens.heroes;

import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesPresenter;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesView;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroesListActivity_MembersInjector
    implements MembersInjector<HeroesListActivity> {
  private final Provider<HeroesView> viewProvider;

  private final Provider<HeroesPresenter> presenterProvider;

  public HeroesListActivity_MembersInjector(
      Provider<HeroesView> viewProvider, Provider<HeroesPresenter> presenterProvider) {
    this.viewProvider = viewProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<HeroesListActivity> create(
      Provider<HeroesView> viewProvider, Provider<HeroesPresenter> presenterProvider) {
    return new HeroesListActivity_MembersInjector(viewProvider, presenterProvider);
  }

  @Override
  public void injectMembers(HeroesListActivity instance) {
    injectView(instance, viewProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectView(HeroesListActivity instance, HeroesView view) {
    instance.view = view;
  }

  public static void injectPresenter(HeroesListActivity instance, HeroesPresenter presenter) {
    instance.presenter = presenter;
  }
}

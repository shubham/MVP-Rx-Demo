package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesModel;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesPresenter;
import com.shubham.android.mvp_rx_demo.screens.heroes.core.HeroesView;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HeroesModule_ProvidePresenterFactory implements Factory<HeroesPresenter> {
  private final HeroesModule module;

  private final Provider<RxSchedulers> schedulersProvider;

  private final Provider<HeroesView> viewProvider;

  private final Provider<HeroesModel> modelProvider;

  public HeroesModule_ProvidePresenterFactory(
      HeroesModule module,
      Provider<RxSchedulers> schedulersProvider,
      Provider<HeroesView> viewProvider,
      Provider<HeroesModel> modelProvider) {
    this.module = module;
    this.schedulersProvider = schedulersProvider;
    this.viewProvider = viewProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public HeroesPresenter get() {
    return Preconditions.checkNotNull(
        module.providePresenter(schedulersProvider.get(), viewProvider.get(), modelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HeroesPresenter> create(
      HeroesModule module,
      Provider<RxSchedulers> schedulersProvider,
      Provider<HeroesView> viewProvider,
      Provider<HeroesModel> modelProvider) {
    return new HeroesModule_ProvidePresenterFactory(
        module, schedulersProvider, viewProvider, modelProvider);
  }

  public static HeroesPresenter proxyProvidePresenter(
      HeroesModule instance, RxSchedulers schedulers, HeroesView view, HeroesModel model) {
    return instance.providePresenter(schedulers, view, model);
  }
}

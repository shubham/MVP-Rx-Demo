package com.shubham.android.mvp_rx_demo.screens.splash.dagger;

import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashModel;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashPresenter;
import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashModule_ProvidePresneterFactory implements Factory<SplashPresenter> {
  private final SplashModule module;

  private final Provider<RxSchedulers> schedulersProvider;

  private final Provider<SplashModel> modelProvider;

  public SplashModule_ProvidePresneterFactory(
      SplashModule module,
      Provider<RxSchedulers> schedulersProvider,
      Provider<SplashModel> modelProvider) {
    this.module = module;
    this.schedulersProvider = schedulersProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public SplashPresenter get() {
    return Preconditions.checkNotNull(
        module.providePresneter(schedulersProvider.get(), modelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashPresenter> create(
      SplashModule module,
      Provider<RxSchedulers> schedulersProvider,
      Provider<SplashModel> modelProvider) {
    return new SplashModule_ProvidePresneterFactory(module, schedulersProvider, modelProvider);
  }

  public static SplashPresenter proxyProvidePresneter(
      SplashModule instance, RxSchedulers schedulers, SplashModel model) {
    return instance.providePresneter(schedulers, model);
  }
}

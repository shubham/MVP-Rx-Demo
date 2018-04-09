package com.shubham.android.mvp_rx_demo.screens.splash;

import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashPresenter;
import com.shubham.android.mvp_rx_demo.screens.splash.core.SplashView;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashScreenActivity_MembersInjector
    implements MembersInjector<SplashScreenActivity> {
  private final Provider<SplashView> viewProvider;

  private final Provider<SplashPresenter> splashPresenterProvider;

  public SplashScreenActivity_MembersInjector(
      Provider<SplashView> viewProvider, Provider<SplashPresenter> splashPresenterProvider) {
    this.viewProvider = viewProvider;
    this.splashPresenterProvider = splashPresenterProvider;
  }

  public static MembersInjector<SplashScreenActivity> create(
      Provider<SplashView> viewProvider, Provider<SplashPresenter> splashPresenterProvider) {
    return new SplashScreenActivity_MembersInjector(viewProvider, splashPresenterProvider);
  }

  @Override
  public void injectMembers(SplashScreenActivity instance) {
    injectView(instance, viewProvider.get());
    injectSplashPresenter(instance, splashPresenterProvider.get());
  }

  public static void injectView(SplashScreenActivity instance, SplashView view) {
    instance.view = view;
  }

  public static void injectSplashPresenter(
      SplashScreenActivity instance, SplashPresenter splashPresenter) {
    instance.splashPresenter = splashPresenter;
  }
}

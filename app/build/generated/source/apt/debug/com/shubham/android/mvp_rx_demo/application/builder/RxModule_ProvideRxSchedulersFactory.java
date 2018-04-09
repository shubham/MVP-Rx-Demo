package com.shubham.android.mvp_rx_demo.application.builder;

import com.shubham.android.mvp_rx_demo.utils.rx.RxSchedulers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RxModule_ProvideRxSchedulersFactory implements Factory<RxSchedulers> {
  private final RxModule module;

  public RxModule_ProvideRxSchedulersFactory(RxModule module) {
    this.module = module;
  }

  @Override
  public RxSchedulers get() {
    return Preconditions.checkNotNull(
        module.provideRxSchedulers(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RxSchedulers> create(RxModule module) {
    return new RxModule_ProvideRxSchedulersFactory(module);
  }

  public static RxSchedulers proxyProvideRxSchedulers(RxModule instance) {
    return instance.provideRxSchedulers();
  }
}

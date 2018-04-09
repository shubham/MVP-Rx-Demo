package com.shubham.android.mvp_rx_demo.screens.details.dagger;

import com.shubham.android.mvp_rx_demo.screens.details.HeroDetailsActivity;
import com.shubham.android.mvp_rx_demo.screens.details.HeroDetailsActivity_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerHeroDetailsComponent implements HeroDetailsComponent {
  private HeroDetailsModule heroDetailsModule;

  private DaggerHeroDetailsComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.heroDetailsModule = builder.heroDetailsModule;
  }

  @Override
  public void inject(HeroDetailsActivity activity) {
    injectHeroDetailsActivity(activity);
  }

  private HeroDetailsActivity injectHeroDetailsActivity(HeroDetailsActivity instance) {
    HeroDetailsActivity_MembersInjector.injectView(
        instance,
        Preconditions.checkNotNull(
            heroDetailsModule.provideView(),
            "Cannot return null from a non-@Nullable @Provides method"));
    return instance;
  }

  public static final class Builder {
    private HeroDetailsModule heroDetailsModule;

    private Builder() {}

    public HeroDetailsComponent build() {
      if (heroDetailsModule == null) {
        throw new IllegalStateException(
            HeroDetailsModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerHeroDetailsComponent(this);
    }

    public Builder heroDetailsModule(HeroDetailsModule heroDetailsModule) {
      this.heroDetailsModule = Preconditions.checkNotNull(heroDetailsModule);
      return this;
    }
  }
}

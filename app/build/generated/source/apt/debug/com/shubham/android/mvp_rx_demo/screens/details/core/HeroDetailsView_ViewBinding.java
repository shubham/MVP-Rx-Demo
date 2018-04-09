// Generated code from Butter Knife. Do not modify!
package com.shubham.android.mvp_rx_demo.screens.details.core;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shubham.android.mvp_rx_demo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HeroDetailsView_ViewBinding implements Unbinder {
  private HeroDetailsView target;

  @UiThread
  public HeroDetailsView_ViewBinding(HeroDetailsView target, View source) {
    this.target = target;

    target.imageHero = Utils.findRequiredViewAsType(source, R.id.hero_details_activity_image, "field 'imageHero'", ImageView.class);
    target.introHero = Utils.findRequiredViewAsType(source, R.id.hero_details_activity_intro, "field 'introHero'", TextView.class);
    target.descriptionHero = Utils.findRequiredViewAsType(source, R.id.hero_details_activity_text, "field 'descriptionHero'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HeroDetailsView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageHero = null;
    target.introHero = null;
    target.descriptionHero = null;
  }
}

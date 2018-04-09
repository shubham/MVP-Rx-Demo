// Generated code from Butter Knife. Do not modify!
package com.shubham.android.mvp_rx_demo.screens.heroes.list;

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

public class HeroViewHolder_ViewBinding implements Unbinder {
  private HeroViewHolder target;

  @UiThread
  public HeroViewHolder_ViewBinding(HeroViewHolder target, View source) {
    this.target = target;

    target.imageHero = Utils.findRequiredViewAsType(source, R.id.item_hero_image, "field 'imageHero'", ImageView.class);
    target.nameHero = Utils.findRequiredViewAsType(source, R.id.item_hero_name, "field 'nameHero'", TextView.class);
    target.yearHero = Utils.findRequiredViewAsType(source, R.id.item_hero_year, "field 'yearHero'", TextView.class);
    target.separatorHero = Utils.findRequiredView(source, R.id.item_hero_separator, "field 'separatorHero'");
    target.descriptionHero = Utils.findRequiredViewAsType(source, R.id.item_hero_text, "field 'descriptionHero'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HeroViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageHero = null;
    target.nameHero = null;
    target.yearHero = null;
    target.separatorHero = null;
    target.descriptionHero = null;
  }
}

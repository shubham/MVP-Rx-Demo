// Generated code from Butter Knife. Do not modify!
package com.shubham.android.mvp_rx_demo.screens.heroes.core;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shubham.android.mvp_rx_demo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HeroesView_ViewBinding implements Unbinder {
  private HeroesView target;

  @UiThread
  public HeroesView_ViewBinding(HeroesView target, View source) {
    this.target = target;

    target.mHeroesListRecyclerView = Utils.findRequiredViewAsType(source, R.id.activity_heroes_list_recycler_view, "field 'mHeroesListRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HeroesView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHeroesListRecyclerView = null;
  }
}

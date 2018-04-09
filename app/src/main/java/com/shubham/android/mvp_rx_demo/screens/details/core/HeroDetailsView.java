package com.shubham.android.mvp_rx_demo.screens.details.core;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.shubham.android.mvp_rx_demo.R;
import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.screens.details.HeroDetailsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HeroDetailsView {

    @BindView(R.id.hero_details_activity_image)
    ImageView imageHero;

    @BindView(R.id.hero_details_activity_intro)
    TextView introHero;

    @BindView(R.id.hero_details_activity_text)
    TextView descriptionHero;

    View view;

    public HeroDetailsView(HeroDetailsActivity activity, Hero hero) {

        FrameLayout layout = new FrameLayout(activity);
        layout.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        view = LayoutInflater.from(activity).inflate(R.layout.activity_hero_details, layout, true);
        ButterKnife.bind(this, view);

        Glide.with(activity).load(hero.getImage()).into(imageHero);
        introHero.setText(TextUtils.isEmpty(hero.getIntro()) ? "No Text" : hero.getIntro());
        descriptionHero.setText(TextUtils.isEmpty(hero.getText()) ? " No Text" : hero.getText());

    }

    public View view() {
        return view;
    }

}

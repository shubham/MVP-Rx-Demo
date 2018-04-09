package com.shubham.android.mvp_rx_demo.screens.splash.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.shubham.android.mvp_rx_demo.R;
import com.shubham.android.mvp_rx_demo.screens.splash.SplashScreenActivity;

import butterknife.ButterKnife;

public class SplashView {

    private View view;

    public SplashView(SplashScreenActivity activity) {
        FrameLayout parent = new FrameLayout(activity);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(activity).inflate(R.layout.activity_splash, parent, true);
        ButterKnife.bind(view, activity);
    }

    public View constructView() {
        return view;
    }
}

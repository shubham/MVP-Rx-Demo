package com.shubham.android.mvp_rx_demo.screens.heroes.core;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.shubham.android.mvp_rx_demo.R;
import com.shubham.android.mvp_rx_demo.models.Hero;
import com.shubham.android.mvp_rx_demo.screens.heroes.HeroesListActivity;
import com.shubham.android.mvp_rx_demo.screens.heroes.list.HeroesAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;

public class HeroesView {

    @BindView(R.id.activity_heroes_list_recycler_view)
    RecyclerView mHeroesListRecyclerView;

    View view;

    HeroesAdapter adapter;

    public HeroesView(HeroesListActivity activity) {
        FrameLayout parent = new FrameLayout(activity);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(activity).inflate(R.layout.activity_heroes_list, parent, true);
        ButterKnife.bind(this, view);

        adapter = new HeroesAdapter();
        mHeroesListRecyclerView.setAdapter(adapter);
        mHeroesListRecyclerView.setLayoutManager(new LinearLayoutManager(activity));


    }

    public Observable<Integer> itemClicks() {
        return adapter.observeClicks();
    }

    public View view() {
        return view;
    }

    public void swapAdapter(ArrayList<Hero> heroes) {
        adapter.swapAdapter(heroes);
    }
}

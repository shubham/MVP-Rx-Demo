package com.shubham.android.mvp_rx_demo.screens.heroes.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.CLASS)
@interface HeroesScope {
}

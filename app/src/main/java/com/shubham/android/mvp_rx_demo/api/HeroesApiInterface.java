package com.shubham.android.mvp_rx_demo.api;

import com.shubham.android.mvp_rx_demo.models.Heroes;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Api Interface for creating Api Calls
 * Created by shubham on 03/04/18.
 */

public interface HeroesApiInterface {

    @GET("test-mobile/iOS/json/test2.json")
    Observable<Heroes> getHeros();
}

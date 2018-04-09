package com.shubham.android.mvp_rx_demo.models;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by shubham on 03/04/18.
 */

public class Heroes {
    @Expose
    private List<Hero> elements;

    public List<Hero> getElements() {
        return elements;
    }

    public void setElements(List<Hero> elements) {
        this.elements = elements;
    }
}

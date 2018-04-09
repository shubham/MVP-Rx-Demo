package com.shubham.android.mvp_rx_demo.utils.rx;

import rx.Scheduler;

public interface RxSchedulers {
    Scheduler runOnBackGround();

    Scheduler io();

    Scheduler compute();

    Scheduler androidThread();

    Scheduler internet();
}

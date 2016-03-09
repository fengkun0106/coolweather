package com.coolweather.app.util;

/**
 * Created by fengkun on 2016/3/8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}

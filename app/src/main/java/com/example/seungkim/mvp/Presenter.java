package com.example.seungkim.mvp;

/**
 * Created by seungkim on 2017. 4. 25..
 */

public interface Presenter {
    void onCreate();
    void onPause();
    void onResume();
    void onDestroy();
}

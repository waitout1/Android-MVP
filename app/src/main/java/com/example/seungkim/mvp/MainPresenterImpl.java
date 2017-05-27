package com.example.seungkim.mvp;

import android.content.Context;

/**
 * Created by seungkim on 2017. 4. 25..
 */

public class MainPresenterImpl implements MainPresenter{
    private Context context;
    private MainPresenter.View view;
    private RandomNumberModel model;

    public MainPresenterImpl(Context context){
        this.context = context;
    }

    @Override
    public void setView(MainPresenter.View view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        model = new RandomNumberModel();
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onDestroy() {
    }

    @Override
    public void onClickChangeData() {
        view.setResultText("Result : " + model.getNumber());
    }
}

package com.example.seungkim.mvp;

import android.content.Context;

/**
 * Created by seungkim on 2017. 4. 25..
 */

public class MainPresenterImpl implements MainPresenter, NumberModel.OnNumberChangeListener{
    private Context context;
    private MainPresenter.View view;
    private NumberModel model;

    public MainPresenterImpl(Context context){
        this.context = context;
    }

    @Override
    public void setView(MainPresenter.View view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        model = new NumberModel();
        model.setOnNumberChangeListener(this);
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
    public void onNumberChange(int number) {
        view.setResultText("Result : " + number);
    }

    @Override
    public void onClickChangeData() {
        model.changeNumber();
    }
}

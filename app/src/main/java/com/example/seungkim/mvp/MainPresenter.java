package com.example.seungkim.mvp;

/**
 * Created by seungkim on 2017. 5. 24..
 */

public interface MainPresenter extends Presenter{
    public interface View {
        void setResultText(String text);
    }

    void setView(MainPresenter.View view);
    void onClickChangeData();
}

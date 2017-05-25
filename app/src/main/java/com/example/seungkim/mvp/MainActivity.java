package com.example.seungkim.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements MainPresenter.View, View.OnClickListener {
    private TextView tvContent;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContent = (TextView)findViewById(R.id.tvContent);

        presenter = new MainPresenterImpl(MainActivity.this);
        presenter.setView(MainActivity.this);
        presenter.onCreate();

        findViewById(R.id.btnChangeData).setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }


    @Override
    public void setResultText(String text) {
        tvContent.setText(text);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnChangeData){
            presenter.onClickChangeData();
        }
    }
}

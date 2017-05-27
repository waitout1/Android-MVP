package com.example.seungkim.mvp;


public class RandomNumberModel {
    public RandomNumberModel(){}

    public int getNumber() {
        return (int) (Math.random() * 99);
    }
}


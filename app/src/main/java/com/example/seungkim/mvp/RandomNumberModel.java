package com.example.seungkim.mvp;


public class RandomNumberModel {
    private int number;

    public RandomNumberModel(){}

    public int getNumber() {
        number = (int) (Math.random() * 99);
        return number;
    }
}


package com.example.myapplication;

import android.app.Application;

public class arg extends Application {

    private int state;

    @Override
    public void onCreate() {
        //전역 변수 초기화
        state = 0;
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public void setState(int state){
        this.state = state;
    }

    public int getState(){
        return state;
    }
}
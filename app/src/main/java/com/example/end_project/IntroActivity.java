package com.example.end_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 스플래시 화면 생성

        new Thread(()->{
            try {
                Thread.sleep((long) (1.5* 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            runOnUiThread(()->{
                Intent mainintent = new Intent(this, MainActivity.class);
                startActivity(mainintent); // 메인 액티비티로 이동
                finish();
            });
        }).start();
    }
}

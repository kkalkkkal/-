package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.app.Activity;
import android.view.MotionEvent;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import java.util.Locale;

import static android.speech.tts.TextToSpeech.ERROR;

public class MainActivity2 extends AppCompatActivity {
    Activity Tutorial;
    //TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Tutorial=this;
//        tts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int status) {
//                tts.setLanguage(Locale.KOREAN);
//            }
//        });
        View view = findViewById(R.id.Tutorial);
        view.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == MotionEvent.ACTION_UP) {
                    //Intent intent = new Intent(Tutorial, MainActivity.class);
                    //startActivity(intent);
                    finish();
                }
                return true;
            }
        });
    }
}
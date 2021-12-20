package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.MotionEvent;
import android.widget.TextView;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.app.Fragment;
import android.app.Application;



public class MainActivity extends AppCompatActivity {
    Activity mainscreen;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arg tutorialnum=(arg)getApplicationContext();
        num=tutorialnum.getState();
        //tutorialnum.setState(0);
        mainscreen=this;
        View view = findViewById(R.id.view1);
        view.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
//                    Intent intent = new Intent(mainscreen,MainActivity2.class);
//                    startActivity(intent);
                    if(tutorialnum.getState()==0){
                        tutorialnum.setState(1);
                        Intent intent = new Intent(mainscreen,MainActivity2.class);
                        startActivity(intent);
                    }
                    else if(tutorialnum.getState()==1){
                        tutorialnum.setState(2);
                        Intent intent = new Intent(mainscreen,MainActivity3.class);
                        startActivity(intent);
                    }
                    else if(tutorialnum.getState()==2){
                        tutorialnum.setState(0); //테스트용
                        finish();
                    }
                }
                return true;
            }
        });
    }
}

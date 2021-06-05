package com.example.end_project.ASR;


import android.content.Context;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import androidx.annotation.RequiresApi;

import java.util.List;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.Locale;

import android.speech.tts.TextToSpeech;
import com.example.end_project.*;
import com.example.end_project.classification.ClassifierActivity;

public class G_ASR extends AppCompatActivity implements RecognitionListener {

    private Intent recognizerIntent;
    private final int RESULT_SPEECH = 1000;
    final int PERMISSION = 1;
    private SpeechRecognizer speech;
    private TextView textView;
    private Button sttbtn,ttsbtn;
    private TextToSpeech tts;
    private EditText ttsText;

    public void ASR(RecognitionListener listener, Context context) throws Exception { // google ASR API

        speech = SpeechRecognizer.createSpeechRecognizer(this);
        speech.setRecognitionListener(this);

        textView = findViewById(R.id.sttResult);
        sttbtn = findViewById(R.id.sttStart);
        findViewById(R.id.sttStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                recognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "ko-KR"); //언어지정입니다.
                recognizerIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getPackageName());
                recognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
                recognizerIntent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 5);   //검색을 말한 결과를 보여주는 갯수
                startActivityForResult(recognizerIntent, RESULT_SPEECH);
            }
        });


    }

    public G_ASR() { // 생성자
    }

    public String ConvertVoiceIntoText() throws Exception{
        return null;
    }

    public void Request_Beep() throws Exception {

    }

    @Override
    public void onReadyForSpeech(Bundle bundle) {

    }

    @Override
    public void onBeginningOfSpeech() {

    }

    @Override
    public void onRmsChanged(float v) {

    }

    @Override
    public void onBufferReceived(byte[] bytes) {

    }

    @Override
    public void onEndOfSpeech() {

    }

    @Override
    public void onError(int i) {

    }

    @Override
    public void onResults(Bundle bundle) {

    }

    @Override
    public void onPartialResults(Bundle bundle) {

    }

    @Override
    public void onEvent(int i, Bundle bundle) {

    }
}

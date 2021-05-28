package com.example.end_project;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import android.speech.tts.TextToSpeech;

public class G_TTS extends AppCompatActivity implements RecognitionListener, TextToSpeech.OnInitListener {

    private Intent recognizerIntent;
    private final int RESULT_SPEECH = 1000;
    final int PERMISSION = 1;
    private SpeechRecognizer speech;
    private TextView textView;
    private Button sttbtn, ttsbtn;
    private TextToSpeech tts;
    private EditText ttsText;
    private int status;

    public G_TTS() {
    }

    /*public void TTS() { // 구글 TTS api

    }*/



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void TTS() {    //tts speakout 함수 : 입력된 텍스트를 음성으로 출력하는 함수

        speech = SpeechRecognizer.createSpeechRecognizer(getApplicationContext());
        speech.setRecognitionListener(this);

        try {
            //파일 객체 생성
            File file = new File("raw/inform.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            while ((singleCh = filereader.read()) != -1) {
                System.out.print((char) singleCh);
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        } catch (IOException e) {
            System.out.println(e);
        }
        CharSequence text = ttsText.getText(); // 여기에 원하는 것
        tts.setPitch((float) 0.6);
        tts.setSpeechRate((float) 1);
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "id1");
    }

    @Override
    protected void onDestroy() {    //tts 후 destroy
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

/*

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onInit(int status) {
        this.status = status;        //tts 수행 성공시 초기화 정보
        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.KOREA);
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                //ttsbtn.setEnabled(true);
                TTS();
            }
        } else {
            Log.e("TTS", "initalization Failed");
        }
    }
*/


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
    public void onResults(Bundle bundle) {

    }

    @Override
    public void onPartialResults(Bundle bundle) {

    }

    @Override
    public void onEvent(int i, Bundle bundle) {

    }

    @Override
    public void onError(int i) {
        String message;
        switch (i) {
            case SpeechRecognizer.ERROR_AUDIO:
                message = "오디오 에러";
                break;
            case SpeechRecognizer.ERROR_CLIENT:
                message = "클라이언트 에러";
                break;
            case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
                message = "퍼미션 없음";
                break;
            case SpeechRecognizer.ERROR_NETWORK:
                message = "네트워크 에러";
                break;
            case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
                message = "네트웍 타임아웃";
                break;
            case SpeechRecognizer.ERROR_NO_MATCH:
                message = "찾을 수 없음";
                break;
            case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
                message = "RECOGNIZER가 바쁨";
                break;
            case SpeechRecognizer.ERROR_SERVER:
                message = "서버가 이상함";
                break;
            case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
                message = "말하는 시간초과";
                break;
            default:
                message = "알 수 없는 오류임";
                break;

        }


    }

    @Override
    public void onInit(int i) {

    }
}

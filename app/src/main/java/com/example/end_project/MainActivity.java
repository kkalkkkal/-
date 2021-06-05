package com.example.end_project;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Size;
import android.util.SparseIntArray;
import android.view.WindowManager;


import com.example.end_project.TTS.G_TTS;

import java.util.logging.Logger;


//import org.tensorflow.lite.examples.tflite.Classifier;



public class MainActivity extends AppCompatActivity {

  //  private static final Logger LOGGER = new Logger();
    private static final Size DESIRED_PREVIEW_SIZE = new Size(640, 480);
    private static final float TEXT_SIZE_DIP = 10;
    private Bitmap rgbFrameBitmap = null;
    private long lastProcessingTimeMs;
    private Integer sensorOrientation;
   // private Classifier classifier;
   // private BorderedText borderedText;
    /** Input image size of the model along x axis. */
    private int imageSizeX;
    /** Input image size of the model along y axis. */
    private int imageSizeY;

    private static final SparseIntArray ORIENTATIONS = new SparseIntArray();
    static {
        ORIENTATIONS.append(ExifInterface.ORIENTATION_NORMAL, 0);
        ORIENTATIONS.append(ExifInterface.ORIENTATION_ROTATE_90, 90);
        ORIENTATIONS.append(ExifInterface.ORIENTATION_ROTATE_180, 180);
        ORIENTATIONS.append(ExifInterface.ORIENTATION_ROTATE_270, 270);
    }


    private app_activate app_activate = new app_activate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetAuth_CAM getAuth_cam = new GetAuth_CAM();
        GetAuth_MIC getAuth_mic = new GetAuth_MIC();
        GetAuth_PHONE getAuth_phone = new GetAuth_PHONE();

        // 권한 가져오기
        getAuth_cam.Request_Camera_Permission(this, this);
        getAuth_mic.Request_MIC_Permission(this, this);
        getAuth_phone.Request_Phone_Permission(this, this);


        // 상태바를 안보이도록 합니다.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // 화면 켜진 상태를 유지합니다.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Default_Mode : 첫 실행은 무조건 이미지 탐색이 이루어진다.
        app_activate.Default_Mode();


        //


        G_TTS g_tts = new G_TTS();


//sst




    }


    public void Default_Mode() {

    }



}
package com.example.end_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import android.content.Context;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    // 무한 호출중
    GetAuth_CAM getAuth_cam;
    GetAuth_MIC getAuth_mic;
    GetAuth_PHONE getAuth_phone;

    static final int PERMISSIONS_REQUEST = 0x0000001;
    private static final int REQ_IMAGE_CAPTURE =  1002;
    private static final int REQ_CAMERA_PERMISSION =  1001; // 요청 실행 후 전달 받을 임의 코드


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getAuth_cam= new GetAuth_CAM();
        getAuth_mic = new GetAuth_MIC();
        getAuth_phone = new GetAuth_PHONE();

        //getAuth_phone.Request_Phone_Permission(this);
        //getAuth_mic.Request_MIC_Permission(this);

        OnCheckPermission(); // 권한 확인

        // Check whether your app is running on a device that has a front-facing camera.
        if (getApplicationContext().getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA_FRONT)) {
            // Continue with the part of your app's workflow that requires a
            // front-facing camera. 카메라 있는 경우
          //  getAuth_cam.Request_Camera_Permission(); // 카메라 권한 요청
            getAuth_cam.Request_Camera_Permission(this);

        } else {
            // Gracefully degrade your app experience. 카메라 없는 경우
        }
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    //위치 권한 설정
    public void OnCheckPermission() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission_group.MICROPHONE) != PackageManager.PERMISSION_GRANTED

                || ActivityCompat.checkSelfPermission(this, Manifest.permission_group.CAMERA) != PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(this, Manifest.permission_group.PHONE) != PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission( this, Manifest.permission_group.CALL_LOG) != PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(this, Manifest.permission_group.STORAGE) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission_group.CAMERA)) {

                Toast.makeText(this, "앱 실행을 위해서는 권한을 설정해야 합니다", Toast.LENGTH_LONG).show();

                ActivityCompat.requestPermissions(this,

                        new String[]{Manifest.permission_group.MICROPHONE, Manifest.permission_group.CALL_LOG, Manifest.permission_group.STORAGE,
                        Manifest.permission_group.CAMERA, Manifest.permission_group.PHONE},

                        PERMISSIONS_REQUEST);

            } else {

                ActivityCompat.requestPermissions(this,

                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},

                        PERMISSIONS_REQUEST);

            }
        }
    }

    @Override

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {


        switch (requestCode) {

            case PERMISSIONS_REQUEST :

                if (grantResults.length > 0

                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(this, "앱 실행을 위한 권한이 설정 되었습니다", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(this, "앱 실행을 위한 권한이 취소 되었습니다", Toast.LENGTH_LONG).show();

                }

                break;

        }
/*
        // 네이버 지도 소스 권한
        if (locationSource.onRequestPermissionsResult(
                requestCode, permissions, grantResults)) {
            if (!locationSource.isActivated()) { // 권한 거부됨
                naverMap.setLocationTrackingMode(LocationTrackingMode.None);
            }
            return;
        }*/

        super.onRequestPermissionsResult(
                requestCode, permissions, grantResults);


    }


}
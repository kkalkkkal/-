package com.example.end_project;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.MediaStore;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class GetAuth_PHONE extends AppCompatActivity {

    private static final int REQ_PHONE_PERMISSION =  2003; // 요청 실행 후 전달 받을 임의 코드



    public void Request_Phone_Permission(Activity activity) { // 전화 권한 요청

        int permission = ContextCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE); // 권한이 이미 있는지 확인

        if(permission == PackageManager.PERMISSION_DENIED){
            // 권한 없어서 요청
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {
                Toast.makeText(activity, "앱 실행을 위해서는 권한을 설정해야 합니다", Toast.LENGTH_LONG).show();
                ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE},REQ_PHONE_PERMISSION);

            }else { // 권한 있음
               // startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE), REQ_IMAGE_CAPTURE);
            }
        }
    }

    public GetAuth_PHONE() {
    }

    public void Activate_Phone() {

    }
}

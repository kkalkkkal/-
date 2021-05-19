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

public class GetAuth_MIC extends AppCompatActivity {

    private static final int REQ_MIC_PERMISSION =  2003; // 요청 실행 후 전달 받을 임의 코드


    public GetAuth_MIC() {
    }

    public void Request_MIC_Permission(Activity activity) {

        int permission = ContextCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO); // 권한이 이미 있는지 확인

        if(permission == PackageManager.PERMISSION_DENIED){
            // 권한 없어서 요청
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECORD_AUDIO)) {
                Toast.makeText(activity, "앱 실행을 위해서는 권한을 설정해야 합니다", Toast.LENGTH_LONG).show();
                ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECORD_AUDIO},REQ_MIC_PERMISSION);

            }else { // 권한 있음
                //startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE), REQ_IMAGE_CAPTURE);
            }
        }
    }

    public void Activate_MIC() {

    }
}

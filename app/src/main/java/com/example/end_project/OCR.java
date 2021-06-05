package com.example.end_project;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import static java.text.DateFormat.DEFAULT;

public class OCR {

    public OCR() { // 생성자
    }
    
    public void ExecuteOCR() {

    }

    public void ReceiveImageDomain() {

    }

    public void DetectTextArea() {

    }

    public void RecognizeText() {

    }

    public String ConvertTextData() {
        return null;
    }

    public void SaveTextData() {

    }

    public void ExitOCR() {

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void OCR() {
       //     makeSignature(); //<- 이걸 호출하면 네이버 OCR을 사용할 수 있음.

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String makeSignature() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {

        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

        String space = " ";					// one space
        String newLine = "\n";					// new line
        String method = "GET";					// method
        String url = ""; // url (include query string)
        String timestamp = String.format("%lf",timestamp2);			// current timestamp (epoch)
        String accessKey = "KAeb0V0uqKh7PIUFRVPj";			// access key id (from portal or Sub Account)
        String secretKey = "JmTS9U3KfuNWvjz8t3r2AVNutlpcPCvOA3KXlyOs"; // 시크릿 키

        String message = new StringBuilder()
                .append(method)
                .append(space)
                .append(url)
                .append(newLine)
                .append(timestamp)
                .append(newLine)
                .append(accessKey)
                .toString();

        SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(signingKey);

        byte[] rawHmac = mac.doFinal(message.getBytes("UTF-8"));
        String encodeBase64String;

        encodeBase64String = Base64.getEncoder().encodeToString(rawHmac);

        return encodeBase64String;
    }
}

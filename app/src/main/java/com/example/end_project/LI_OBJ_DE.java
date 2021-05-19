package com.example.end_project;

import android.media.Image;

import java.lang.reflect.Array;
import java.util.Vector;

public class LI_OBJ_DE {

    public Vector textArea;

    public Image img;

    public Vector getTextArea() {
        return textArea;
    }

    public LI_OBJ_DE(Vector textArea, Image img) {
        this.textArea = textArea;
        this.img = img;
    }

    public void setTextArea(Vector textArea) {
        this.textArea = textArea;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }


    public Vector Execute_Expiration_Date_Detection() {
        return null;
    }

    public void SendTextData(Vector textArea) {

    }

    public void RequestOCR() {

    }


}

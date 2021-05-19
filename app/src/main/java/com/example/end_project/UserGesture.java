package com.example.end_project;

public class UserGesture {

    public String GestureName;


    public UserGesture(String gestureName) {
        GestureName = gestureName;
    }

    public String getGestureName() {
        return GestureName;
    }

    public void setGestureName(String gestureName) {
        GestureName = gestureName;
    }

    public String Gesture(){

        return null;
    }

    // Override는 상위 클래스에서 상속 받아 재정의 하는 것이라 세가지로 나누는 게 불가능함.
    public void RecognizeGesture(String GestureName){

        if (GestureName == "two_fingerGesture")
        {

        }else if ( GestureName == "two_tabGesture") {

        } else if (GestureName == "SlideGesutre") {

        }

    }








}

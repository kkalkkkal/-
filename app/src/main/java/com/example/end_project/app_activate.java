package com.example.end_project;

public class app_activate extends UserGesture{

    public int status;

    public app_activate(String gestureName, int status) { // 생성자
        super(gestureName);
        this.status = status;
    }

    public app_activate(int status) {
        super();
    }

    public void Default_Mode() {

    }

    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }

    public void ExecuteASR() {

    }

    public void ResetCamera() {

    }

    public void ExecuteGesture() {

    }

    public void Executeinformation() {

    }

    public void Beep(int status){

    }

}

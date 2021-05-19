package com.example.end_project;

public class ModeChangePRO {

    public int Current_Mode;

    public ModeChangePRO(int current_Mode) {
        Current_Mode = current_Mode;
    }

    public int getCurrent_Mode() {
        return Current_Mode;
    }

    public void setCurrent_Mode(int current_Mode) {
        Current_Mode = current_Mode;
    }

    public void ExecuteProductDetection() { // 이미지 분류 알고리즘 실행 요청

    }

    public void ExitProductDetection() { // 이미지 분류 알고리즘 정지

    }

    public void ChangeMode(int Current_Mode){ // 모드 전환

    }
}

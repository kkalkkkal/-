package com.example.end_project;

import com.example.end_project.G_TTS.*;

public class Information extends EXP_PR {

    public String text_data;

    public Information(String text_data, String text_data1) {
        super(text_data);
        this.text_data = text_data1;
    }

    @Override
    public String getText_data() {
        return text_data;
    }

    @Override
    public void setText_data(String text_data) {
        this.text_data = text_data;
    }

    public void Information_GuideLine() { // 도움말 출력

    }

    @Override
    public void ExecuteTTS(String text_data) {


    }
}

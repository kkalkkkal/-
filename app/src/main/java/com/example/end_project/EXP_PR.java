package com.example.end_project;

import com.example.end_project.G_TTS.*;

public class EXP_PR {

    public String text_data;

    public String getText_data() {
        return text_data;
    }

    public void setText_data(String text_data) {
        this.text_data = text_data;
    }

    public EXP_PR(String text_data) {
        this.text_data = text_data;
    }

    public void ExecuteTTS(String text_data) {
        G_TTS g_tts = new G_TTS();
        g_tts.TTS();

    }
}

package com.example.zakwathu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.zakwathu.ui.main.Radio2FMFragment;

public class Radio2FM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio2_f_m_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Radio2FMFragment.newInstance())
                    .commitNow();
        }
    }
}
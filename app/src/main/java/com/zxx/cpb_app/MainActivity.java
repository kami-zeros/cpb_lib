package com.zxx.cpb_app;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.zxx.cpb.CircularProgressButton;


/**
 * https://github.com/dmytrodanylyk/circular-progress-button
 * 仅供学习，侵删
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircularProgressButton button = findViewById(R.id.cpb_btn);
        button.setIndeterminateProgressMode(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button.getProgress() == 0) {
                    button.setProgress(50);
                } else if (button.getProgress() == 100) {
                    button.setProgress(0);
                } else {
                    button.setProgress(100);
                }
            }
        });
    }
}

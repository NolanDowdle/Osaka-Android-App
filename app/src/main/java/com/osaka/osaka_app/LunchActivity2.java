package com.osaka.osaka_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class LunchActivity2 extends AppCompatActivity {

    Button lunchHibachiButton;
    Button lunchChineseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch2);

        lunchHibachiButton = findViewById(R.id.hibachiLunchButton);
        lunchHibachiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLunchHibachi();
            }
        });

        lunchChineseButton = findViewById(R.id.chineseLunchButton);
        lunchChineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLunchChinese();
            }
        });
    }

    public void openLunchHibachi() {
        startActivity(new Intent(this, HibachiLunchActivity.class));
    }

    public void openLunchChinese() {
        startActivity(new Intent(this, ChineseLunchActivity.class));
    }
}

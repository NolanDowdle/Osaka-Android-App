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
public class DinnerActivity extends AppCompatActivity {

    Button hibachiDinnerButton;
    Button chineseDinnerButton;
    Button chefSpecialtyDinnerButton;
    Button loMeinDinnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        hibachiDinnerButton = findViewById(R.id.hibachiDinnerButton);
        hibachiDinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHibachiDinner();
            }
        });
        chineseDinnerButton = findViewById(R.id.chineseDinnerButton);
        chineseDinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChineseDinner();
            }
        });
        chefSpecialtyDinnerButton = findViewById(R.id.chefSpecialDinnerButton);
        chefSpecialtyDinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChefSpecialty();
            }
        });
        loMeinDinnerButton = findViewById(R.id.loMeinDinnerButton);
        loMeinDinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoMeinDinner();
            }
        });
    }

    public void openHibachiDinner() {
        startActivity(new Intent(this, HibachiDinnerActivity.class));
    }

    public void openChineseDinner() {
        startActivity(new Intent(this, ChineseDinnerActivity.class));
    }

    public void openChefSpecialty() {
        startActivity(new Intent(this, ChefSpecialtyDinnerActivity.class));
    }

    public void openLoMeinDinner() {
        startActivity(new Intent(this, LoMeinDinnerActivity.class));
    }
}

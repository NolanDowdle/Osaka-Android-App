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
public class GlutenGlycemicChoice extends AppCompatActivity {

    Button buttonOpenGlutenFreeMenu;
    Button buttonOpenLowGlycemicMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gluten_glycemic_choice);

        buttonOpenGlutenFreeMenu = findViewById(R.id.buttonOpenGlutenFreeMenu);
        buttonOpenGlutenFreeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGlutenFreeMenu();
            }
        });

        buttonOpenLowGlycemicMenu = findViewById(R.id.buttonOpenLowGlycemicMenu);
        buttonOpenLowGlycemicMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLowGlycemicMenu();
            }
        });
    }

    public void openGlutenFreeMenu() {
        startActivity(new Intent(this, GlutenFreeActivity.class));
    }

    public void openLowGlycemicMenu() {
        startActivity(new Intent(this, LowGlycemic.class));
    }
}

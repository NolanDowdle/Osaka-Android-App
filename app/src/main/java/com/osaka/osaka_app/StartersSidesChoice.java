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
public class StartersSidesChoice extends AppCompatActivity {

    Button buttonViewStarters;
    Button buttonViewSides;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters_sides_choice);

        buttonViewStarters = findViewById(R.id.startersViewButton);
        buttonViewStarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartersActivity();
            }
        });

        buttonViewSides = findViewById(R.id.sidesViewButton);
        buttonViewSides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSidesActivity();
            }
        });
    }

    public void openStartersActivity() {
        startActivity(new Intent(this, StartersActivity.class));

    }

    public void openSidesActivity() {
        startActivity(new Intent(this, SidesActivity.class));
    }

}

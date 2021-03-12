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
public class SushiActivity extends AppCompatActivity {

    Button buttonNigiriSushi;
    Button buttonBigRollSushi;
    Button buttonComboDinnerSushi;
    Button buttonRegularSushi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi);

        buttonNigiriSushi = findViewById(R.id.buttonNigiriSushi);
        buttonNigiriSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNigiriSushiMenu();
            }
        });

        buttonBigRollSushi = findViewById(R.id.buttonBigSpecialRollsSushi);
        buttonBigRollSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBigRollSushiMenu();
            }
        });

        buttonComboDinnerSushi = findViewById(R.id.buttonSushiDinnerCombo);
        buttonComboDinnerSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openComboDinnerSushiMenu();
            }
        });

        buttonRegularSushi = findViewById(R.id.buttonRegularSushiRolls);
        buttonRegularSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegularSushiMenu();
            }
        });
    }

    public void openNigiriSushiMenu() {
        startActivity(new Intent(this, NigiriSushi.class));
    }

    public void openBigRollSushiMenu() {
        startActivity(new Intent(this, SpecialRollSushi.class));
    }

    public void openComboDinnerSushiMenu() {
        startActivity(new Intent(this, DinnerComboSushi.class));
    }

    public void openRegularSushiMenu() {
        startActivity(new Intent(this, RegularSushi.class));
    }
}

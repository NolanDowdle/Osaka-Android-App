package com.osaka.osaka_app;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChineseSides extends AppCompatActivity {
    private Button doneButton;
    static String sides;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_sides);

        doneButton = findViewById(R.id.doneButtonChineseSides);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateString();
                printMessage();
                finish();
            }
        });
    }

    public static String returnSides() {
        return sides;
    }
    public static void resetSides() {
        sides = "";
    }

    public void updateString() {
        resetSides();
        RadioGroup radioGroupRice = findViewById(R.id.whiteOrFriedRiceRadioGroupChineseSides);
        RadioGroup radioGroupSides = findViewById(R.id.sidesChineseSides);

        int radioID = radioGroupRice.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(radioID);

        int radioID2 = radioGroupSides.getCheckedRadioButtonId();
        RadioButton radioButton2 = findViewById(radioID2);

        sides = "";
        sides += radioButton.getText();
        sides = sides + "\n";
        sides = sides + radioButton2.getText();
    }

    public void printMessage() {
        Toast t = Toast.makeText(getApplicationContext(), "Added!", Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.getView().setBackgroundResource(R.drawable.added_order);
        t.getView().setAlpha((float) 0.8);
        t.show();
    }
}

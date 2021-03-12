package com.osaka.osaka_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class DinnerComboSushi extends AppCompatActivity {

    Button buttonSushiRegularComboSushi;
    Button buttonSushiDeluxeComboSushi;
    Button buttonTriColorSushiCombo;
    Button buttonChirashiSushiCombo;
    Button buttonGrilledEelDonComboSushi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_combo_sushi);

        buttonSushiRegularComboSushi = findViewById(R.id.buttonSushiRegularComboSushi);
        CartItem sushiRegular = new CartItem("Sushi Regular", 13.95);
        addItem(buttonSushiRegularComboSushi, sushiRegular);

        buttonSushiDeluxeComboSushi = findViewById(R.id.buttonSushiDeluxeComboSushi);
        CartItem sushiDeluxe = new CartItem("Sushi Deluxe", 16.95);
        addItem(buttonSushiDeluxeComboSushi, sushiDeluxe);

        buttonTriColorSushiCombo = findViewById(R.id.buttonTriColorSushiCombo);
        CartItem tricolorSushi = new CartItem("Tri Color Sushi", 21.95);
        addItem(buttonTriColorSushiCombo, tricolorSushi);

        buttonChirashiSushiCombo = findViewById(R.id.buttonChirashiSushiCombo);
        CartItem chirashiSushi = new CartItem("Chirashi Sushi", 19.95);
        addItem(buttonChirashiSushiCombo, chirashiSushi);

        buttonGrilledEelDonComboSushi = findViewById(R.id.buttonGrilledEelDonComboSushi);
        CartItem grilledEelDonSushi = new CartItem("Grilled Eel Don Sushi", 14.95);
        addItem(buttonGrilledEelDonComboSushi, grilledEelDonSushi);
    };

    CartItem item;
    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    setItem(item);
                    startActivityForResult(new Intent(view.getContext(), SushiSides.class), 1);
                } else {
                    Toast t = Toast.makeText(getApplicationContext(), "Cannot add: cart full!", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.getView().setBackgroundResource(R.drawable.cart_full);
                    t.getView().setAlpha((float) 0.8);
                    t.show();
                }
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        item.setSides(SushiSides.returnSides());
        SushiSides.resetSides();
        CartItems.currentCart.add(item);
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}

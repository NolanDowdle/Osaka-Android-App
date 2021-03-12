package com.osaka.osaka_app;

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
public class LowGlycemic extends AppCompatActivity {

    Button buttonSteamedGardenVegetables;
    Button buttonSteamedChickenWithVegetables;
    Button buttonSteamedShrimpWithVegetables;
    Button buttonSteamedChickenWithBroccoli;
    Button buttonSteamedShrimpWithBroccoli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_glycemic);

        buttonSteamedGardenVegetables = findViewById(R.id.buttonSteamedGardenVegetables);
        CartItem steamedGardenVegetables = new CartItem("Steamed Garden Vegetables", 8.25);
        addItem(buttonSteamedGardenVegetables, steamedGardenVegetables);

        buttonSteamedChickenWithVegetables = findViewById(R.id.buttonSteamedChickenWithVegetables);
        CartItem steamedChickenWithVegetables = new CartItem("Steamed Chicken w. Vegetables", 9.45);
        addItem(buttonSteamedChickenWithVegetables, steamedChickenWithVegetables);

        buttonSteamedShrimpWithVegetables = findViewById(R.id.buttonSteamedShrimpWithVegetables);
        CartItem steamedShrimpWithVegetables = new CartItem("Steamed Shrimp w. Vegetables", 10.95);
        addItem(buttonSteamedShrimpWithVegetables, steamedShrimpWithVegetables);

        buttonSteamedChickenWithBroccoli = findViewById(R.id.buttonSteamedChickenWithBroccoli);
        CartItem steamedChickenWithBroccoli = new CartItem("Steamed Chicken w. Broccoli", 9.45);
        addItem(buttonSteamedChickenWithBroccoli, steamedChickenWithBroccoli);

        buttonSteamedShrimpWithBroccoli = findViewById(R.id.buttonSteamedShrimpWithBroccoli);
        CartItem steamedShrimpWithBroccoli = new CartItem("Steamed Shrimp w. Broccoli", 10.95);
        addItem(buttonSteamedShrimpWithBroccoli, steamedShrimpWithBroccoli);
    }

    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    startActivity(new Intent(view.getContext(), SushiSides.class));
                    CartItems.currentCart.add(item);
                    Toast t = Toast.makeText(getApplicationContext(), "Added!", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.getView().setBackgroundResource(R.drawable.added_order);
                    t.getView().setAlpha((float) 0.8);
                    t.show();
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
}

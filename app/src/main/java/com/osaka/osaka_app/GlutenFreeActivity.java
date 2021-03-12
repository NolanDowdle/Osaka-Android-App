package com.osaka.osaka_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class GlutenFreeActivity extends AppCompatActivity {

    Button buttonChickenChowMein;
    Button buttonShrimpChowMein;
    Button buttonTripleGreenShrimp;
    Button buttonMixedGardenVegetables;
    Button buttonChickenWithVegetable;
    Button buttonShrimpWithVegetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gluten_free);

        buttonChickenChowMein = findViewById(R.id.buttonChickenChowMein);
        CartItem chickenChowMein = new CartItem("Chicken Chow Mein", 10.95);
        addItem(buttonChickenChowMein, chickenChowMein);

        buttonShrimpChowMein = findViewById(R.id.buttonShrimpChowMein);
        CartItem shrimpChowMein = new CartItem("Shrimp Chow Mein", 11.95);
        addItem(buttonShrimpChowMein, shrimpChowMein);

        buttonTripleGreenShrimp = findViewById(R.id.buttonTripleGreenShrimp);
        CartItem tripleGreenShrimp = new CartItem("Triple Green Shrimp", 11.95);
        addItem(buttonTripleGreenShrimp, tripleGreenShrimp);

        buttonMixedGardenVegetables = findViewById(R.id.buttonMixedGardenVegetables);
        CartItem mixedGardenVegetables = new CartItem("Mixed Garden Vegetables", 8.25);
        addItem(buttonMixedGardenVegetables, mixedGardenVegetables);

        buttonChickenWithVegetable = findViewById(R.id.buttonChickenWithVegetable);
        CartItem chickenWithVegetables = new CartItem("Chicken w. Vegetables", 10.95);
        addItem(buttonChickenWithVegetable, chickenWithVegetables);

        buttonShrimpWithVegetable = findViewById(R.id.buttonShrimpWithVegetable);
        CartItem shrimpWithVegetables = new CartItem("Shrimp w. Vegetables", 11.95);
        addItem(buttonShrimpWithVegetable, shrimpWithVegetables);
    }

    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
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

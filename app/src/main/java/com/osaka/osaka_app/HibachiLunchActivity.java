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
public class HibachiLunchActivity extends AppCompatActivity {
    //order button numbers from very top button on the view
    //to the very bottom button on the view
    Button buttonHibachiVegetableLunch;
    Button buttonHibachiTofuLunch;
    Button buttonTeriyakiChickenLunch;
    Button buttonHibachiChickenLunch;
    Button buttonHibachiYakiLunch;
    Button buttonHibachiShrimpLunch;
    Button buttonHibachiScallopLunch;
    Button buttonHibachiSteakLunch;
    Button buttonTeriyakiSteakLunch;
    Button buttonHibachiChickenShrimpLunch;
    Button buttonHibachiChickenSteakLunch;
    Button buttonHibachiChickenYakiLunch;
    Button buttonHibachiSteakShrimpLunch;
    Button buttonHibachiChickenScallopLunch;
    Button buttonHibachiSteakScallopLunch;
    Button buttonHibachiShrimpScallopLunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hibachi_lunch);

        //initialize all buttons
        buttonHibachiVegetableLunch = findViewById(R.id.buttonHibachiVegetableLunch);
        CartItem hibachiItem = new CartItem("Hibachi Vegetable Lunch", 6.75);
        addItem(buttonHibachiVegetableLunch, hibachiItem);

        buttonHibachiTofuLunch = findViewById(R.id.buttonHibachiTofuLunch);
        CartItem hibachiTofuItem = new CartItem("Hibachi Tofu Lunch", 6.75);
        addItem(buttonHibachiTofuLunch, hibachiTofuItem);

        buttonTeriyakiChickenLunch = findViewById(R.id.buttonTeriyakiChickenLunch);
        CartItem teriyakiChickenItem = new CartItem("Teriyaki Chicken Lunch", 7.50);
        addItem(buttonTeriyakiChickenLunch, teriyakiChickenItem);

        buttonHibachiChickenLunch = findViewById(R.id.buttonHibachiChickenLunch);
        CartItem hibachiChickenItem = new CartItem("Hibachi Chicken Lunch", 7.50);
        addItem(buttonHibachiChickenLunch, hibachiChickenItem);

        buttonHibachiYakiLunch = findViewById(R.id.buttonHibachiYakiLunch);
        CartItem hibachiYakiItem = new CartItem("Hibachi Yaki Lunch", 7.95);
        addItem(buttonHibachiYakiLunch, hibachiYakiItem);

        buttonHibachiShrimpLunch = findViewById(R.id.buttonHibachiShrimpLunch);
        CartItem hibachiShrimpLunch = new CartItem("Hibachi Shrimp Lunch", 7.95);
        addItem(buttonHibachiShrimpLunch, hibachiShrimpLunch);

        buttonHibachiScallopLunch = findViewById(R.id.buttonHibachiScallopLunch);
        CartItem hibachiScallopLunch = new CartItem("Hibachi Ocean Scallop Lunch", 9.95);
        addItem(buttonHibachiScallopLunch, hibachiScallopLunch);

        buttonHibachiSteakLunch = findViewById(R.id.buttonHibachiSteakLunch);
        CartItem hibachiSteakLunch = new CartItem("Hibachi Steak Lunch", 7.95);
        addItem(buttonHibachiSteakLunch, hibachiSteakLunch);

        buttonTeriyakiSteakLunch = findViewById(R.id.buttonTeriyakiSteakLunch);
        CartItem teriyakiSteakLunch = new CartItem("Teriyaki Steak Lunch", 7.95);
        addItem(buttonTeriyakiSteakLunch, teriyakiSteakLunch);

        buttonHibachiChickenShrimpLunch = findViewById(R.id.buttonHibachiChickenShrimpLunch);
        CartItem hibachiChickenShrimpLunch = new CartItem("Lunch Hibachi Chicken & Shrimp", 9.95);
        addItem(buttonHibachiChickenShrimpLunch, hibachiChickenShrimpLunch);

        buttonHibachiChickenSteakLunch = findViewById(R.id.buttonHibachiChickenSteakLunch);
        CartItem hibachiChickenSteakLunch = new CartItem("Lunch Hibachi Chicken & Steak", 9.95);
        addItem(buttonHibachiChickenSteakLunch, hibachiChickenSteakLunch);

        buttonHibachiChickenYakiLunch = findViewById(R.id.buttonHibachiChickenYakiLunch);
        CartItem hibachiChickenYakiLunch = new CartItem("Lunch Hibachi Chicken & Yaki", 9.95);
        addItem(buttonHibachiChickenYakiLunch, hibachiChickenYakiLunch);

        buttonHibachiSteakShrimpLunch = findViewById(R.id.buttonHibachiSteakShrimpLunch);
        CartItem hibachiSteakShrimpLunch = new CartItem("Lunch Hibachi Steak & Shrimp", 11.95);
        addItem(buttonHibachiSteakShrimpLunch, hibachiSteakShrimpLunch);

        buttonHibachiChickenScallopLunch = findViewById(R.id.buttonHibachiChickenScallopLunch);
        CartItem hibachiChickenScallopLunch = new CartItem("Lunch Hibachi Chicken & Scallop", 11.95);
        addItem(buttonHibachiChickenScallopLunch, hibachiChickenScallopLunch);

        buttonHibachiSteakScallopLunch = findViewById(R.id.buttonHibachiSteakScallopLunch);
        CartItem hibachiSteakScallopLunch = new CartItem("Lunch Hibachi Steak & Scallop", 11.95);
        addItem(buttonHibachiSteakScallopLunch, hibachiSteakScallopLunch);

        buttonHibachiShrimpScallopLunch = findViewById(R.id.buttonHibachiShrimpScallopLunch);
        CartItem hibachiShrimpScallopLunch = new CartItem("Lunch Hibachi Shrimp & Scallop", 11.95);
        addItem(buttonHibachiShrimpScallopLunch, hibachiShrimpScallopLunch);
    }

    CartItem item;
    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    setItem(item);
                    startActivityForResult(new Intent(view.getContext(), JapaneseSides.class), 1);
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
        item.setSides(JapaneseSides.returnSides());
        JapaneseSides.resetSides();
        CartItems.currentCart.add(item);
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}

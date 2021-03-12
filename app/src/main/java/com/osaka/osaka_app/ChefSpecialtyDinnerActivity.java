package com.osaka.osaka_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class ChefSpecialtyDinnerActivity extends AppCompatActivity {

    Button buttonSesameChickenDinner;
    Button buttonGeneralTsoChickenDinner;
    Button buttonOrangeChickenDinner;
    Button buttonChickenShrimpSupremeDinner;
    Button buttonTripleDelightDinner;
    Button buttonKingsTofu;
    Button buttonHappyFamilyDinner;
    Button buttonDragonPhoenixDinner;
    Button buttonSeafoodDelightDinner;
    Button buttonOrangeBeefChefSpecial;
    Button buttonBlackPepperDicedChickenChefSpecial;
    Button buttonPekingBeef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_specialty_dinner);


        buttonSesameChickenDinner = findViewById(R.id.buttonSesameChickenDinner);
        CartItem sesameChickenDinnerItem = new CartItem("Sesame Chicken Dinner", 10.95);
        addItem(buttonSesameChickenDinner, sesameChickenDinnerItem);

        buttonGeneralTsoChickenDinner = findViewById(R.id.buttonGeneralTsoChickenDinner);
        CartItem generalTsoChickenDinnerItem = new CartItem("General Tso's Chicken Dinner", 10.95);
        addItem(buttonGeneralTsoChickenDinner, generalTsoChickenDinnerItem);

        buttonOrangeChickenDinner = findViewById(R.id.buttonOrangeChickenDinner);
        CartItem orangeChickenDinnerItem = new CartItem("Orange Chicken Dinner", 10.95);
        addItem(buttonOrangeChickenDinner, orangeChickenDinnerItem);

        buttonChickenShrimpSupremeDinner = findViewById(R.id.buttonChickenShrimpSupremeDinner);
        CartItem chickenShrimpSupremeItem = new CartItem("Chicken & Shrimp Supreme", 12.95);
        addItem(buttonChickenShrimpSupremeDinner, chickenShrimpSupremeItem);

        buttonTripleDelightDinner = findViewById(R.id.buttonTripleDelightDinner);
        CartItem tripleDelightItem = new CartItem("Triple Delight", 13.95);
        addItem(buttonTripleDelightDinner, tripleDelightItem);

        buttonKingsTofu = findViewById(R.id.buttonKingsTofu);
        CartItem kingsTofuItem = new CartItem("King's Tofu", 13.95);
        addItem(buttonKingsTofu, kingsTofuItem);

        buttonHappyFamilyDinner = findViewById(R.id.buttonHappyFamilyDinner);
        CartItem happyFamilyItem = new CartItem("Happy Family", 13.95);
        addItem(buttonHappyFamilyDinner, happyFamilyItem);

        buttonDragonPhoenixDinner = findViewById(R.id.buttonDragonPhoenixDinner);
        CartItem dragonPhoenixItem = new CartItem("Dragon & Phoenix",13.95);
        addItem(buttonDragonPhoenixDinner, dragonPhoenixItem);

        buttonSeafoodDelightDinner = findViewById(R.id.buttonSeafoodDelightDinner);
        CartItem seafoodDelightItem = new CartItem("Seafood Delight", 13.95);
        addItem(buttonSeafoodDelightDinner, seafoodDelightItem);

        buttonOrangeBeefChefSpecial = findViewById(R.id.buttonOrangeBeefChefSpecial);
        CartItem orangeBeefItem = new CartItem("Orange Beef", 12.95);
        addItem(buttonOrangeBeefChefSpecial, orangeBeefItem);

        buttonBlackPepperDicedChickenChefSpecial = findViewById(R.id.buttonBlackPepperDicedChickenChefSpecial);
        CartItem blackPepperDicedChickenItem = new CartItem("Black Pepper Diced Chicken", 12.95);
        addItem(buttonBlackPepperDicedChickenChefSpecial, blackPepperDicedChickenItem);

        buttonPekingBeef = findViewById(R.id.buttonPekingBeef);
        CartItem pekingBeefItem = new CartItem("Peking Beef", 13.95);
        addItem(buttonPekingBeef, pekingBeefItem);

    }

    CartItem item;
    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    setItem(item);
                    startActivityForResult(new Intent(view.getContext(), ChineseSides.class), 1);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ChineseSides chn = new ChineseSides();
        item.setSides(ChineseSides.returnSides());
        ChineseSides.resetSides();
        CartItems.currentCart.add(item);
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}

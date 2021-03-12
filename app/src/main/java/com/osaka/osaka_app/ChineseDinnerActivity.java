package com.osaka.osaka_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class ChineseDinnerActivity extends AppCompatActivity {

    Button buttonChickenBroccoli;
    Button buttonSweetSourChicken;
    Button buttonChickenCashewNut;
    Button buttonKungPaoChicken;
    Button buttonMooGooGaiPan;
    Button buttonChickenGarlicSauce;
    Button buttonChickenMixedVegetables;
    Button buttonRoastPorkBroccoli;
    Button buttonRoastPorkGarlicSauce;
    Button buttonRoastPorkMixedVegetables;
    Button buttonPepperChicken;
    Button buttonHunanChicken;
    Button buttonMongolianChicken;
    Button buttonHoneyChicken;
    Button buttonCantoneseChicken;
    Button buttonBeefMixedVegetables;
    Button buttonHunanBeef;
    Button buttonBeefBroccoli;
    Button buttonPepperSteakOnion;
    Button buttonMongolianBeef;
    Button buttonBeefGarlicSauce;
    Button buttonShrimpBroccoli;
    Button buttonKungPaoShrimp;
    Button buttonHunanShrimp;
    Button buttonShrimpGarlicSauce;
    Button buttonShrimpCashewNuts;
    Button buttonShrimpMixedVegetables;
    Button buttonShrimpLobsterSauce;
    Button buttonSweetSourShrimp;
    Button buttonScallopBroccoli;
    Button buttonHunanScallop;
    Button buttonScallopGarlicSauce;
    Button buttonScallopMixedVegetables;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_dinner);

        //initialize the button
        buttonChickenBroccoli = findViewById(R.id.buttonChickenBroccoli);
        //next create a cartitem of that food
        CartItem chickenBroccoliItem = new CartItem("Chicken w. Broccoli", 10.95);
        //then set the function so when the button is pressed, that cartitem is added to
        //the cartItems list of food for the current user.
        addItem(buttonChickenBroccoli, chickenBroccoliItem);

        buttonSweetSourChicken = findViewById(R.id.buttonSweetSourChicken);
        CartItem sweetSourChickenItem = new CartItem("Sweet & Sour Chicken", 10.95);
        addItem(buttonSweetSourChicken, sweetSourChickenItem);

        buttonChickenCashewNut = findViewById(R.id.buttonChickenCashewNut);
        CartItem chickenCashewNutItem = new CartItem("Chicken w. Cashew Nuts", 10.95);
        addItem(buttonChickenCashewNut, chickenCashewNutItem);

        buttonKungPaoChicken = findViewById(R.id.buttonKungPaoChicken);
        CartItem kungPaoChickenItem = new CartItem("Kung Pao Chicken", 10.95);
        addItem(buttonKungPaoChicken, kungPaoChickenItem);

        buttonMooGooGaiPan = findViewById(R.id.buttonMooGooGaiPan);
        CartItem mooGooGaiPanItem = new CartItem("Moo Goo Gai Pan", 10.95);
        addItem(buttonMooGooGaiPan, mooGooGaiPanItem);

        buttonChickenGarlicSauce = findViewById(R.id.buttonChickenGarlicSauce);
        CartItem chickenGarlicSauceItem = new CartItem("Chicken w. Garlic Sauce", 10.95);
        addItem(buttonChickenGarlicSauce, chickenGarlicSauceItem);

        buttonChickenMixedVegetables = findViewById(R.id.buttonChickenMixedVegetables);
        CartItem chickenMixedVegetablesItem = new CartItem("Chicken w. Mixed Vegetables", 10.95);
        addItem(buttonChickenMixedVegetables, chickenMixedVegetablesItem);

        buttonRoastPorkBroccoli = findViewById(R.id.buttonRoastPorkBroccoli);
        CartItem roastPorkBroccoliItem = new CartItem("Roast Pork w. Broccoli", 10.95);
        addItem(buttonRoastPorkBroccoli, roastPorkBroccoliItem);

        buttonRoastPorkGarlicSauce = findViewById(R.id.buttonRoastPorkGarlicSauce);
        CartItem roastPorkGarlicSauceItem = new CartItem("Roast pork w. Garlic Sauce", 10.95);
        addItem(buttonRoastPorkGarlicSauce, roastPorkGarlicSauceItem);

        buttonRoastPorkMixedVegetables = findViewById(R.id.buttonRoastPorkMixedVegetables);
        CartItem roastPorkMixedVegetablesItem = new CartItem("Roast Pork w. Mixed Vegetables", 10.95);
        addItem(buttonRoastPorkMixedVegetables, roastPorkMixedVegetablesItem);

        buttonPepperChicken = findViewById(R.id.buttonPepperChicken);
        CartItem pepperChickenItem = new CartItem("Pepper Chicken", 10.95);
        addItem(buttonPepperChicken, pepperChickenItem);

        buttonHunanChicken = findViewById(R.id.buttonHunanChicken);
        CartItem hunanChickenItem = new CartItem("Hunan Chicken", 10.95);
        addItem(buttonHunanChicken, hunanChickenItem);

        buttonMongolianChicken = findViewById(R.id.buttonMongolianChicken);
        CartItem mongolianChickenItem = new CartItem("Mongolian Chicken", 10.95);
        addItem(buttonMongolianChicken, mongolianChickenItem);

        buttonHoneyChicken = findViewById(R.id.buttonHoneyChicken);
        CartItem honeyChickenItem = new CartItem("Honey Chicken", 10.95);
        addItem(buttonHoneyChicken, honeyChickenItem);

        buttonCantoneseChicken = findViewById(R.id.buttonCantoneseChicken);
        CartItem cantoneseChickenItem = new CartItem("Cantonese Chicken", 10.95);
        addItem(buttonCantoneseChicken, cantoneseChickenItem);

        buttonBeefMixedVegetables = findViewById(R.id.buttonBeefMixedVegetables);
        CartItem beefMixedVegetablesItem = new CartItem("Beef w. Mixed Vegetables", 11.95);
        addItem(buttonBeefMixedVegetables, beefMixedVegetablesItem);

        buttonHunanBeef = findViewById(R.id.buttonHunanBeef);
        CartItem hunanBeefItem = new CartItem("Hunan Beef", 11.95);
        addItem(buttonHunanBeef, hunanBeefItem);

        buttonBeefBroccoli = findViewById(R.id.buttonBeefBroccoli);
        CartItem beefBroccoliItem = new CartItem("Beef w. Broccoli", 11.95);
        addItem(buttonBeefBroccoli, beefBroccoliItem);

        buttonPepperSteakOnion = findViewById(R.id.buttonPepperSteakOnion);
        CartItem pepperSteakOnionItem = new CartItem("Pepper Steak w. Onion", 11.95);
        addItem(buttonPepperSteakOnion, pepperSteakOnionItem);

        buttonMongolianBeef = findViewById(R.id.buttonMongolianBeef);
        CartItem mongolianBeefItem = new CartItem("Mongolian Beef", 11.95);
        addItem(buttonMongolianBeef, mongolianBeefItem);

        buttonBeefGarlicSauce = findViewById(R.id.buttonBeefGarlicSauce);
        CartItem beefGarlicSauceItem = new CartItem("Beef w. Garlic Sauce", 11.95);
        addItem(buttonBeefGarlicSauce, beefGarlicSauceItem);

        buttonShrimpBroccoli = findViewById(R.id.buttonShrimpBroccoli);
        CartItem shrimpBroccoliItem = new CartItem("Shrimp w. Broccoli", 11.95);
        addItem(buttonShrimpBroccoli, shrimpBroccoliItem);

        buttonKungPaoShrimp = findViewById(R.id.buttonKungPaoShrimp);
        CartItem kungPaoShrimpItem = new CartItem("Kung Pao Shrimp", 11.95);
        addItem(buttonKungPaoShrimp, kungPaoShrimpItem);

        buttonHunanShrimp = findViewById(R.id.buttonHunanShrimp);
        CartItem hunanShrimpItem = new CartItem("Hunan Shrimp", 11.95);
        addItem(buttonHunanShrimp, hunanShrimpItem);

        buttonShrimpGarlicSauce = findViewById(R.id.buttonShrimpGarlicSauce);
        CartItem shrimpGarlicSauceItem = new CartItem("Shrimp w. Garlic Sauce", 11.95);
        addItem(buttonShrimpGarlicSauce, shrimpGarlicSauceItem);

        buttonShrimpCashewNuts = findViewById(R.id.buttonShrimpCashewNuts);
        CartItem shrimpCashewNutsitem = new CartItem("Shrimp w. Cashew Nuts", 11.95);
        addItem(buttonShrimpCashewNuts, shrimpCashewNutsitem);

        buttonShrimpMixedVegetables = findViewById(R.id.buttonShrimpMixedVegetables);
        CartItem shrimpMixedVegetablesItem = new CartItem("Shrimp w. Mixed Vegetables", 11.95);
        addItem(buttonShrimpMixedVegetables, shrimpMixedVegetablesItem);

        buttonShrimpLobsterSauce = findViewById(R.id.buttonShrimpLobsterSauce);
        CartItem shrimpLobsterSauceItem = new CartItem("Shrimp w. Lobster Sauce", 11.95);
        addItem(buttonShrimpLobsterSauce, shrimpLobsterSauceItem);

        buttonSweetSourShrimp = findViewById(R.id.buttonSweetSourShrimp);
        CartItem sweetSourShrimpItem = new CartItem("Sweet & Sour Shrimp", 11.95);
        addItem(buttonSweetSourShrimp, sweetSourShrimpItem);

        buttonScallopBroccoli = findViewById(R.id.buttonScallopBroccoli);
        CartItem scallopBroccoliItem = new CartItem("Scallop w. Broccoli", 12.95);
        addItem(buttonScallopBroccoli, scallopBroccoliItem);

        buttonHunanScallop = findViewById(R.id.buttonHunanScallop);
        CartItem hunanScallopItem = new CartItem("Scallop Hunan Style", 12.95);
        addItem(buttonHunanScallop, hunanScallopItem);

        buttonScallopGarlicSauce = findViewById(R.id.buttonScallopGarlicSauce);
        CartItem scallopGarlicSauceItem = new CartItem("Scallop w. Garlic Sauce", 12.95);
        addItem(buttonScallopGarlicSauce, scallopGarlicSauceItem);

        buttonScallopMixedVegetables = findViewById(R.id.buttonScallopMixedVegetables);
        CartItem scallopMixedVegetablesItem = new CartItem("Scallop w. Mixed Vegetables", 12.95);
        addItem(buttonScallopMixedVegetables, scallopMixedVegetablesItem);
    }

    CartItem item;
    public synchronized void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    setItem(item);
                    startActivityForResult(new Intent(view.getContext(), ChineseSides.class), 1);
                    //after execution it calls onActivityResult() to add the sides to the CartItem.
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

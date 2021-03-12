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
public class ChineseLunchActivity extends AppCompatActivity {

    Button buttonMixedGardenVegetablesLunch;
    Button buttonTofuWithGarlicSauceLunch;
    Button buttonVegetableLoMeinLunch;
    Button buttonChickenLoMeinLunch;
    Button buttonGeneralTsoTofuLunch;
    Button buttonBroccoliGarlicSaucelunch;
    Button buttonSweetSourChickenLunch;
    Button buttonHoneyChickenLunch;
    Button buttonMooGooGaiPanLunch;
    Button buttonChickenBroccoliLunch;
    Button buttonRoastPorkBroccoliLunch;
    Button buttonShrimpLoMeinLunch;
    Button buttonBeefLoMeinLunch;
    Button buttonRoastPorkLoMeinLunch;
    Button buttonKungPaoChickenLunch;
    Button buttonChickenGarlicSauceLunch;
    Button buttonChickenCashewNutLunch;
    Button buttonChickenVegetablesLunch;
    Button buttonSesameChickenLunch;
    Button buttonGeneralTsoChickenLunch;
    Button buttonHunanChickenLunch;
    Button buttonRoastPorkMixedVegetablesLunch;
    Button buttonRoastPorkGarlicSauceLunch;
    Button buttonBeefBroccoliLunch;
    Button buttonBeefGarlicSauceLunch;
    Button buttonPepperSteakOnionLunch;
    Button buttonHunanBeefLunch;
    Button buttonHunanShrimpLunch;
    Button buttonBeefMixedVegetablesLunch;
    Button buttonMongolianBeefLunch;
    Button buttonShrimpBroccoliLunch;
    Button buttonShrimpGarlicSauceLunch;
    Button buttonTripleGreenShrimpLunch;
    Button buttonShrimpCashewNutsLunch;
    Button buttonKungPaoShrimpLunch;
    Button buttonShrimpLobstersauceLunch;
    Button buttonDoubleDelightLunch;
    Button buttonBroccoliTripleDelightLunch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_lunch);

        buttonMixedGardenVegetablesLunch = findViewById(R.id.buttonMixedGardenVegetablesLunch);
        CartItem mixedGardenVegetablesLunch = new CartItem("Lunch Mixed Garden Vegetables", 6.95);
        addItem(buttonMixedGardenVegetablesLunch, mixedGardenVegetablesLunch);

        buttonTofuWithGarlicSauceLunch = findViewById(R.id.buttonTofuWithGarlicSauceLunch);
        CartItem tofuWithGarlicSauceLunch = new CartItem("Lunch Tofu w. Garlic Sauce", 6.95);
        addItem(buttonTofuWithGarlicSauceLunch, tofuWithGarlicSauceLunch);

        buttonVegetableLoMeinLunch = findViewById(R.id.buttonVegetableLoMeinLunch);
        CartItem vegetableLoMeinLunch = new CartItem("Lunch Vegetable Lo Mein", 6.95);
        addItem(buttonVegetableLoMeinLunch, vegetableLoMeinLunch);

        buttonChickenLoMeinLunch = findViewById(R.id.buttonChickenLoMeinLunch);
        CartItem chickenLoMeinLunch = new CartItem("Lunch Chicken Lo Mein", 6.95);
        addItem(buttonChickenLoMeinLunch, chickenLoMeinLunch);

        buttonGeneralTsoTofuLunch = findViewById(R.id.buttonGeneralTsoTofuLunch);
        CartItem generaltsoTofuLunch = new CartItem("Lunch General Tso's Tofu", 6.95);
        addItem(buttonGeneralTsoTofuLunch, generaltsoTofuLunch);

        buttonBroccoliGarlicSaucelunch = findViewById(R.id.buttonBroccoliGarlicSauceLunch);
        CartItem broccoliGarlicSauceLunch = new CartItem("Lunch Broccoli w. Garlic Sauce", 6.95);
        addItem(buttonBroccoliGarlicSaucelunch, broccoliGarlicSauceLunch);

        buttonSweetSourChickenLunch = findViewById(R.id.buttonSweetSourChickenLunch);
        CartItem sweetSourChickenLunch = new CartItem("Lunch Sweet & Sour Chicken", 6.95);
        addItem(buttonSweetSourChickenLunch, sweetSourChickenLunch);

        buttonHoneyChickenLunch = findViewById(R.id.buttonHoneyChickenLunch);
        CartItem honeyChickenLunch = new CartItem("Lunch Honey Chicken", 6.95);
        addItem(buttonHoneyChickenLunch, honeyChickenLunch);

        buttonMooGooGaiPanLunch = findViewById(R.id.buttonMooGooGaiPanLunch);
        CartItem mooGooGaiPanLunch = new CartItem("Lunch Moo Goo Gai Pan", 6.95);
        addItem(buttonMooGooGaiPanLunch, mooGooGaiPanLunch);

        buttonChickenBroccoliLunch = findViewById(R.id.buttonChickenBroccoliLunch);
        CartItem chickenBroccoliLunch = new CartItem("Lunch Chicken w. Broccoli", 6.95);
        addItem(buttonChickenBroccoliLunch, chickenBroccoliLunch);

        buttonRoastPorkBroccoliLunch = findViewById(R.id.buttonRoastPorkBroccoliLunch);
        CartItem roastPorkBroccoliLunch = new CartItem("Lunch Roast Pork w. Broccoli", 6.95);
        addItem(buttonRoastPorkBroccoliLunch, roastPorkBroccoliLunch);

        buttonShrimpLoMeinLunch = findViewById(R.id.buttonShrimpLoMeinLunch);
        CartItem shrimpLoMeinLunch = new CartItem("Lunch Shrimp Lo Mein", 6.95);
        addItem(buttonShrimpLoMeinLunch, shrimpLoMeinLunch);

        buttonBeefLoMeinLunch = findViewById(R.id.buttonBeefLomeinLunch);
        CartItem beefLoMeinLunch = new CartItem("Lunch Beef Lo Mein", 6.95);
        addItem(buttonBeefLoMeinLunch, beefLoMeinLunch);

        buttonRoastPorkLoMeinLunch = findViewById(R.id.buttonRoastPorkLoMeinLunch);
        CartItem roastPorkLoMeinLunch = new CartItem("Lunch Roast Pork Lo Mein", 6.95);
        addItem(buttonRoastPorkLoMeinLunch, roastPorkLoMeinLunch);

        buttonKungPaoChickenLunch = findViewById(R.id.buttonKungPaoChickenLunch);
        CartItem kungPaoChickenLunch = new CartItem("Lunch Kung Pao Chicken", 6.95);
        addItem(buttonKungPaoChickenLunch, kungPaoChickenLunch);

        buttonChickenGarlicSauceLunch = findViewById(R.id.buttonChickenGarlicSauceLunch);
        CartItem chickenGarlicSauceLunch = new CartItem("Lunch Chicken w. Garlic Sauce", 6.95);
        addItem(buttonChickenGarlicSauceLunch, chickenGarlicSauceLunch);

        buttonChickenCashewNutLunch = findViewById(R.id.buttonChickenCashewNutLunch);
        CartItem chickenCashewNutLunch = new CartItem("Lunch Chicken w. Cashew Nuts", 6.95);
        addItem(buttonChickenCashewNutLunch, chickenCashewNutLunch);

        buttonChickenVegetablesLunch = findViewById(R.id.buttonChickenVegetablesLunch);
        CartItem chickenVegetablesLunch = new CartItem("Lunch Chicken w. Mixed Vegetables", 6.95);
        addItem(buttonChickenVegetablesLunch, chickenVegetablesLunch);

        buttonSesameChickenLunch = findViewById(R.id.buttonSesameChickenLunch);
        CartItem sesameChickenLunch = new CartItem("Lunch Sesame Chicken", 6.95);
        addItem(buttonSesameChickenLunch, sesameChickenLunch);

        buttonGeneralTsoChickenLunch = findViewById(R.id.buttonGeneralTsoChickenLunch);
        CartItem generalTsoChickenLunch = new CartItem("Lunch General Tso's Chicken", 6.95);
        addItem(buttonGeneralTsoChickenLunch, generalTsoChickenLunch);

        buttonHunanChickenLunch = findViewById(R.id.buttonHunanChickenLunch);
        CartItem hunanChickenLunch = new CartItem("Lunch Hunan Chicken", 6.95);
        addItem(buttonHunanChickenLunch, hunanChickenLunch);

        buttonRoastPorkMixedVegetablesLunch = findViewById(R.id.buttonRoastPorkMixedVegetablesLunch);
        CartItem roastPorkMixedVegetableslunch = new CartItem("Lunch Roast Pork w. Mixed Vegetables", 6.95);
        addItem(buttonRoastPorkMixedVegetablesLunch, roastPorkMixedVegetableslunch);

        buttonRoastPorkGarlicSauceLunch = findViewById(R.id.buttonRoastPorkGarlicSauceLunch);
        CartItem roastPorkGarlicSauceLunch = new CartItem("Lunch Roast Pork w. Garlic Sauce", 6.95);
        addItem(buttonRoastPorkGarlicSauceLunch, roastPorkGarlicSauceLunch);

        buttonBeefBroccoliLunch = findViewById(R.id.buttonBeefBroccoliLunch);
        CartItem beefBroccoliLunch = new CartItem("Lunch Beef w. Broccoli", 6.95);
        addItem(buttonBeefBroccoliLunch, beefBroccoliLunch);

        buttonBeefGarlicSauceLunch = findViewById(R.id.buttonBeefGarlicSauceLunch);
        CartItem beefGarlicSauceLunch = new CartItem("Lunch Beef w. Garlic Sauce", 6.95);
        addItem(buttonBeefGarlicSauceLunch, beefGarlicSauceLunch);

        buttonPepperSteakOnionLunch = findViewById(R.id.buttonPepperSteakOnionLunch);
        CartItem pepperSteakOnionLunch = new CartItem("Lunch Pepper Steak w. Onion", 6.95);
        addItem(buttonPepperSteakOnionLunch, pepperSteakOnionLunch);

        buttonHunanBeefLunch = findViewById(R.id.buttonHunanBeefLunch);
        CartItem hunanBeefLunch = new CartItem("Lunch Hunan Beef", 6.95);
        addItem(buttonHunanBeefLunch, hunanBeefLunch);

        buttonHunanShrimpLunch = findViewById(R.id.buttonHunanShrimpLunch);
        CartItem hunanShrimpLunch = new CartItem("Lunch Hunan Shrimp", 6.95);
        addItem(buttonHunanShrimpLunch, hunanShrimpLunch);

        buttonBeefMixedVegetablesLunch = findViewById(R.id.buttonBeefMixedVegetablesLunch);
        CartItem beefMixedVegetablesLunch = new CartItem("Lunch Beef w. Mixed Vegetables", 6.95);
        addItem(buttonBeefMixedVegetablesLunch, beefMixedVegetablesLunch);

        buttonMongolianBeefLunch = findViewById(R.id.buttonMongolianBeefLunch);
        CartItem mongolianBeefLunch = new CartItem("Lunch Mongolian Beef", 6.95);
        addItem(buttonMongolianBeefLunch, mongolianBeefLunch);

        buttonShrimpBroccoliLunch = findViewById(R.id.buttonShrimpBroccoliLunch);
        CartItem shrimpBroccoliLunch = new CartItem("Lunch Shrimp w. Broccoli", 6.95);
        addItem(buttonShrimpBroccoliLunch, shrimpBroccoliLunch);

        buttonShrimpGarlicSauceLunch = findViewById(R.id.buttonShrimpGarlicSauceLunch);
        CartItem shrimpGarlicSauceLunch = new CartItem("Lunch Shrimp w. Garlic Sauce", 6.95);
        addItem(buttonShrimpGarlicSauceLunch, shrimpGarlicSauceLunch);

        buttonTripleGreenShrimpLunch = findViewById(R.id.buttonTripleGreenShrimpLunch);
        CartItem tripleGreenShrimpLunch = new CartItem("Lunch Triple Green Shrimp", 6.95);
        addItem(buttonTripleGreenShrimpLunch, tripleGreenShrimpLunch);

        buttonShrimpCashewNutsLunch = findViewById(R.id.buttonShrimpCashewNutsLunch);
        CartItem shrimpCashewNutsLunch = new CartItem("Lunch Shrimp w. Cashew Nuts", 6.95);
        addItem(buttonShrimpCashewNutsLunch, shrimpCashewNutsLunch);

        buttonKungPaoShrimpLunch = findViewById(R.id.buttonKungPaoShrimpLunch);
        CartItem kungPaoShrimpLunch = new CartItem("Lunch Kung Pao Shrimp", 6.95);
        addItem(buttonKungPaoShrimpLunch, kungPaoShrimpLunch);

        buttonShrimpLobstersauceLunch = findViewById(R.id.buttonShrimpLobsterSauceLunch);
        CartItem shrimpLobstersauceLunch = new CartItem("Lunch Shrimp w. Lobster sauce", 6.95);
        addItem(buttonShrimpLobstersauceLunch, shrimpLobstersauceLunch);

        buttonDoubleDelightLunch = findViewById(R.id.buttonDoubleDelightLunch);
        CartItem doubleDelightLunch = new CartItem("Lunch Double Delight", 7.95);
        addItem(buttonDoubleDelightLunch, doubleDelightLunch);

        buttonBroccoliTripleDelightLunch = findViewById(R.id.buttonBroccoliTripleDelightLunch);
        CartItem broccoliTripleDelightLunch = new CartItem("Lunch Broccoli Triple Delight", 8.75);
        addItem(buttonBroccoliTripleDelightLunch, broccoliTripleDelightLunch);

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

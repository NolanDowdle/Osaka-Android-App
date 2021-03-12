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
public class RegularSushi extends AppCompatActivity {

    Button buttonCucumberRoll;
    Button buttonVegetableRoll;
    Button buttonAvocadoRoll;
    Button buttonACCRoll;
    Button buttonCaliforniaRoll;
    Button buttonPhillyRoll;
    Button buttonSalmonRoll;
    Button buttonShrimpTempuraRoll;
    Button buttonBostonRoll;
    Button buttonSpecialCrabRoll;
    Button buttonSpicyYellowtailRoll;
    Button buttonSalmonAvocadoRoll;
    Button buttonTunaAvocadoRoll;
    Button buttonSeaweedSaladRoll;
    Button buttonSpicyTunaRoll;
    Button buttonSpicySalmonRoll;
    Button buttonTunaRoll;
    Button buttonEelAvocadoRoll;
    Button buttonEelCucumberRoll;
    Button buttonCrunchyRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_sushi);

        buttonCucumberRoll = findViewById(R.id.buttonCucumberRoll);
        CartItem cucumberRoll = new CartItem("Cucumber Roll", 4.50);
        addItem(buttonCucumberRoll, cucumberRoll);

        buttonVegetableRoll = findViewById(R.id.buttonVegetableSushiRoll);
        CartItem vegetableRoll = new CartItem("Vegetable Roll", 4.50);
        addItem(buttonVegetableRoll, vegetableRoll);

        buttonAvocadoRoll = findViewById(R.id.buttonAvocadoSushiRoll);
        CartItem avocadoRoll = new CartItem("Avocado Roll", 4.50);
        addItem(buttonAvocadoRoll, avocadoRoll);

        buttonACCRoll = findViewById(R.id.buttonACCRoll);
        CartItem accRoll = new CartItem("ACC Roll", 4.50);
        addItem(buttonACCRoll, accRoll);

        buttonCaliforniaRoll = findViewById(R.id.buttonCaliforniaRoll);
        CartItem californiaRoll = new CartItem("California Roll", 4.95);
        addItem(buttonCaliforniaRoll, californiaRoll);

        buttonPhillyRoll = findViewById(R.id.buttonPhillyRoll);
        CartItem phillyRoll = new CartItem("Philly Roll", 5.50);
        addItem(buttonPhillyRoll, phillyRoll);

        buttonSalmonRoll = findViewById(R.id.buttonSalmonRoll);
        CartItem salmonRoll = new CartItem("Salmon Roll", 5.50);
        addItem(buttonSalmonRoll, salmonRoll);

        buttonShrimpTempuraRoll = findViewById(R.id.buttonShrimpTempuraRoll);
        CartItem shrimpTempuraRoll = new CartItem("Shrimp Tempura Roll", 5.95);
        addItem(buttonShrimpTempuraRoll, shrimpTempuraRoll);

        buttonBostonRoll = findViewById(R.id.buttonBostonRoll);
        CartItem bostonRoll = new CartItem("Boston Roll", 5.50);
        addItem(buttonBostonRoll, bostonRoll);

        buttonSpecialCrabRoll = findViewById(R.id.buttonSpecialCrabRoll);
        CartItem specialCrabRoll = new CartItem("Special Crab Roll", 5.95);
        addItem(buttonSpecialCrabRoll, specialCrabRoll);

        buttonSpicyYellowtailRoll = findViewById(R.id.buttonSpicyYellowtailRoll);
        CartItem spicyYellowtailRoll = new CartItem("Spicy Yellowtail Roll", 5.50);
        addItem(buttonSpicyYellowtailRoll, spicyYellowtailRoll);

        buttonSalmonAvocadoRoll = findViewById(R.id.buttonSalmonAvocadoRoll);
        CartItem salmonAvocadoRoll = new CartItem("Salmon Avocado Roll", 5.50);
        addItem(buttonSalmonAvocadoRoll, salmonAvocadoRoll);

        buttonTunaAvocadoRoll = findViewById(R.id.buttonTunaAvocadoRoll);
        CartItem tunaAvocadoRoll = new CartItem("Tuna Avocado Roll", 5.50);
        addItem(buttonTunaAvocadoRoll, tunaAvocadoRoll);

        buttonSeaweedSaladRoll = findViewById(R.id.buttonSeaweedSaladSushiRoll);
        CartItem seaweedSaladRoll = new CartItem("Seaweed Salad Roll", 4.50);
        addItem(buttonSeaweedSaladRoll, seaweedSaladRoll);

        buttonSpicyTunaRoll = findViewById(R.id.buttonSpicyTunaRoll);
        CartItem spicyTunaRoll = new CartItem("Spicy Tuna Roll", 5.50);
        addItem(buttonSpicyTunaRoll, spicyTunaRoll);

        buttonSpicySalmonRoll = findViewById(R.id.buttonSpicySalmonRoll);
        CartItem spicySalmonRoll = new CartItem("Spicy Salmon Roll", 5.50);
        addItem(buttonSpicySalmonRoll, spicySalmonRoll);

        buttonTunaRoll = findViewById(R.id.buttonTunaRoll);
        CartItem tunaRoll = new CartItem("Tuna Roll", 5.50);
        addItem(buttonTunaRoll, tunaRoll);

        buttonEelAvocadoRoll = findViewById(R.id.buttonEelAvocadoRoll);
        CartItem eelAvocadoRoll = new CartItem("Eel Avocado Roll", 5.50);
        addItem(buttonEelAvocadoRoll, eelAvocadoRoll);

        buttonEelCucumberRoll = findViewById(R.id.buttonEelCucumberRoll);
        CartItem eelCucumberRoll = new CartItem("Eel Cucumber Roll", 5.50);
        addItem(buttonEelCucumberRoll, eelCucumberRoll);

        buttonCrunchyRoll = findViewById(R.id.buttonCrunchyRoll);
        CartItem crunchyRoll = new CartItem("Crunchy Roll", 5.95);
        addItem(buttonCrunchyRoll, crunchyRoll);
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

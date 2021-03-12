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
public class HibachiDinnerActivity extends AppCompatActivity {
    //order button numbers from very top button on the view
    //to the very bottom button on the view
    Button buttonHibachiVegetableDinner;
    Button buttonHibachiTofuDinner;
    Button buttonTeriyakiChickenDinner;
    Button buttonHibachiChickenDinner;
    Button buttonHibachiYakiDinner;
    Button buttonHibachiShrimpDinner;
    Button buttonHibachiScallopDinner;
    Button buttonHibachiSteakDinner;
    Button buttonTeriyakiSteakDinner;
    Button buttonHibachiChickenShrimpDinner;
    Button buttonHibachiChickenSteakDinner;
    Button buttonHibachiChickenYakiDinner;
    Button buttonHibachiSteakShrimpDinner;
    Button buttonHibachiChickenScallopDinner;
    Button buttonHibachiSteakScallopDinner;
    Button buttonHibachiShrimpScallopDinner;
    Button buttonHibachiYakiShrimpDinner;
    Button buttonHibachiChickenSteakShrimpDinner;

    ConnectToDB connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hibachi_dinner);

        /*connection = new ConnectToDB();
        ResultSet items = connection.getRS();*/

        //initialize all buttons
        buttonHibachiVegetableDinner = findViewById(R.id.buttonHibachiVegetableDinner);
        CartItem hibachiItem = new CartItem("Hibachi Vegetable Dinner", 9.95);
        addItem(buttonHibachiVegetableDinner, hibachiItem);

        //CartItem hibachiItem = new CartItem(items.absolute(64), items.)
        buttonHibachiTofuDinner = findViewById(R.id.buttonHibachiTofuDinner);
        CartItem hibachiTofuItem = new CartItem("Hibachi Tofu Dinner", 9.95);
        addItem(buttonHibachiTofuDinner, hibachiTofuItem);

        buttonTeriyakiChickenDinner = findViewById(R.id.buttonTeriyakiChickenDinner);
        CartItem teriyakiChickenItem = new CartItem("Teriyaki Chicken Dinner", 10.95);
        addItem(buttonTeriyakiChickenDinner, teriyakiChickenItem);

        buttonHibachiChickenDinner = findViewById(R.id.buttonHibachiChickenDinner);
        CartItem hibachiChickenItem = new CartItem("Hibachi Chicken Dinner", 10.95);
        addItem(buttonHibachiChickenDinner, hibachiChickenItem);

        buttonHibachiYakiDinner = findViewById(R.id.buttonHibachiYakiDinner);
        CartItem hibachiYakiDinner = new CartItem("Hibachi Yaki Dinner", 13.50);
        addItem(buttonHibachiYakiDinner, hibachiYakiDinner);

        buttonHibachiShrimpDinner = findViewById(R.id.buttonHibachiShrimpDinner);
        CartItem hibachiShrimpDinner = new CartItem("Hibachi Shrimp Dinner", 12.95);
        addItem(buttonHibachiShrimpDinner, hibachiShrimpDinner);

        buttonHibachiScallopDinner = findViewById(R.id.buttonHibachiScallopDinner);
        CartItem hibachiScallopDinner = new CartItem("Hibachi Scallop Dinner", 15.95);
        addItem(buttonHibachiScallopDinner, hibachiScallopDinner);

        buttonHibachiSteakDinner = findViewById(R.id.buttonHibachiSteakDinner);
        CartItem hibachiSteakDinner = new CartItem("Hibachi Steak Dinner", 13.50);
        addItem(buttonHibachiSteakDinner, hibachiSteakDinner);

        buttonTeriyakiSteakDinner = findViewById(R.id.buttonTeriyakiSteakDinner);
        CartItem teriyakiSteakDinner = new CartItem("Teriyaki Steak Dinner", 13.50);
        addItem(buttonTeriyakiSteakDinner, teriyakiSteakDinner);

        buttonHibachiChickenShrimpDinner = findViewById(R.id.buttonHibachiChickenShrimpDinner);
        CartItem hibachiChickenShrimpDinner = new CartItem("Hibachi Chicken & Shrimp Dinner", 15.25);
        addItem(buttonHibachiChickenShrimpDinner, hibachiChickenShrimpDinner);

        buttonHibachiChickenSteakDinner = findViewById(R.id.buttonHibachiChickenSteakDinner);
        CartItem hibachiChickenSteakDinner = new CartItem("Hibachi Chicken & Steak Dinner", 15.25);
        addItem(buttonHibachiChickenSteakDinner, hibachiChickenSteakDinner);

        buttonHibachiChickenYakiDinner = findViewById(R.id.buttonHibachiChickenYakiDinner);
        CartItem hibachiChickenYakiDinner = new CartItem("Hibachi Chicken & Yaki Dinner", 15.25);
        addItem(buttonHibachiChickenYakiDinner, hibachiChickenYakiDinner);

        buttonHibachiSteakShrimpDinner = findViewById(R.id.buttonHibachiSteakShrimpDinner);
        CartItem hibachiSteakShrimpDinner = new CartItem("Hibachi Steak & Shrimp Dinner", 17.50);
        addItem(buttonHibachiSteakShrimpDinner, hibachiSteakShrimpDinner);

        buttonHibachiChickenScallopDinner = findViewById(R.id.buttonHibachiChickenScallopDinner);
        CartItem hibachiChickenScallopDinner = new CartItem("Hibachi Chicken & Scallop Dinner", 16.95);
        addItem(buttonHibachiChickenScallopDinner, hibachiChickenScallopDinner);

        buttonHibachiSteakScallopDinner = findViewById(R.id.buttonHibachiSteakScallopDinner);
        CartItem hibachiSteakScallopDinner = new CartItem("Hibachi Steak & Scallop Dinner", 17.25);
        addItem(buttonHibachiSteakScallopDinner, hibachiSteakScallopDinner);

        buttonHibachiShrimpScallopDinner = findViewById(R.id.buttonHibachiShrimpScallopDinner);
        CartItem hibachiShrimpScallopDinner = new CartItem("Hibachi Shrimp & Scallop Dinner", 17.25);
        addItem(buttonHibachiShrimpScallopDinner, hibachiShrimpScallopDinner);

        buttonHibachiYakiShrimpDinner = findViewById(R.id.buttonHibachiYakiShrimpDinner);
        CartItem hibachiYakiShrimpDinner = new CartItem("Hibachi Yaki & Shrimp", 16.95);
        addItem(buttonHibachiYakiShrimpDinner, hibachiYakiShrimpDinner);

        buttonHibachiChickenSteakShrimpDinner = findViewById(R.id.buttonHibachiChickenSteakShrimpDinner);
        CartItem hibachiChickenSteakShrimpDinner = new CartItem("Hibachi Chicken, Steak & Shrimp", 19.95);
        addItem(buttonHibachiChickenSteakDinner, hibachiChickenSteakShrimpDinner);
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

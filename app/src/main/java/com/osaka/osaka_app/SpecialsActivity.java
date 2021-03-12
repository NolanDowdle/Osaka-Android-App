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
public class SpecialsActivity extends AppCompatActivity {

    Button buttonHibachiVegetableToGoSpecial;
    Button buttonHibachiChickenToGoSpecial;
    Button buttonTeriyakiChickenToGoSpecial;
    Button buttonSesameChickenToGoSpecial;
    Button buttonGeneralTsoChickenToGoSpecial;
    Button buttonHibachiShrimpToGoSpecial;
    Button buttonHibachiSteakToGoSpecial;
    Button buttonTeriyakiSteakToGoSpecial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specials);

        buttonHibachiVegetableToGoSpecial = findViewById(R.id.buttonHibachiVegetableToGoSpecial);
        CartItem hibachiVegetableToGoSpecial = new CartItem("6$ Hibachi Vegetable", 6.00);
        addItem(buttonHibachiVegetableToGoSpecial, hibachiVegetableToGoSpecial);

        buttonHibachiChickenToGoSpecial = findViewById(R.id.buttonHibachiChickenToGoSpecial);
        CartItem hibachiChickenToGoSpecial = new CartItem("6$ Hibachi Chicken", 6.00);
        addItem(buttonHibachiChickenToGoSpecial, hibachiChickenToGoSpecial);

        buttonTeriyakiChickenToGoSpecial = findViewById(R.id.buttonTeriyakiChickenToGoSpecial);
        CartItem teriyakiChickenToGoSpecial = new CartItem("6$ Teriyaki Chicken", 6.00);
        addItem(buttonTeriyakiChickenToGoSpecial, teriyakiChickenToGoSpecial);

        buttonSesameChickenToGoSpecial = findViewById(R.id.buttonSesameChickenToGoSpecial);
        CartItem sesameChickenToGoSpecial = new CartItem("6$ Sesame Chicken", 6.00);
        addItem(buttonSesameChickenToGoSpecial, sesameChickenToGoSpecial);

        buttonGeneralTsoChickenToGoSpecial = findViewById(R.id.buttonGeneralTsoChickenToGoSpecial);
        CartItem generalTsoChickenToGoSpecial = new CartItem("6$ General Tso's Chicken", 6.00);
        addItem(buttonGeneralTsoChickenToGoSpecial, generalTsoChickenToGoSpecial);

        buttonHibachiShrimpToGoSpecial = findViewById(R.id.buttonHibachiShrimpToGoSpecial);
        CartItem hibachiShrimpToGoSpecial = new CartItem("6$ Hibachi Shrimp Special", 6.95);
        addItem(buttonHibachiShrimpToGoSpecial, hibachiShrimpToGoSpecial);

        buttonHibachiSteakToGoSpecial = findViewById(R.id.buttonHibachiSteakToGoSpecial);
        CartItem hibachiSteakToGoSpecial = new CartItem("6$ Hibachi Steak Special", 6.95);
        addItem(buttonHibachiSteakToGoSpecial, hibachiSteakToGoSpecial);

        buttonTeriyakiSteakToGoSpecial = findViewById(R.id.buttonTeriyakiSteakToGoSpecial);
        CartItem teriyakiSteakToGoSpecial = new CartItem("6$ Teriyaki Steak Special", 6.95);
        addItem(buttonTeriyakiSteakToGoSpecial, teriyakiSteakToGoSpecial);
    }

    CartItem item;
    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    setItem(item);
                    startActivityForResult(new Intent(view.getContext(), SixDollarSpecialSides.class), 1);
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
        item.setSides(SixDollarSpecialSides.returnSides());
        SixDollarSpecialSides.resetSides();
        CartItems.currentCart.add(item);
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}

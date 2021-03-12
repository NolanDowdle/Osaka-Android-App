package com.osaka.osaka_app;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class LoMeinDinnerActivity extends AppCompatActivity {
    Button buttonVegetableLoMein;
    Button buttonChickenLoMein;
    Button buttonRoastPorkLoMein;
    Button buttonShrimpLoMein;
    Button buttonBeefLoMein;
    Button buttonHouseSpecialLoMein;
    Button buttonVegetableFriedRice;
    Button buttonChickenFriedRice;
    Button buttonRoastPorkFriedRice;
    Button buttonShrimpFriedrice;
    Button buttonBeefFriedRice;
    Button buttonHouseSpecialFriedRice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo_mein_dinner);

        buttonVegetableLoMein = findViewById(R.id.buttonVegetableLoMein);
        CartItem vegetableLoMein = new CartItem("Vegetable Lo Mein", 7.50);
        addItem(buttonVegetableLoMein, vegetableLoMein);

        buttonChickenLoMein = findViewById(R.id.buttonChickenLoMein);
        CartItem chickenLoMein = new CartItem("Chicken Lo Mein", 7.95);
        addItem(buttonChickenLoMein, chickenLoMein);

        buttonRoastPorkLoMein = findViewById(R.id.buttonRoastPorkLoMein);
        CartItem roastPorkLoMein = new CartItem("Roast Pork Lo Mein", 7.95);
        addItem(buttonRoastPorkLoMein, roastPorkLoMein);

        buttonShrimpLoMein = findViewById(R.id.buttonShrimpLoMein);
        CartItem shrimpLoMein = new CartItem("Shrimp Lo Mein", 8.75);
        addItem(buttonShrimpLoMein, shrimpLoMein);

        buttonBeefLoMein = findViewById(R.id.buttonBeefLoMein);
        CartItem beefLoMein = new CartItem("Beef Lo Mein", 8.75);
        addItem(buttonBeefLoMein, beefLoMein);

        buttonHouseSpecialLoMein = findViewById(R.id.buttonHouseSpecialLoMein);
        CartItem houseSpecialLoMein = new CartItem("House Special Lo Mein", 10.50);
        addItem(buttonHouseSpecialLoMein, houseSpecialLoMein);

        buttonVegetableFriedRice = findViewById(R.id.buttonVegetableFriedRice);
        CartItem vegetableFriedRice = new CartItem("Vegetable Fried Rice", 6.95);
        addItem(buttonVegetableFriedRice, vegetableFriedRice);

        buttonChickenFriedRice = findViewById(R.id.buttonChickenFriedRice);
        CartItem chickenFriedRice = new CartItem("Chicken Fried Rice", 7.50);
        addItem(buttonChickenFriedRice, chickenFriedRice);

        buttonRoastPorkFriedRice = findViewById(R.id.buttonRoastPorkFriedRice);
        CartItem roastPorkFriedRice = new CartItem("Roast Pork Fried Rice", 7.50);
        addItem(buttonRoastPorkFriedRice, roastPorkFriedRice);

        buttonShrimpFriedrice = findViewById(R.id.buttonShrimpFriedRice);
        CartItem shrimpFriedRice = new CartItem("Shrimp Fried Rice", 8.50);
        addItem(buttonShrimpFriedrice, shrimpFriedRice);

        buttonBeefFriedRice = findViewById(R.id.buttonBeefFriedRice);
        CartItem beefFriedRice = new CartItem("Beef Fried Rice", 8.50);
        addItem(buttonBeefFriedRice, beefFriedRice);

        buttonHouseSpecialFriedRice = findViewById(R.id.buttonHouseSpecialFriedRice);
        CartItem houseSpecialFriedRice = new CartItem("House Special Fried rice", 9.95);
        addItem(buttonHouseSpecialFriedRice, houseSpecialFriedRice);
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

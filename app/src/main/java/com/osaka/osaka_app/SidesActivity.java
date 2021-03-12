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
public class SidesActivity extends AppCompatActivity {
    Button buttonMisoSoupSmall;
    Button buttonMisoSoupLarge;
    Button buttonClearSoupSmall;
    Button buttonClearSoupLarge;
    Button buttonWontonSoupSmall;
    Button buttonWontonSoupLarge;
    Button buttonHotSourSoupSmall;
    Button buttonHotSourSoupLarge;
    Button buttonEggDropSoupSmall;
    Button buttonEggDropSoupLarge;
    Button buttonVegetableSoup;
    Button buttonOsakaNoodleSoup;
    Button buttonSeafoodSoup;
    Button buttonUdonSoup;
    Button buttonHouseSalad;
    Button buttonSeaweedSalad;
    Button buttonKaniSalad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sides);

        buttonMisoSoupSmall = findViewById(R.id.buttonMisoSoupSmall);
        CartItem misoSoupSmall = new CartItem("Small Miso Soup", 2.75);
        addItem(buttonMisoSoupSmall, misoSoupSmall);

        buttonMisoSoupLarge = findViewById(R.id.buttonMisoSoupLarge);
        CartItem misoSoupLarge = new CartItem("Large Miso Soup", 4.25);
        addItem(buttonMisoSoupLarge, misoSoupLarge);

        buttonClearSoupSmall = findViewById(R.id.buttonClearSoupSmall);
        CartItem clearSoupSmall = new CartItem("Small Clear Soup", 2.50);
        addItem(buttonClearSoupSmall, clearSoupSmall);

        buttonClearSoupLarge = findViewById(R.id.buttonClearSoupLarge);
        CartItem clearSoupLarge = new CartItem("Large Clear Soup", 3.50);
        addItem(buttonClearSoupLarge, clearSoupLarge);

        buttonWontonSoupSmall = findViewById(R.id.buttonWontonSoupSmall);
        CartItem wontonSoupSmall = new CartItem("Small Wonton Soup", 2.50);
        addItem(buttonWontonSoupSmall, wontonSoupSmall);

        buttonWontonSoupLarge = findViewById(R.id.buttonWontonSoupLarge);
        CartItem wontonSoupLarge = new CartItem("Large Wonton Soup", 3.50);
        addItem(buttonWontonSoupLarge, wontonSoupLarge);

        buttonHotSourSoupSmall = findViewById(R.id.buttonHotSourSoupSmall);
        CartItem hotSourSoupSmall = new CartItem("Small Hot & Sour Soup", 2.50);
        addItem(buttonHotSourSoupSmall, hotSourSoupSmall);

        buttonHotSourSoupLarge = findViewById(R.id.buttonHotSourSoupLarge);
        CartItem hotSourSoupLarge = new CartItem("Large Hot & Sour Soup", 3.75);
        addItem(buttonHotSourSoupLarge, hotSourSoupLarge);

        buttonEggDropSoupSmall = findViewById(R.id.buttonEggDropSoupSmall);
        CartItem eggDropSoupSmall = new CartItem("Small Egg Drop Soup", 2.50);
        addItem(buttonEggDropSoupSmall, eggDropSoupSmall);

        buttonEggDropSoupLarge = findViewById(R.id.buttonEggDropSoupLarge);
        CartItem eggDropSoupLarge = new CartItem("Large Egg Drop Soup", 3.50);
        addItem(buttonEggDropSoupLarge, eggDropSoupLarge);

        buttonVegetableSoup = findViewById(R.id.buttonVegetableSoup);
        CartItem vegetableSoup = new CartItem("Vegetable Soup", 4.95);
        addItem(buttonVegetableSoup, vegetableSoup);

        buttonOsakaNoodleSoup = findViewById(R.id.buttonOsakaNoodleSoup);
        CartItem osakaNoodleSoup = new CartItem("Osaka Noodle Soup", 8.95);
        addItem(buttonOsakaNoodleSoup, osakaNoodleSoup);

        buttonSeafoodSoup = findViewById(R.id.buttonSeafoodSoup);
        CartItem seafoodSoup = new CartItem("Seafood Soup", 7.95);
        addItem(buttonSeafoodSoup, seafoodSoup);

        buttonUdonSoup = findViewById(R.id.buttonUdonSoup);
        CartItem udonSoup = new CartItem("Udon Soup", 8.95);
        addItem(buttonUdonSoup, udonSoup);

        buttonHouseSalad = findViewById(R.id.buttonHouseSalad);
        CartItem houseSalad = new CartItem("House Salad", 2.50);
        addItem(buttonHouseSalad, houseSalad);

        buttonSeaweedSalad = findViewById(R.id.buttonSeaweedSalad);
        CartItem seaweedSalad = new CartItem("Seaweed Salad", 3.95);
        addItem(buttonSeaweedSalad, seaweedSalad);

        buttonKaniSalad = findViewById(R.id.buttonKaniSalad);
        CartItem kaniSalad = new CartItem("Kani Salad", 4.25);
        addItem(buttonKaniSalad, kaniSalad);
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

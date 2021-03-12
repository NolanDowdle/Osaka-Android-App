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
public class StartersActivity extends AppCompatActivity {

    Button buttonEggRoll;
    Button buttonVegetableSpringRoll;
    Button buttonShrimpSpringRoll;
    Button buttonThaiSpringRoll;
    Button buttonSpicyCrispyCrabSticks;
    Button buttonGyoza;
    Button buttonCrabRangoon;
    Button buttonEdamame;
    Button buttonChickenLettuceWrap;
    Button buttonSeafoodLettuceWrap;
    Button buttonSteamedDumplings;
    Button buttonChickenWings;
    Button buttonBuffaloWings;
    Button buttonFriedSoftShellCrab;
    Button buttonChickenOnAStick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        buttonEggRoll = findViewById(R.id.buttonEggRoll);
        CartItem eggRoll = new CartItem("Egg Roll", 1.75);
        addItem(buttonEggRoll, eggRoll);

        buttonVegetableSpringRoll = findViewById(R.id.buttonVegetableSpringRoll);
        CartItem vegetableSpringRoll = new CartItem("Vegetable Spring Roll", 1.75);
        addItem(buttonVegetableSpringRoll, vegetableSpringRoll);

        buttonShrimpSpringRoll = findViewById(R.id.buttonShrimpSpringRoll);
        CartItem shrimpSpringRoll = new CartItem("Shrimp Spring Roll", 1.75);
        addItem(buttonShrimpSpringRoll, shrimpSpringRoll);

        buttonThaiSpringRoll = findViewById(R.id.buttonThaiSpringRoll);
        CartItem thaiSpringRoll = new CartItem("Thai Spring Roll", 1.75);
        addItem(buttonThaiSpringRoll, thaiSpringRoll);

        buttonSpicyCrispyCrabSticks = findViewById(R.id.buttonSpicyCrispyCrabSticks);
        CartItem spicyCrispyCrabSticks = new CartItem("Spicy Crispy Crab Sticks", 4.95);
        addItem(buttonSpicyCrispyCrabSticks, spicyCrispyCrabSticks);

        buttonGyoza = findViewById(R.id.buttonGyoza);
        CartItem gyozaItem = new CartItem("Gyoza", 4.95);
        addItem(buttonGyoza, gyozaItem);

        buttonCrabRangoon = findViewById(R.id.buttonCrabRangoon);
        CartItem crabRangoons = new CartItem("Crab Rangoons", 4.50);
        addItem(buttonCrabRangoon, crabRangoons);

        buttonEdamame = findViewById(R.id.buttonEdamame);
        CartItem edamameItem = new CartItem("Edamame", 4.50);
        addItem(buttonEdamame, edamameItem);

        buttonChickenLettuceWrap = findViewById(R.id.buttonChickenLettuceWrap);
        CartItem chickenLettuceWrap = new CartItem("Chicken Lettuce Wrap", 7.95);
        addItem(buttonChickenLettuceWrap, chickenLettuceWrap);

        buttonSeafoodLettuceWrap = findViewById(R.id.buttonSeafoodLettuceWrap);
        CartItem seafoodLettuceWrap = new CartItem("Seafood Lettuce Wrap", 8.95);
        addItem(buttonSeafoodLettuceWrap, seafoodLettuceWrap);

        buttonSteamedDumplings = findViewById(R.id.buttonSteamedDumplings);
        CartItem steamedDumplings = new CartItem("Steamed Dumplings", 4.95);
        addItem(buttonSteamedDumplings, steamedDumplings);

        buttonChickenWings = findViewById(R.id.buttonChickenWings);
        CartItem chickenWings = new CartItem("Chicken Wings", 4.95);
        addItem(buttonChickenWings, chickenWings);

        buttonBuffaloWings = findViewById(R.id.buttonBuffaloWings);
        CartItem buffaloWings = new CartItem("Buffalo Wings", 5.45);
        addItem(buttonBuffaloWings, buffaloWings);

        buttonFriedSoftShellCrab = findViewById(R.id.buttonFriedSoftShellCrab);
        CartItem friedSoftShellCrab = new CartItem("Fried Soft Shell Crab", 9.95);
        addItem(buttonFriedSoftShellCrab, friedSoftShellCrab);

        buttonChickenOnAStick = findViewById(R.id.buttonChickenOnAStick);
        CartItem chickenOnAStick = new CartItem("Chicken On A Stick", 3.25);
        addItem(buttonChickenOnAStick, chickenOnAStick);
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

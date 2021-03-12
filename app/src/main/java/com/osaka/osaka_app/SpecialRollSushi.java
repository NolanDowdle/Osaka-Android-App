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
public class SpecialRollSushi extends AppCompatActivity {

    Button buttonBooneSpecialRoll;
    Button buttonMangoTangoRoll;
    Button buttonHotRoll;
    Button buttonDynamiteRoll;
    Button buttonSuperCrunchRoll;
    Button buttonSpicyCrabRoll;
    Button buttonDancingEelRoll;
    Button buttonCrispyTunaRoll;
    Button buttonCrispyBagelRoll;
    Button buttonCrispySalmonRoll;
    Button buttonTigerRoll;
    Button buttonRainbowRoll;
    Button buttonGoodPointRoll;
    Button buttonJeffersonRoll;
    Button buttonFireCrackerRoll;
    Button buttonRockShrimpRoll;
    Button buttonRockNRoll;
    Button buttonDragonRoll;
    Button buttonEmperorRoll;
    Button buttonSpicyShrimpRoll;
    Button buttonSpiderRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_roll_sushi);

        buttonBooneSpecialRoll = findViewById(R.id.buttonBooneSpecialRoll);
        CartItem booneSpecialRoll = new CartItem("Boone Special Roll", 9.95);
        addItem(buttonBooneSpecialRoll, booneSpecialRoll);

        buttonMangoTangoRoll = findViewById(R.id.buttonMangoTangoRoll);
        CartItem mangoTangoRoll = new CartItem("Mango Tango Roll", 10.50);
        addItem(buttonMangoTangoRoll, mangoTangoRoll);

        buttonHotRoll = findViewById(R.id.buttonHotRoll);
        CartItem hotRoll = new CartItem("Hot Roll", 9.95);
        addItem(buttonHotRoll, hotRoll);

        buttonDynamiteRoll = findViewById(R.id.buttonDynamiteRoll);
        CartItem dynamiteRoll = new CartItem("Dynamite Roll", 8.95);
        addItem(buttonDynamiteRoll, dynamiteRoll);

        buttonSuperCrunchRoll = findViewById(R.id.buttonSuperCrunchRoll);
        CartItem superCrunchRoll = new CartItem("Super Crunch Roll", 7.95);
        addItem(buttonSuperCrunchRoll, superCrunchRoll);

        buttonSpicyCrabRoll = findViewById(R.id.buttonSpicyCrabRoll);
        CartItem spicyCrabRoll = new CartItem("Spicy Crab Roll", 7.95);
        addItem(buttonSpicyCrabRoll, spicyCrabRoll);

        buttonDancingEelRoll = findViewById(R.id.buttonDancingEelRoll);
        CartItem dancingEelRoll = new CartItem("Dancing Eel Roll", 9.95);
        addItem(buttonDancingEelRoll, dancingEelRoll);

        buttonCrispyTunaRoll = findViewById(R.id.buttonCrispyTunaRoll);
        CartItem crispyTunaRoll = new CartItem("Crispy Tuna Roll", 9.95);
        addItem(buttonCrispyTunaRoll, crispyTunaRoll);

        buttonCrispyBagelRoll = findViewById(R.id.buttonCrispyBagelRoll);
        CartItem crispyBagelRoll = new CartItem("Crispy Bagel Roll", 8.95);
        addItem(buttonCrispyBagelRoll, crispyBagelRoll);

        buttonCrispySalmonRoll = findViewById(R.id.buttonCrispySalmonRoll);
        CartItem crispySalmonRoll = new CartItem("Crispy Salmon Roll", 10.95);
        addItem(buttonCrispySalmonRoll, crispySalmonRoll);

        buttonTigerRoll = findViewById(R.id.buttonTigerRoll);
        CartItem tigerRoll = new CartItem("Tiger Roll", 10.95);
        addItem(buttonTigerRoll, tigerRoll);

        buttonRainbowRoll = findViewById(R.id.buttonRainbowRoll);
        CartItem rainbowRoll = new CartItem("Rainbow Roll", 9.95);
        addItem(buttonRainbowRoll, rainbowRoll);

        buttonGoodPointRoll = findViewById(R.id.buttonGoodPointRoll);
        CartItem goodPointRoll = new CartItem("Good Point Roll", 10.95);
        addItem(buttonGoodPointRoll, goodPointRoll);

        buttonJeffersonRoll = findViewById(R.id.buttonJeffersonRoll);
        CartItem jeffersonRoll = new CartItem("Jefferson Roll", 9.95);
        addItem(buttonJeffersonRoll, jeffersonRoll);

        buttonFireCrackerRoll = findViewById(R.id.buttonFireCrackerRoll);
        CartItem fireCrackerRoll = new CartItem("Fire Cracker Roll", 12.95);
        addItem(buttonFireCrackerRoll, fireCrackerRoll);

        buttonRockShrimpRoll = findViewById(R.id.buttonRockShrimpRoll);
        CartItem rockShrimpRoll = new CartItem("Rock Shrimp Roll", 9.25);
        addItem(buttonRockShrimpRoll, rockShrimpRoll);

        buttonRockNRoll = findViewById(R.id.buttonRockNRoll);
        CartItem rockNRoll = new CartItem("Rock N Roll", 8.95);
        addItem(buttonRockNRoll, rockNRoll);

        buttonDragonRoll = findViewById(R.id.buttonDragonRoll);
        CartItem dragonRoll = new CartItem("Dragon Roll", 11.25);
        addItem(buttonDragonRoll, dragonRoll);

        buttonEmperorRoll = findViewById(R.id.buttonEmperorRoll);
        CartItem emperorRoll = new CartItem("Emperor Roll", 11.95);
        addItem(buttonEmperorRoll, emperorRoll);

        buttonSpicyShrimpRoll = findViewById(R.id.buttonSpicyShrimpRoll);
        CartItem spicyShrimpRoll = new CartItem("Spicy Shrimp Roll", 9.95);
        addItem(buttonSpicyShrimpRoll, spicyShrimpRoll);

        buttonSpiderRoll = findViewById(R.id.buttonSpiderRoll);
        CartItem spiderRoll = new CartItem("Spider Roll", 12.50);
        addItem(buttonSpiderRoll, spiderRoll);
    }

    CartItem item;
    public void addItem(Button button, CartItem item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CartItems.hasRoom()) {
                    setItem(item);
                    startActivityForResult(new Intent(view.getContext(), SushiSides.class), 1);
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
        item.setSides(SushiSides.returnSides());
        SushiSides.resetSides();
        CartItems.currentCart.add(item);
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}

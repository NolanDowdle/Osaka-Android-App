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
public class NigiriSushi extends AppCompatActivity {

    Button buttonCrabstickNigiri;
    Button buttonSalmonNigiri;
    Button buttonTunaNigiri;
    Button buttonShrimpNigiri;
    Button buttonEelNigiri;
    Button buttonMasagoNigiri;
    Button buttonYellowtailNigiri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nigiri_sushi);

        buttonCrabstickNigiri = findViewById(R.id.buttonCrabstickNigiri);
        CartItem crabstickNigiri = new CartItem("Crabstick Nigiri", 1.95);
        addItem(buttonCrabstickNigiri, crabstickNigiri);

        buttonSalmonNigiri = findViewById(R.id.buttonSalmonNigiri);
        CartItem salmonNigiri = new CartItem("Salmon Nigiri", 1.95);
        addItem(buttonSalmonNigiri, salmonNigiri);

        buttonTunaNigiri = findViewById(R.id.buttonTunaNigiri);
        CartItem tunaNigiri = new CartItem("Tuna Nigiri", 1.95);
        addItem(buttonTunaNigiri, tunaNigiri);

        buttonShrimpNigiri = findViewById(R.id.buttonShrimpNigiri);
        CartItem shrimpNigiri = new CartItem("Shrimp Nigiri", 1.95);
        addItem(buttonShrimpNigiri, shrimpNigiri);

        buttonEelNigiri = findViewById(R.id.buttonEelNigiri);
        CartItem eelNigiri = new CartItem("Eel Nigiri", 1.95);
        addItem(buttonEelNigiri, eelNigiri);

        buttonMasagoNigiri = findViewById(R.id.buttonMasagoNigiri);
        CartItem masagoNigiri = new CartItem("Masago Nigiri", 1.95);
        addItem(buttonMasagoNigiri, masagoNigiri);

        buttonYellowtailNigiri = findViewById(R.id.buttonYellowtailNigiri);
        CartItem yellowtailNigiri = new CartItem("Yellowtail Nigiri", 1.95);
        addItem(buttonYellowtailNigiri, yellowtailNigiri);

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

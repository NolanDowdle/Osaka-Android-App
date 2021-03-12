package com.osaka.osaka_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 * This is the main class that is activated when the app is opened. It has 3 buttons with onClick() functions
 * that allow the user to access the deeper depths of the app.
 */
public class MainActivity extends AppCompatActivity {

        private Button onlineButton;
        private Button locationButton;
        private Button viewCartButton;

    @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes the order online button
        onlineButton = findViewById(R.id.orderOnlineButton);
        onlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

        //this initializes and sets on click activity of location button
        locationButton = findViewById(R.id.locationButton);
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLocation();
            }
        });

        viewCartButton = findViewById(R.id.viewCartButton);
        Calendar calendar = Calendar.getInstance();

        TimeZone current = TimeZone.getTimeZone("EST");
        calendar.setTimeZone(current);

        if(calendar.getTime().getHours() >= 11 && calendar.getTime().getHours() < 22) {

        } else {
            viewCartButton.setText("Not Currently Taking Orders");
        }

        viewCartButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calendar.getTime().getHours() >= 11 && calendar.getTime().getHours() < 22) {
                    openCartView();
                } else {

                }

                //remove and add this line for testing the open cartview
                //openCartView();
            }
        }));

    }

    /*
    opens a new order online activity
     */
    public void openMenu() {
            startActivity(new Intent(this, Activity2.class));

    }

    /*
    opens a new location activity
*/
    public void openLocation() {
            startActivity(new Intent(this, LocationActivity.class));
    }

    public void openCartView() {
        startActivity(new Intent(this, CartView.class));
        CartView cartView = new CartView();
        //the updateCartButton currently isn't working because of the empty arrayList
        //cartView.updateButtons();
    }
}

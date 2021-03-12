package com.osaka.osaka_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.content.Context;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 * This class is used to navigate to which style food the user wants to eat. For example, sushi, dinner, or lunch.
 */
public class Activity2 extends AppCompatActivity {

    /*
    creating the buttons used in this activity
     */
    private Button starterButton;
    private Button lunchButton;
    private Button dinnerButton;
    private Button sushiButton;
    //private Button lomeinButton;
    private Button specialsButton;
    private Button glutenFreeButton;

    private Button checkoutButton;

    Context context;

    //this method is called when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //initializes the starters and sides button
        starterButton = findViewById(R.id.starterButton);
        starterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStarters();
            }
        });

        //initializes the lunch button
        lunchButton = findViewById(R.id.lunchButton);
        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();

                TimeZone current = TimeZone.getTimeZone("EST");
                calendar.setTimeZone(current);

                openLunch();
                /*
                //logic for finding if proper time to order lunch!
                if(calendar.getTime().getHours() >= 10 && calendar.getTime().getHours() < 16) {
                    //if hour is greater than 10am east, then enter here
                    if(calendar.getTime().getHours() == 10) {
                        //if equal to 10am east, check if its past the 30 minute mark
                        if(calendar.getTime().getMinutes() < 30) {
                            //if not past the 30 minute mark, print the time
                            lunchButton.setText("Lunch Is Currently Closed: " + calendar.getTime().getHours() + ":" + calendar.getTime().getMinutes());
                        } else {
                            //if past the 30 minute mark (10:30am) then open the lunch menu
                            openLunch();
                        }
                    } else if(calendar.getTime().getHours() == 3) {
                        //if it's 3:00pm EST, make sure that its before 3:30,
                        //because after 3:30 the lunch menu closes
                        if(calendar.getTime().getMinutes() < 30) {
                            //this if checks if its before 3:30
                            openLunch();
                        } else {
                            //if between 3:30 and 3:59pm print this text
                            lunchButton.setText("Lunch Is Currently Closed: " + calendar.getTime().getHours() + ":" + calendar.getTime().getMinutes());
                        }
                    } else {
                        //if later than 10am EST then open the lunch menu
                        openLunch();
                    }
                } else {
                    lunchButton.setText("Lunch Is Currently Closed: " + calendar.getTime().getHours() + ":" + calendar.getTime().getMinutes());
                }*/
            }
        });

        //initializes the dinner button
        dinnerButton = findViewById(R.id.dinnerButton);
        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDinner();
            }
        });

        //initializes the sushi button
        sushiButton = findViewById(R.id.sushiButton);
        sushiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSushi();
            }
        });

        //initializes the specials button
        specialsButton = findViewById(R.id.specialsButton);
        specialsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpecials();
            }
        });

        //initializes the Gluten Free and Low Glycemic button
        glutenFreeButton = findViewById(R.id.glutenFreeButton);
        glutenFreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGlutenFree();
            }
        });

        checkoutButton = findViewById(R.id.checkoutButton);
        Calendar calendar = Calendar.getInstance();

        TimeZone current = TimeZone.getTimeZone("EST");
        calendar.setTimeZone(current);

        if(calendar.getTime().getHours() >= 11 && calendar.getTime().getHours() < 22) {

        } else {
            checkoutButton.setText("Not Currently Taking Orders");
        }
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckout();

                /*if(calendar.getTime().getHours() >= 11 && calendar.getTime().getHours() < 22) {
                    openCheckout();
                } else {

                }*/
            }
        });
    }

    public void openStarters() {
        startActivity(new Intent(this, StartersSidesChoice.class));
    }

    public void openLunch() {
        startActivity(new Intent(this, LunchActivity2.class));
    }

    public void openDinner() {
        startActivity(new Intent(this, DinnerActivity.class));
    }

    public void openSushi() {
        startActivity(new Intent(this, SushiActivity.class));
    }

    public void openSpecials() {
        startActivity(new Intent(this, SpecialsActivity.class));
    }

    public void openGlutenFree() {
        startActivity(new Intent(this, GlutenGlycemicChoice.class));
    }

    public void openCheckout() {
        startActivity(new Intent(this, CartView.class));
    }
}

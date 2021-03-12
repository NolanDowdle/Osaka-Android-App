package com.osaka.osaka_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class CheckoutActivity extends AppCompatActivity implements View.OnClickListener {

    //Send button
    static Button buttonSend;
    private Button buttonOpenMaps;

    private EditText textName;
    private EditText textEmail;
    private EditText textPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        textName = findViewById(R.id.editTextName);
        textEmail = findViewById(R.id.editText2);
        textPhoneNumber = findViewById(R.id.editText3);

        buttonSend = (Button) findViewById(R.id.sendOrderButton);
        buttonOpenMaps = findViewById(R.id.openMapsCheckout);
        buttonOpenMaps.setVisibility(View.INVISIBLE);
        buttonOpenMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaps();
            }
        });

        //Adding click listener
        buttonSend.setOnClickListener(this);
    }


    private void sendEmail() {

        //ensures that all 3 text fields are filled out.
        if(textName.getText().toString().length() > 0) {

            //need to test if its real email
            if(textEmail.getText().toString().length() > 0) {

                //needs to test if its a real phone number
                if(textPhoneNumber.getText().toString().length() > 0) {


                    //Getting content for email
                    String email = "osakarestaurantboone@gmail.com";
                    String subject = "Android Order";
                    String message = makeString();

                    //Creating SendMail object
                    SendMail sm = new SendMail(this, email, subject, message);

                    //Executing sendmail to send email
                    sm.execute();

                    buttonOpenMaps.setVisibility(View.VISIBLE);

                    CartItems.currentCart.removeAll(CartItems.currentCart);

                } else {
                    Toast.makeText(this,"Needs Phone Number",Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this,"Needs email address",Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(this,"Needs a name",Toast.LENGTH_LONG).show();
        }
    }


    //create a string email message
    public String makeString() {
        String message = "";

        message = "Name: " + textName.getText().toString().trim() + "\n";
        message += "Email: " + textEmail.getText().toString().trim() + "\n";
        message += "Phone Number: " + textPhoneNumber.getText().toString().trim() + "\n\n";

        double totalPrice = 0.0;
        for(CartItem c: CartItems.currentCart) {
            //create a string email message
            message = message + c.getName() + " -- " + c.getPrice() + "\n" + c.getSides() + "\n";
            totalPrice += c.getPrice();
        }
        //include a tax of 7%
        //currently not using
        //totalPrice = totalPrice * 1.070;

        //ensure decimal places are 2 digits
        totalPrice = (totalPrice * 100);
        totalPrice = totalPrice + 0.5;
        totalPrice = (int) totalPrice;
        totalPrice = (double) totalPrice / 100.00;

        message = message + "Total Price before tax: $";
        String message2 = String.format(message + "%.2f", totalPrice);
        return message2;
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }

    public void openMaps() {
        startActivity(new Intent(this, MapsActivity.class));
    }
}
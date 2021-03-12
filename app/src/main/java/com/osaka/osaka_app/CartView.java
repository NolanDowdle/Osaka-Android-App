package com.osaka.osaka_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 * This class allows the user to see the objects they have in the cart, currently we do not offer
 * more than 15 items per user.
 */
public class CartView extends AppCompatActivity {

    double totalPrice;
    TextView totalPriceText;

    //buttons for all items in cart
    //the buttons only become visible when an item is added
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button buttonCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_view);

        //set the text and total price when the view cart button is pressed
        totalPriceText = findViewById(R.id.textViewTotalPrice);
        for(CartItem c: CartItems.currentCart) {
            //recursively add all cart items
            totalPrice = totalPrice + c.getPrice();
        }
        totalPrice = fixPriceDecimalPlaces(totalPrice);
        String message1 = "Tap the items to remove them\n from the cart!\n Total Price before tax: $";
        String message2 = String.format(message1 + "%.2f", totalPrice);

        totalPriceText.setText(message2);

        initializeButtons();
        updateButtons();
    }

    /*
    ensures price shown is only 2 decimal places
     */
    public double fixPriceDecimalPlaces(double totalPrice) {
        totalPrice = (totalPrice * 100);
        totalPrice = totalPrice + 0.5;
        totalPrice = (int) totalPrice;
        totalPrice = totalPrice / 100.00;
        return totalPrice;
    }

    /*
    initializes all button functions in checkout view activity
     */
    public void initializeButtons() {
        button0 = findViewById(R.id.cartButton0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if clicked on and the button is shown, make it invisible
                if(button0.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(0).getPrice();
                    //ensures price shown is only 2 decimal places
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(0);
                }
            }
        });
        button1 = findViewById(R.id.cartButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(1).getPrice();
                    //ensures price shown is only 2 decimal places
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(1);
                }
            }
        });
        button2 = findViewById(R.id.cartButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(2).getPrice();
                    //ensures price shown is only 2 decimal places
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(2);
                }
            }
        });
        button3 = findViewById(R.id.cartButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(3).getPrice();
                    //ensures money shown is only 2 decimal places
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(3);
                }
            }
        });
        button4 = findViewById(R.id.cartButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button4.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(4).getPrice();
                    //ensures money shown is only 2 decimal places
                    totalPrice = fixPriceDecimalPlaces(totalPrice);

                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(4);
                }
            }
        });
        button5 = findViewById(R.id.cartButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button5.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(5).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(5);
                }
            }
        });
        button6 = findViewById(R.id.cartButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button6.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(6).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(6);
                }
            }
        });
        button7 = findViewById(R.id.cartButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button7.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(7).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(7);
                }
            }
        });

        button8 = findViewById(R.id.cartButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button8.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(8).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(8);
                }
            }
        });

        button9 = findViewById(R.id.cartButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button9.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(9).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(9);
                }
            }
        });

        button10 = findViewById(R.id.cartButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button10.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(10).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(10);
                }
            }
        });

        button11 = findViewById(R.id.cartButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button11.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(11).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(11);
                }
            }
        });

        button12 = findViewById(R.id.cartButton12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button12.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(12).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(12);
                }
            }
        });

        button13 = findViewById(R.id.cartButton13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button13.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(13).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(13);
                }
            }
        });

        button14 = findViewById(R.id.cartButton14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button14.isShown()) {
                    totalPrice = totalPrice - CartItems.currentCart.get(14).getPrice();
                    totalPrice = fixPriceDecimalPlaces(totalPrice);
                    totalPriceText.setText("Tap the items to remove them\n from the cart!\n Total Price: $" + totalPrice);
                    moveButtons(14);
                }
            }
        });

        buttonCheckout = findViewById(R.id.checkoutButtonCartView);
        buttonCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckout();
            }
        });

    }

    /*
    moves buttons below the pressed button
     up whenever a button is pressed to be removed from the cart
     */
    public void moveButtons(int buttonNumber) {
        //remove item from the CartItems.currentCart arraylist
        CartItems.currentCart.remove(buttonNumber);

        if(buttonNumber == 0) {
            if(CartItems.currentCart.size() == 0) {
                button0.setVisibility(View.INVISIBLE);
                buttonCheckout.setVisibility(View.INVISIBLE);

            } else if (CartItems.currentCart.size() == 1){
                //change text of button 0 to button 1
                button0.setText(button1.getText());
                //set button 1 to invisible
                button1.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 2) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 3) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());

                button3.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 4) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());

                button4.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 5) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());

                button5.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 6) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());

                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size()  == 7) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button0.setText(button1.getText());
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }
            //button 1
        } else if (buttonNumber == 1) {
            if(CartItems.currentCart.size() == 1) {
                button1.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 2) {
                button1.setText(button2.getText());

                button2.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 3) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());

                button3.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 4) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());

                button4.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 5) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());

                button5.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 6) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());

                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 7) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button1.setText(button2.getText());
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }
            //button 2
        } else if (buttonNumber == 2) {
            if(CartItems.currentCart.size() == 2) {
                button2.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 3) {
                button2.setText(button3.getText());

                button3.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 4) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());

                button4.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 5) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());

                button5.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 6) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());

                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 7) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button2.setText(button3.getText());
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

            //button 3
        } else if (buttonNumber == 3) {
            if(CartItems.currentCart.size() == 3) {
                button3.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 4) {
                button3.setText(button4.getText());

                button4.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 5) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());

                button5.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 6) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());

                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 7) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button3.setText(button4.getText());
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

            //button 4
        } else if (buttonNumber == 4) {
            if(CartItems.currentCart.size() == 4) {
                button4.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 5) {
                button4.setText(button5.getText());

                button5.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 6) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());

                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 7) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button4.setText(button5.getText());
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

            //button 5
        } else if (buttonNumber == 5) {
            if(CartItems.currentCart.size() == 5) {
                button5.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 6) {
                button5.setText(button6.getText());

                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 7) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button5.setText(button6.getText());
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

            //button 6
        } else if (buttonNumber == 6) {
            if(CartItems.currentCart.size() == 6) {
                button6.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 7) {
                button6.setText(button7.getText());

                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());

                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());

                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());

                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button6.setText(button7.getText());
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

            //button 7
        } else if (buttonNumber == 7) {
            if(CartItems.currentCart.size() == 7) {
                button7.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 8) {
                button7.setText(button8.getText());
                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button7.setText(button8.getText());
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());
                button14.setVisibility(View.INVISIBLE);
            }
        } else if (buttonNumber == 8) {
            if(CartItems.currentCart.size() == 8) {
                button8.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 9) {
                button8.setText(button9.getText());
                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button8.setText(button9.getText());
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());
                button14.setVisibility(View.INVISIBLE);
            }

        } else if (buttonNumber == 9) {
            if(CartItems.currentCart.size() == 9) {
                button9.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 10) {
                button9.setText(button10.getText());
                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button9.setText(button10.getText());
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

        } else if (buttonNumber == 10) {
            if(CartItems.currentCart.size() == 10) {
                button10.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 11) {
                button10.setText(button11.getText());

                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button10.setText(button11.getText());
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button10.setText(button11.getText());
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

        } else if (buttonNumber == 11) {
            if(CartItems.currentCart.size() == 11) {
                button11.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 12) {
                button11.setText(button12.getText());

                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button11.setText(button12.getText());
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button11.setText(button12.getText());
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

        } else if (buttonNumber == 12) {
            if(CartItems.currentCart.size() == 12) {
                button12.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 13) {
                button12.setText(button13.getText());

                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button12.setText(button13.getText());
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

        } else if (buttonNumber == 13) {
            if(CartItems.currentCart.size() == 13) {
                button13.setVisibility(View.INVISIBLE);
            } else if (CartItems.currentCart.size() == 14) {
                button13.setText(button14.getText());

                button14.setVisibility(View.INVISIBLE);
            }

        } else if (buttonNumber == 14) {
            button14.setVisibility(View.INVISIBLE);
        }
    }

    public void updateButtons() {
        if(!button0.isShown() && (CartItems.currentCart.size() > 0)) {
            button0.setVisibility(View.VISIBLE);
            button0.setText(CartItems.currentCart.get(0).getName());

            //if we have 1 item in cart, then make buttonCheckout visible
            buttonCheckout.setVisibility(View.VISIBLE);

        }
        if (!button1.isShown() && (CartItems.currentCart.size() > 1)) {
            button1.setVisibility(View.VISIBLE);
            button1.setText(CartItems.currentCart.get(1).getName());
        }
        if (!button2.isShown() && (CartItems.currentCart.size() > 2)) {
            button2.setVisibility(View.VISIBLE);
            button2.setText(CartItems.currentCart.get(2).getName());
        }
        if (!button3.isShown() && (CartItems.currentCart.size() > 3)) {
            button3.setVisibility(View.VISIBLE);
            button3.setText(CartItems.currentCart.get(3).getName());
        }
        if (!button4.isShown() && (CartItems.currentCart.size() > 4)) {
            button4.setVisibility(View.VISIBLE);
            button4.setText(CartItems.currentCart.get(4).getName());
        }
        if (!button5.isShown() && (CartItems.currentCart.size() > 5)) {
            button5.setVisibility(View.VISIBLE);
            button5.setText(CartItems.currentCart.get(5).getName());
        }

        if (!button6.isShown() && (CartItems.currentCart.size() > 6)) {
            button6.setVisibility(View.VISIBLE);
            button6.setText(CartItems.currentCart.get(6).getName());
        }

        if (!button7.isShown() && (CartItems.currentCart.size() > 7)) {
            button7.setVisibility(View.VISIBLE);
            button7.setText(CartItems.currentCart.get(7).getName());
        }

        if (!button8.isShown() && (CartItems.currentCart.size() > 8)) {
            button8.setVisibility(View.VISIBLE);
            button8.setText(CartItems.currentCart.get(8).getName());
        }

        if (!button9.isShown() && (CartItems.currentCart.size() > 9)) {
            button9.setVisibility(View.VISIBLE);
            button9.setText(CartItems.currentCart.get(9).getName());
        }

        if (!button10.isShown() && (CartItems.currentCart.size() > 10)) {
            button10.setVisibility(View.VISIBLE);
            button10.setText(CartItems.currentCart.get(10).getName());
        }

        if (!button11.isShown() && (CartItems.currentCart.size() > 11)) {
            button11.setVisibility(View.VISIBLE);
            button11.setText(CartItems.currentCart.get(11).getName());
        }

        if (!button12.isShown() && (CartItems.currentCart.size() > 12)) {
            button12.setVisibility(View.VISIBLE);
            button12.setText(CartItems.currentCart.get(12).getName());
        }

        if (!button13.isShown() && (CartItems.currentCart.size() > 13)) {
            button13.setVisibility(View.VISIBLE);
            button13.setText(CartItems.currentCart.get(13).getName());
        }

        if (!button14.isShown() && (CartItems.currentCart.size() > 14)) {
            button14.setVisibility(View.VISIBLE);
            button14.setText(CartItems.currentCart.get(14).getName());
        }
    }

    public void openCheckout() {
        finish();
        startActivity(new Intent(this, CheckoutActivity.class));
    }
}

package com.osaka.osaka_app;

import java.util.ArrayList;
import java.util.List;

import java.sql.Statement;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 * This class holds a list of CartItem objects.
 */
public class CartItems {
    public static List<CartItem> currentCart = new ArrayList<CartItem>(10);
    ConnectToDB dbAccess;
    Statement stmt;
    private double totalPriceTax;
    private double totalPriceNoTax;

    public CartItems() {
        dbAccess = new ConnectToDB();
        totalPriceTax = 0.00;
        totalPriceNoTax = 0.00;
    }

   /* public double getTotalPrice() {
        for(CartItem c: CartItems.currentCart) {
            totalPriceNoTax += c.getPrice();
        }
        //include a tax of 7%
        totalPriceTax = totalPriceNoTax * 1.065;

        //ensure decimal places are 2 digits
        totalPriceTax = (totalPriceTax * 100);
        totalPriceTax = (int) totalPriceTax;
        totalPriceTax = (double) totalPriceTax / 100.00;

        return totalPriceTax;
    }*/


    public List<CartItem> getCartItem() {
        return currentCart;
    }

    public void addItemToCart(CartItem item) {
        currentCart.add(item);
    }

    public CartItem removeItemFromCart(CartItem item) {
        currentCart.remove(item);
        return item;
    }

    /*
    checks if currentCart has reached maxed capacity
    if not full, return true
     */
    public static boolean hasRoom() {
        if(currentCart.size() < 15) {
            return true;
        } else {
            //portray message that cart is full
            return false;
        }
    }

}

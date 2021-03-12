package com.osaka.osaka_app;

import java.util.Objects;

/**
*Date: March 7, 2020
*Author: Nolan Dowdle
* this class represents an item to put in the shopping cart
* and gives each item its own individual hashcode
 */
public class CartItem {
    //private Integer pid;
    private String name;
    private double price;
    private String sides;

    public CartItem() {

    }

    public CartItem(String name, double price) {
        //this.pid = pid;
        this.name = name;
        this.price = price;
        this.sides = "no sides";
    }

    /*public Integer getPid() {
        return pid;
    }*/

    /*public void setPid(Integer pid) {
        this.pid = pid;
    }*/

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSides() {
        return this.sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        //hash = hash + Objects.hashCode(this.pid);
        hash = hash + Objects.hashCode(this.name);
        hash = hash + Objects.hashCode(this.price);
        hash = hash + Objects.hashCode(this.sides);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final CartItem other = (CartItem) obj;
        /*if(!Objects.equals(this.pid, other.pid)) {
            return false;
        }*/
        if(!Objects.equals(this.price, other.price)) {
            return false;
        }
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}

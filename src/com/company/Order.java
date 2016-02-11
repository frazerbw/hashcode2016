package com.company;

import java.util.ArrayList;

/**
 * Created by tomas on 11/02/16.
 */
public class Order {
    private ArrayList<Product> items;
    private Point deliveryAddress;
    private boolean fulfilled;

    public Order(ArrayList<Product> items, Point deliveryAddress) {
        this.items = items;
        this.deliveryAddress = deliveryAddress;
        this.fulfilled = false;
    }

    public Point getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setFulfilled() {
        this.fulfilled = true;
    }
}

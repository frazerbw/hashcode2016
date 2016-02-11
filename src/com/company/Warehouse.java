package com.company;

import java.util.ArrayList;

/**
 * Created by tomas on 11/02/16.
 */
public class Warehouse {
    private Point location;
    private ArrayList<Product> stock;

    public Warehouse(Point location, ArrayList<Product> stock) {
        this.location = location;
        this.stock = stock;
    }

    public Point getLocation() {
        return location;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }
}

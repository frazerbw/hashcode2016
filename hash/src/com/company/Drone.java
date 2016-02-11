package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tomas on 11/02/16.
 */
public class Drone {

    private Point location;
    private int MAX_PAYLOAD;
    ArrayList<Product> payload;

    public Drone(Point location, int MAX_PAYLOAD) {
        this.location = location;
        this.MAX_PAYLOAD = MAX_PAYLOAD;
        this.payload = new ArrayList<Product>();
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getMAX_PAYLOAD() {
        return MAX_PAYLOAD;
    }

    public int getCurrentWeight() {
        int weight = 0;
        for (Iterator<Product> i = payload.iterator(); i.hasNext();) {
            Product p = i.next();
            weight = weight + p.getWeight();
        }
        return weight;
    }

    public void load(ArrayList<Product> products) {
        //load stuff in from warehouse
    }

    public void deliver() {
        //drop stuff off at house
    }

}

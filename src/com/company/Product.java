package com.company;

/**
 * Created by tomas on 11/02/16.
 */
public class Product {

    private int weight;
    private int ID;

    public Product(int weight, int ID) {
        this.weight = weight;
        this.ID = ID;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

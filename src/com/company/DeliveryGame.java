package com.company;

import java.util.ArrayList;

/**
 * Created by frazer on 11/02/16.
 */
public class DeliveryGame {

    private ArrayList<Warehouse> warehouses = new ArrayList<>();
    private ArrayList<Drone> drones = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public DeliveryGame() {
        ReadData reader = new ReadData("data.in");
        warehouses = reader.getWarehouses();

        int numOfDrones = reader.getParams().get(2);
        for (int i = 0; i < numOfDrones; i++) {
            drones.add(new Drone(warehouses.get(0).getLocation(), reader.getParams().get(4)));
        }

        ArrayList<Integer> weights = reader.getWeights();
        int productId = 0;

        for (int weight : weights) {
            products.add(new Product(weight, productId));
            productId ++;
        }

        orders = reader.getOrders();
    }

    private void nextTurn() {

    }

    public static void main(String[] args) {
        new DeliveryGame();
    }


}

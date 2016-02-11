package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
	// Variables definition
	private ArrayList<Integer> simParams = new ArrayList<Integer>();
	private ArrayList<Integer> weights = new ArrayList<Integer>();
	private ArrayList<Warehouse> wareHouses = new ArrayList<Warehouse>();
	private ArrayList<Order> orders = new ArrayList<Order>();
	public ReadData(String path) {		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			int i = 0;
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				switch(i) { 
					case 0:
						// Read parameters of simulation
						String[] params = sCurrentLine.split("\\W+");
						for(int x=0;x<params.length;x++)
							simParams.add(Integer.parseInt(params[x]));
						System.out.println(simParams);
						break;
					case 2:
						// Read weights of the products
						String[] parWeight = sCurrentLine.split("\\W+");
						for(int x=0;x<parWeight.length;x++)
							weights.add(Integer.parseInt(parWeight[x]));
						System.out.println(weights);
						break;
					case 3:
						// Read warehouses and their stock
						int numWarehouses = Integer.parseInt(sCurrentLine);
						for (int x=0;x<numWarehouses;x++) {
							// Read coordinates of the warehouse
							sCurrentLine = br.readLine();
							String[] coor = sCurrentLine.split("\\W+");							
							Point point = new Point(Integer.parseInt(coor[0]), Integer.parseInt(coor[1]));
							
							// Read the stock of the warehouse
							sCurrentLine = br.readLine();
							String[] stock = sCurrentLine.split("\\W+");
							ArrayList<Product> products = new ArrayList<>();
							for(int j=0;j<stock.length;j++)
								products.add(new Product(Integer.parseInt(stock[j]), j));							
							
							// Add warehouse to ArrayList
							Warehouse house = new Warehouse(point, products);
							wareHouses.add(house);
						}
						break;
					case 4:
						// Read customer orders
						int numOrders = Integer.parseInt(sCurrentLine);
						for (int x=0;x<numOrders;x++) {
							// Read coordinates of the client
							sCurrentLine = br.readLine();
							String[] coor = sCurrentLine.split("\\W+");							
							Point point = new Point(Integer.parseInt(coor[0]), Integer.parseInt(coor[1]));
							// Read amount of items in the order
							sCurrentLine = br.readLine();
							
							// Read the goods for order
							sCurrentLine = br.readLine();
							String[] stock = sCurrentLine.split("\\W+");
							ArrayList<Product> products = new ArrayList<>();
							for(int j=0;j<stock.length;j++)
								products.add(new Product(Integer.parseInt(stock[j]), j));							
							
							// Add order to ArrayList
							Order order = new Order(products, point);
							orders.add(order);
						}
						break;
				}
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public ArrayList<Integer> getParams() {
		return this.simParams;
	}
	public ArrayList<Integer> getWeights() {
		return this.weights;
	}
	public ArrayList<Warehouse> getWarehouses() {
		return this.wareHouses;
	}
	public ArrayList<Order> getOrders() {
		return this.orders;
	}
	
	public static void main(String[] args) {
		ReadData data = new ReadData("/Users/mishamolotkov/Documents/workspace/Challenge/src/data.in");
		System.out.println(data.getOrders());
	}
}
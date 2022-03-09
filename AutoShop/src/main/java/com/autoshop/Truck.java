package com.autoshop;


/**
 *  Created Class truck which extends class Car
 *  Used Inheritance and Method overloading 
 *  @author Asus
 *
 */
public class Truck extends Car {

	int weight;
	double amount;
	
	/**
	 * Parameterized Constructor of super class "Car" and sub class "Truck" 
	 * @param speed - assign speed of truck
	 * @param regulerPrice - price of truck
	 * @param color - color of truck
	 * @param weight - weight of truck
	 */
	public Truck(int speed, double regulerPrice, String color, int weight) {
		super(speed, regulerPrice, color);
		this.weight = weight;
	}
	
	/**
	 * Method getSalePrice to calculate discount according to trucks weight
	 * if weight is more than 2000 then discount is 10 %
	 * else if weight is less than 2000 then discount is 20 %
	 */
	public double getSalePrice() {
		double salePrice , discount;
		if(weight > 2000) {
			System.out.println("\nWeight of truck is more than 2000 so 10% discount");
			discount = regulerPrice * 10 / 100;
			System.out.println("Total Discount is : " +discount);
		}else {
			System.out.println("\nweight of truck is less than 2000 so 20% discount");
			discount = regulerPrice * 20 / 100;
			System.out.println("Total Discount is : " +discount);
		}
		/**
		 * calculate sale price without discount
		 */
		salePrice = regulerPrice - discount;
		return salePrice;
	}

}

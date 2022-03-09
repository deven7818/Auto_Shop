package com.autoshop;

/**
 * Created Class Ford which extends superclass Car
 * Created variables year and manufacturerDiscount
 */
public class Ford extends Car {
	
	int year;
	int manufacturerDiscount;

	/**
	 * Parameterized Constructor of super class "Car" and sub class "Ford" 
	 * @param speed - To assign speed of the ford
	 * @param regulerPrice - Regular Price of the Ford
	 * @param color - Color Of the ford
	 * @param year -Year of manufacture of the ford
	 * @param manufacturerDiscount - manufacturer discount to regular price 
	 */
	public Ford(int speed, double regulerPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regulerPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		
	}
	
	/**
	 * get regular price after Subtraction of  manufacturerDiscount
	 */
	
	public double getSalePrice() {
		return regulerPrice - regulerPrice * (manufacturerDiscount / 100.0);
	}

}

package com.autoshop;

/**
 * Created Class Sedan which extends superclass Car
 * Created variables length 
 */
public class Sedan extends Car{

	int length;


	/**
	 *  Parameterized constructor
	 * @param speed  - speed of the sedan
	 * @param regularPrice - price of the sedan
	 * @param color - color of the sedan
	 * @param length - length to calculate the price
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;

	}
	
	/**
	 * Method to return sale price calculating discount
	 * 
	 *  if length is more than 20 feet then discount is 5%
	 *  else discount is 10%
	 */
	public double getSalePrice() {
		double salePrice, discount;
		
		if(length > 20) {
			System.out.println("Length of Sedan is greater than 20 feet discount is 5% ");
			discount = regulerPrice * 5 /100;
			System.out.println("Discount of Sedan with length more than 20 feet "+discount);
		} else {
			System.out.println("Length is less than 20 feet so discount is 10 % ");
			discount = regulerPrice * 10 / 100;
			System.out.println("Discount of Sedan with length less than 20 feet "+discount);
		}
		
		salePrice = regulerPrice - discount;
		return salePrice;
	}
}

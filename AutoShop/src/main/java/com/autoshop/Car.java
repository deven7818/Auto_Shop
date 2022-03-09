package com.autoshop;

public class Car {

	/**
	 * Super class car with variables speed , regulerPrice and color
	 * Created Parameterized Constructor
	 */
	private int speed;
	protected double regulerPrice;
	private String color;
	
	
	/**
	 * Parameterized Constructor
	 * @param speed - speed of the car
	 * @param regulerPrice - price of the car
	 * @param color - color of the car
	 */
	public Car(int speed, double regulerPrice, String color) {
		this.speed = speed;
		this.regulerPrice = regulerPrice;
		this.color = color;
	}
	
	/**
	 * @return - regular Price
	 */
	public double getSalePrice() {
		return regulerPrice;
	}

}

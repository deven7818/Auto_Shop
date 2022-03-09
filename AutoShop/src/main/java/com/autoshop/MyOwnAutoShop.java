package com.autoshop;

/**
 * PROCEDURE
 * 1. Creating My own Car Shop 
 * 2. Calculating discount of sedan car according to length
 * 3. Calculating sale price of Ford from sale price capture from car class subtracting from manufacture discount
 * 4. Calculating car price
 * 5. Calculating Truck price according to weight
 */
public class MyOwnAutoShop
{
    public static void main( String[] args )
    {
    	/*
    	 * Discount calculation of sedan car
    	 */
    	System.out.println("Discount of Sedan according to length\n");
    	/*
    	 * when length is more than 20 feet then 5% discount.
    	 */
    	Sedan sedan1 = new Sedan(80, 10000, "Black", 25);
    	System.out.println("Price of Sedan car with length More than 20 feet is  : " +sedan1.getSalePrice()+"\n");
    	
    	/*
    	 * when length is less than 20 feet then 10% discount.
    	 */
    	Sedan sedan2 = new Sedan(100, 10000, "Red", 8);
    	System.out.println("Price of Sedan car with length less than 20 feet is : " +sedan2.getSalePrice()+"\n");
    	
    	
    	
    	/*
    	 * From the sale price computed from Car class,manufacturer Discount of ford
    	 */
    	System.out.println("Manufacturer discount of Ford");
		
    	Ford ford1 = new Ford(120, 8000, "Red", 2015, 10);
    	System.out.println(ford1.manufacturerDiscount + "% is the manufacturer discount on price " +ford1.regulerPrice);
    	System.out.println("Price of Ford Car is "+ford1.getSalePrice());

    	Ford ford2 = new Ford(150, 10000, "Blue", 2016, 20);
    	System.out.println(ford2.manufacturerDiscount + "% is the manufacturer discount on price " +ford2.regulerPrice);
    	System.out.println("Price of Ford Car is "+ford2.getSalePrice());



    	/*
    	 * Car price 
    	 */
		System.out.println("\nSale price of Car");

		Car car = new Car(100, 20000, "MatBlack");
		System.out.println("Car Price: " + car.getSalePrice());
		
		/*
		 * price of truck according to weight
		 */
		System.out.println("\nPrice of truck According to discount");
		/*
		 * Truck price when weight is more than 2000 discount is 10%
 		 */
		Truck truck1 = new Truck(70, 7000, "Orange" , 2200);
		System.out.println("Price of truck when weight is more than 2000 is :" +truck1.getSalePrice());
		
		/*
		 * Truck price when weight is less than 2000 discount is 5%
 		 */
		Truck truck2 = new Truck(80, 8000, "Purple" , 1500);
		System.out.println("Price of truck when weight is less than 2000 is :" +truck2.getSalePrice());
		
    }
}

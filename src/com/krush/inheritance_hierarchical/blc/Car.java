package com.krush.inheritance_hierarchical.blc;

public class Car extends Vehicle
{
           protected int noOfDoors;
       
           
public Car(String make, String model, int year, int numberOfDoors)
{   
	 super(make,model,year);
	  if(numberOfDoors<0) {
			System.err.println("Error Invalid Input");
			   System.exit(0);
		    }
	 noOfDoors=numberOfDoors;
	 


}
public void displayDetails() {
	super.displayDetails();
	System.out.println("Number of Doors: "+this.noOfDoors);
	
}


}

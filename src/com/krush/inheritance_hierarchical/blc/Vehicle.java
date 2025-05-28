package com.krush.inheritance_hierarchical.blc;

public class Vehicle {
	protected String make,model;
	protected int year;
	
	public Vehicle(String make, String model, int year) {
		 super(); //its call the object class constructor
		  if(year<0) {
				System.err.println("Error Invalid Input");
				   System.exit(0);
			    }
		 this.make=make; //here this keyword are differentiate the non static variable inside the object.
		 this.model=model;
		 this.year=year;
		 
	}
	
	public void displayDetails()   
	{
		   System.out.println("Bike Details:"+'\n'+"Make: "+this.make+'\n'+"Model: "+this.model+'\n'+"Year: "+this.year);
		
	}
	
	
	
	
	

}

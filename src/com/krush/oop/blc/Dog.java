package com.krush.oop.blc;

public class Dog
{

	    private String dogName;
	    private int dogAge;
	    private String dogColor;
	    private double dogHeight;
		public Dog(String dogName, int dogAge, String dogColor, double dogHeight)
		{
			super();
			//Validation 
			if(dogAge<=0 && dogHeight<=0) {
				System.err.println("Invalid Input ");
				System.exit(0);
				
			}
			//Non Static Filed initialization
			this.dogName = dogName;
			this.dogAge = dogAge;
			this.dogColor = dogColor;
			this.dogHeight = dogHeight;
		}
		@Override
		public String toString() {
			return "Dog [dogName=" + dogName + ", dogAge=" + dogAge + ", dogColor=" + dogColor + ", dogHeight="
					+ dogHeight + "]";
		}
	    
	    
	    
}

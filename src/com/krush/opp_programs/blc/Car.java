package com.krush.opp_programs.blc;

public class Car {
	
	
	private String carCompany;
	private String carModel;
	private String carColor;
	private int year;
	private double carPrice;
	private  boolean isSport;
	private boolean withAirBags;
	public Car(String carCompany, String carModel, String carColor, int year, double carPrice, boolean isSport,
			boolean withAirBags) {
		
		
		
		super();
		
		
		if(year <=2010) {
			System.err.println("year must be greater than 2010");
			System.exit(0);
			
		}
		
		if(carPrice <0) {
			System.err.println("Price must be positive integer");
			System.exit(0);
			
		}
	
		
		this.carCompany = carCompany;
		this.carModel = carModel;
		this.carColor = carColor;
		this.year = year;
		this.carPrice = carPrice;
		this.isSport = isSport;
		this.withAirBags = withAirBags;
		return;
	}
	@Override
	public String toString()
	{
		return "Car [carCompany=" + carCompany + ", carModel=" + carModel + ", carColor=" + carColor + ", year=" + year
				+ ", carPrice=" + carPrice + ", isSport=" + isSport + ", withAirBags=" + withAirBags + "]";
	}
	
	
	
	
	

}

package com.krush.inheritance_hierarchical.blc;

public class Ticket {
 
	private String eventName;
	 
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName,int seatNumber,double price)
	{
		this.eventName= eventName;
		this.seatNumber=seatNumber;
		this.price=price;
	}
	
	public void setEventName(String eventName) {
		this.eventName=eventName;
		
	}
	public void setPrice(double price) {
		this.price=price;
		
	}
	public String getEventName() {
		return this.eventName;
		
	}
	public double getPrice() {
		return this.price;
		
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}
